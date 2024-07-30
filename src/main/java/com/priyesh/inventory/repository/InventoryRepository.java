package com.priyesh.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.priyesh.inventory.model.Inventory;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{
	
	boolean existsBySkuCodeAndQuantityIsGreaterThanEqual(String skuCode,Integer quantity);

}
