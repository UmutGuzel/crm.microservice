package com.turkcell.common.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class CommonSecurityConfiguration {

    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
       http
               .csrf(AbstractHttpConfigurer::disable)
               .httpBasic(AbstractHttpConfigurer::disable)
               .authorizeHttpRequests(authorizeRequests ->{
                       authorizeRequests.anyRequest().permitAll();
               });
         return http.build();
    }
}

