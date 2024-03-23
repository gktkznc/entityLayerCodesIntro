package com.tobeto.eCommerce.repositories;

import com.tobeto.eCommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
