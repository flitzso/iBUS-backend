package com.ibus.repository;

import com.ibus.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Adicione métodos específicos, se necessário
}