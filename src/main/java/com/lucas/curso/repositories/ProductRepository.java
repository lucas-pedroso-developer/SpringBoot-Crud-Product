package com.lucas.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
