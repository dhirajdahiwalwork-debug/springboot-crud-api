package com.dhiraj.springcrud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.dhiraj.springcrud.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
