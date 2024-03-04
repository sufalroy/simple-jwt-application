package org.sample.simplejwtbe.security.controllers;

import org.sample.simplejwtbe.security.services.TokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TokenController {

    private final TokenService tokenService;

    @Autowired
    public TokenController(TokenService tokenService) {
        this.tokenService = tokenService;
    }

    @GetMapping("/token")
    public String token(Authentication authentication) {
        return this.tokenService.token(authentication);
    }

}
