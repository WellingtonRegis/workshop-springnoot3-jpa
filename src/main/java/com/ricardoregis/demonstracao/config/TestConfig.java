package com.ricardoregis.demonstracao.config;

import com.ricardoregis.demonstracao.entities.Order;
import com.ricardoregis.demonstracao.entities.User;
import com.ricardoregis.demonstracao.repositories.OrderRepository;
import com.ricardoregis.demonstracao.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Ricardo Regis", "ricardo@gmail.com", "99999-9999", "123456");
        User u2 = new User(null, "Paloma Santos", "paloma@gmail.com", "88888-8888", "654321");

        Order o1 = new Order(null, Instant.parse("2023-09-25T05:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2023-09-15T08:43:15Z"), u2);
        Order o3 = new Order(null, Instant.parse("2023-09-17T13:38:37Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
