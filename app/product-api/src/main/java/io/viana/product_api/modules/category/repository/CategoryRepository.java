package io.viana.product_api.modules.category.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import io.viana.product_api.modules.category.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{
    List<Category> findByDescriptionIgnoreCaseContaining(String description);
}
