package com.example.first_project;

import com.example.first_project.user.repository.MemoryUserRepository;
import com.example.first_project.user.repository.UserRepository;
import com.example.first_project.user.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

///  의존성 주입 직접 하기

@Configuration
public class SpringConfig {

    @Bean
    public UserService userService() {
        return new UserService(userRepository());
    }

    @Bean
    public UserRepository userRepository() {
        return new MemoryUserRepository();
    }
}
