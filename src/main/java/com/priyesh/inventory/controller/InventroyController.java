package com.priyesh.inventory.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.priyesh.inventory.service.InventoryService;

import lombok.RequiredArgsConstructor;


@RestController
@RequestMapping("/api/inventory")
@RequiredArgsConstructor
public class InventroyController 
{
	
	private final InventoryService inventoryService;
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public boolean isInStock(@RequestParam String skuCode, @RequestParam Integer quantity) 
	{
		return inventoryService.isInStock(skuCode, quantity);
	}
	

}
