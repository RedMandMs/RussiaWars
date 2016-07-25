package com.thebestleticompany.russianwars.domain.user;

import com.google.gwt.thirdparty.guava.common.collect.Sets;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/**
 * @author Vilgodskiy Sergey on 25.07.2016.
 */
public enum Role {

    ADMIN("admin", "Administrator", Arrays.asList(Permission.SIMPLE_1, Permission.SIMPLE_2, Permission.SIMPLE_3)),
    PLAYER("player", "Player", Collections.singletonList(Permission.SIMPLE_1));

    Role(String shortName, String fullName, Collection<Permission> permissions) {
        this(permissions);
        this.fullName = fullName;
        this.shortName = shortName;
    }

    Role(Collection<Permission> permissions) {
        this.permissions = Collections.unmodifiableSet(Sets.newHashSet(permissions));
    }

    private Set<Permission> permissions;
    private String shortName;
    private String fullName;

    public Set<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(Set<Permission> permissions) {
        this.permissions = permissions;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
