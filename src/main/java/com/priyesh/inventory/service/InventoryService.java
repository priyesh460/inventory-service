package com.priyesh.inventory.service;

import org.springframework.stereotype.Service;

import com.priyesh.inventory.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class InventoryService {
	
	private final InventoryRepository inventoryRepository;
	
	public boolean isInStock(String skuCode,Integer quantity)
	{
		log.info("Checking Product in Stock for Skucode {}",skuCode);
		return inventoryRepository.existsBySkuCodeAndQuantityIsGreaterThanEqual(skuCode, quantity);
	}

}
