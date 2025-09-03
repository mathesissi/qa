package br.edu.ifsp.demo_clean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .authorizeHttpRequests(auth -> auth
                .requestMatchers(
                    "/v3/api-docs/**",   
                    "/swagger-ui/**",    
                    "/swagger-ui.html",
                    "/h2-console/**",
                    "/api/**"      
                ).permitAll()
                .anyRequest().authenticated() 
            )
            .csrf(csrf -> csrf.disable())
            .headers(headers -> headers
                    .frameOptions(frame -> frame.sameOrigin()) 
                );

        return http.build();
    }
}
