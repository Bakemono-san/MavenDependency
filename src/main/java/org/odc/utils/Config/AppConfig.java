package org.odc.utils.Config;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface AppConfig<PasswordEncoder> {
    UserDetailsService userDetailsService();
    AuthenticationManager authenticationManager();
    AuthenticationProvider authenticationProvider();
    PasswordEncoder passwordEncoder();
}
