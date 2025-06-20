package com.mylearning.api_user_and_course_mgmt.configuration;

import java.util.ArrayList;
import java.util.List;
import com.mylearning.api_user_and_course_mgmt.springdatajpa.UserManagement;
import com.mylearning.api_user_and_course_mgmt.springdatajpa.UserSpringDataJpaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity(prePostEnabled = true) // Enable @PreAuthorize
public class SecurityConfig {

    private final UserSpringDataJpaRepository userRepository;

    public SecurityConfig(UserSpringDataJpaRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Bean
    public UserDetailsService  userDetailsService() {
        return userName -> {
            UserManagement user = userRepository.findByUserName(userName)
                    .orElseThrow(() -> new UsernameNotFoundException("User not found: " + userName));

            List<String> roles = new ArrayList<>();
            roles.add(user.getUserRole()); // Add the user's role as an authority

            return org.springframework.security.core.userdetails.User.builder()
                    .username(user.getUserName())
                    .password(user.getUserPassword())
                    .authorities(roles.toArray(new String[0]))
                    .build();
        };
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @SuppressWarnings("removal")
	@Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable()) // Disable CSRF for API
            .authorizeHttpRequests(authorize -> authorize
                .anyRequest().authenticated() // All requests require authentication
            )
            .httpBasic(); // Use HTTP Basic authentication

        return http.build();
    }
}