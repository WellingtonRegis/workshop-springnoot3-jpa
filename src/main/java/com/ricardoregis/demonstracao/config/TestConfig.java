package com.ricardoregis.demonstracao.config;

import com.ricardoregis.demonstracao.entities.User;
import com.ricardoregis.demonstracao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Ricardo Regis", "ricardo@gmail.com", "99999-9999", "123456");
        User u2 = new User(null, "Paloma Santos", "paloma@gmail.com", "88888-8888", "654321");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
