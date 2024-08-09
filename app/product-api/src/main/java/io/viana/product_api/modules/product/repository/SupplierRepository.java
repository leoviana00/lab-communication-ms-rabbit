package io.viana.product_api.modules.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.viana.product_api.modules.product.model.Supplier;

public interface SupplierRepository extends JpaRepository<Supplier, Integer>{

}
