package com.lucas.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {


}
