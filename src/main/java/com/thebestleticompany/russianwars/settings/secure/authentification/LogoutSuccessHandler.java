package com.thebestleticompany.russianwars.settings.secure.authentification;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.stereotype.Component;

/**
 * Обработчик удачного выхода из системы
 */
@Component
public class LogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {

    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response,
        Authentication authentication) throws IOException, ServletException {
        super.onLogoutSuccess(request, response, authentication);
    }
}
