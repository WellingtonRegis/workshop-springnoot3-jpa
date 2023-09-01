package com.ricardoregis.demonstracao.repositories;

import com.ricardoregis.demonstracao.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
