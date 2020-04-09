package com.lucas.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {


}
