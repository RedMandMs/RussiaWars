package com.thebestleticompany.russianwars.settings.secure;

import com.thebestleticompany.russianwars.settings.secure.authentification.LoginSuccessHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.kerberos.web.authentication.SpnegoAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.thebestleticompany.russianwars.domain.user.Permission;
import com.thebestleticompany.russianwars.services.user.CurrentUserDetailsService;
import com.thebestleticompany.russianwars.settings.secure.authentification.CustomSpnegoAuthFailureHandler;
import com.thebestleticompany.russianwars.settings.secure.authentification.LogoutSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * @author Vilgodskiy Sergey on 25.07.2016.
 */
@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true)
@ComponentScan("com.thebestleticompany.russianwars")
public class SecureConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private CurrentUserDetailsService userDetailsService;

    @Autowired
    private LogoutSuccessHandler logoutSuccessHandler;

    @Autowired
    private LoginSuccessHandler loginSuccessHandler;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.authenticationProvider(authenticationProvider(userDetailsService));
    }

    @Override
    protected void configure(final HttpSecurity http) throws Exception {

        // @formatter:off
        http
                .authorizeRequests()
                    .antMatchers("adminPage").hasAuthority(Permission.SIMPLE_3.name())
                    .and()
                    .logout()
                    .logoutUrl("/logout")
                    .deleteCookies("remember-me")
                    .logoutSuccessUrl("/")
                    .logoutSuccessHandler(logoutSuccessHandler) //обработчик, который вызывается после успешной выхода
                    .permitAll()
                    .and()
                    .addFilterBefore(
                            spnegoAuthenticationProcessingFilter(authenticationManager()),
                            BasicAuthenticationFilter.class)
                    .addFilterAfter(
                            usernamePasswordAuthenticationFilter(authenticationManager()),
                            SpnegoAuthenticationProcessingFilter.class)
                    .rememberMe();
        // @formatter:on
    }

    public AuthenticationProvider authenticationProvider(
        UserDetailsService userDetailsService) {
        DaoAuthenticationProvider daoAuthenticationProvider = new DaoAuthenticationProvider();
        daoAuthenticationProvider.setPasswordEncoder(new BCryptPasswordEncoder());
        daoAuthenticationProvider.setUserDetailsService(userDetailsService);
        return daoAuthenticationProvider;
    }

    public SpnegoAuthenticationProcessingFilter spnegoAuthenticationProcessingFilter(
        AuthenticationManager authenticationManager) {
        SpnegoAuthenticationProcessingFilter filter = new SpnegoAuthenticationProcessingFilter();
        filter.setAuthenticationManager(authenticationManager);
        filter.setFailureHandler(new CustomSpnegoAuthFailureHandler());
        return filter;
    }

    UsernamePasswordAuthenticationFilter usernamePasswordAuthenticationFilter(
            AuthenticationManager authenticationManager) {
        UsernamePasswordAuthenticationFilter filter = new UsernamePasswordAuthenticationFilter();
        filter.setAuthenticationManager(authenticationManager);
        filter.setUsernameParameter("logonName");
        filter.setAuthenticationSuccessHandler(loginSuccessHandler);
        filter.setRequiresAuthenticationRequestMatcher(
                new AntPathRequestMatcher("/login", "POST"));
        return filter;
    }
}
