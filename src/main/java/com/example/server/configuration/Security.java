package com.example.server.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
@Configuration
public class Security {
    @Bean
    public SecurityFilterChain configuration(HttpSecurity httpSecurity) throws Exception
    {
        return httpSecurity.csrf(csrf -> csrf.disable()).cors(cors -> cors.disable()).httpBasic(httpbasic -> httpbasic.disable())
                .authorizeHttpRequests(authorize -> {
                    authorize.requestMatchers("/**").permitAll();
                    authorize.anyRequest().authenticated();
                })
                .formLogin(login->login.loginPage("/login").loginProcessingUrl("/login"))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)).build();
    }
}
