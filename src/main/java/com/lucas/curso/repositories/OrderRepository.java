package com.lucas.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
