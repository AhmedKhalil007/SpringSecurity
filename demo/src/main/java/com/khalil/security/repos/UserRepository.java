package com.khalil.security.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.khalil.security.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername(String username);
}
