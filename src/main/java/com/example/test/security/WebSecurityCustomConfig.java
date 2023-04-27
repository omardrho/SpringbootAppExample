package com.example.test.security;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityCustomConfig {

    private final PasswordEncoder passwordEncoder;

    public WebSecurityCustomConfig(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }


    @Autowired
    public void configure(AuthenticationManagerBuilder auth)
            throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("utilisateur").password(passwordEncoder.encode("12345")).roles("USER")
                .and()
                .withUser("administrateur").password(passwordEncoder.encode("123456")).roles("ADMIN");
    }
}