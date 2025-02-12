package com.marketplace.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/api/v3/api-docs", "/api/swagger-ui.html", "/api/swagger-ui/**").permitAll() // Разрешаем доступ к Swagger
                        .anyRequest().permitAll()
                )
                .formLogin(form -> form
                        .permitAll()
                )
                .logout(logout -> logout
                        .permitAll() // Разрешаем выход без аутентификации
                )
                .build();
    }
}


//.requestMatchers("/api/v3/api-docs", "/api/swagger-ui.html", "/api/swagger-ui/**", "/swagger-ui.html", "/swagger-ui/**").permitAll() // Разрешаем доступ к Swagger
