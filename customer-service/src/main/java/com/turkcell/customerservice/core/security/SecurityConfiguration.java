package com.turkcell.customerservice.core.security;

import com.turkcell.common.configuration.CommonSecurityConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration extends CommonSecurityConfiguration {

    @Override
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        return super.securityFilterChain(http);
    }
}
