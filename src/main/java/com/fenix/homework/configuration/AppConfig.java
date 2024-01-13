package com.fenix.homework.configuration;

import com.fenix.homework.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(initMethod = "init")
    public CustomerRepository customerRepoBean() {
        return new CustomerRepository();
    }
}
