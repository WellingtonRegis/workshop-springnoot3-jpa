package com.ricardoregis.demonstracao.repositories;

import com.ricardoregis.demonstracao.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
