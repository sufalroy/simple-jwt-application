package org.sample.simplejwtbe.security.services;


import org.sample.simplejwtbe.security.models.SecurityUser;
import org.sample.simplejwtbe.user.repositores.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Autowired
    public JpaUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        var user = userRepository.findUserByUsername(username);
        return user.map(SecurityUser::new)
                .orElseThrow(() -> new UsernameNotFoundException(String.format("Username not found: %s", username)));
    }
}