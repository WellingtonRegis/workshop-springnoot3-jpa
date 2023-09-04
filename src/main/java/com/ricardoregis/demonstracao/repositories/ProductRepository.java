package com.ricardoregis.demonstracao.repositories;


import com.ricardoregis.demonstracao.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
