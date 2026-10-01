package com.ordercraft.service;

import com.ordercraft.entity.Inventory;
import com.ordercraft.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory createInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryById(Long id) {
        return inventoryRepository.findById(id)
                .orElse(null);
    }

    public Inventory updateInventory(Long id, Inventory inventory) {

        Inventory existingInventory =
                inventoryRepository.findById(id)
                        .orElse(null);

        if (existingInventory == null) {
            return null;
        }

        existingInventory.setMaterialName(
                inventory.getMaterialName());

        existingInventory.setQuantity(
                inventory.getQuantity());

        existingInventory.setUnit(
                inventory.getUnit());

        existingInventory.setReorderLevel(
                inventory.getReorderLevel());

        return inventoryRepository.save(existingInventory);
    }

    public void deleteInventory(Long id) {
        inventoryRepository.deleteById(id);
    }
}