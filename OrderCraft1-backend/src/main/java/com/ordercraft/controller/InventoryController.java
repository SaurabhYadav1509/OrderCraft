package com.ordercraft.controller;

import com.ordercraft.entity.Inventory;
import com.ordercraft.service.InventoryService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping
    public Inventory createInventory(
            @RequestBody Inventory inventory) {

        return inventoryService.createInventory(inventory);
    }

    @GetMapping
    public List<Inventory> getAllInventory() {

        return inventoryService.getAllInventory();
    }

    @GetMapping("/{id}")
    public Inventory getInventoryById(
            @PathVariable Long id) {

        return inventoryService.getInventoryById(id);
    }

    @PutMapping("/{id}")
    public Inventory updateInventory(
            @PathVariable Long id,
            @RequestBody Inventory inventory) {

        return inventoryService.updateInventory(id, inventory);
    }

    @DeleteMapping("/{id}")
    public String deleteInventory(
            @PathVariable Long id) {

        inventoryService.deleteInventory(id);

        return "Inventory deleted successfully";
    }
}