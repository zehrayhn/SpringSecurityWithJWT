package com.example.testApp.config;

import com.example.testApp.dao.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@RequiredArgsConstructor
public class ApplicationConfig {
//@RequiredArgsConstructor Bu anotasyon, sınıfın tüm final alanlarını parametre olarak alarak otomatik olarak bir constructor oluşturur.
// Böylece, final alanlara değer ataması yapmadan önce constructor oluşturma gereksinimini ortadan kaldırır ve kod tekrarını azaltır.
//@RequiredArgsConstructor yalnızca final olarak işaretlenmiş olan alanları içeren bir constructor oluşturur ve diğer alanlar için constructor parametresi oluşturmaz
    private final UserRepository repository;


    @Bean
    public UserDetailsService userDetailsService(){
        return username -> repository.findByEmail(username)
                .orElseThrow(() -> new UsernameNotFoundException("User not found"));
}

    @Bean
    public AuthenticationProvider authenticationProvider() {

        DaoAuthenticationProvider authProvider=new DaoAuthenticationProvider();
        authProvider.setUserDetailsService(userDetailsService());
        authProvider.setPasswordEncoder(passwordEncoder());
        return authProvider;
    }

    @Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration config) throws Exception {
        return config.getAuthenticationManager();

    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
