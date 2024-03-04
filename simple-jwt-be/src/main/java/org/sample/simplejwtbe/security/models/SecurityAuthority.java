package org.sample.simplejwtbe.security.models;

import lombok.AllArgsConstructor;
import org.sample.simplejwtbe.user.models.Authority;
import org.springframework.security.core.GrantedAuthority;

@AllArgsConstructor
public class SecurityAuthority implements GrantedAuthority {

    private final Authority authority;

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
