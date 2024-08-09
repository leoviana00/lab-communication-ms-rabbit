package io.viana.product_api.modules.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.viana.product_api.modules.product.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
