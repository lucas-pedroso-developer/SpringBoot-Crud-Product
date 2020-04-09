package com.lucas.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
