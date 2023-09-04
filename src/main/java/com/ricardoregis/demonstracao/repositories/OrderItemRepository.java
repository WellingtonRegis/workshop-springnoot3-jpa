package com.ricardoregis.demonstracao.repositories;

import com.ricardoregis.demonstracao.entities.OrderItem;
import com.ricardoregis.demonstracao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
