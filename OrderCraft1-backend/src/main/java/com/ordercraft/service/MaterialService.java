package com.ordercraft.service;

import com.ordercraft.entity.Material;
import com.ordercraft.repository.MaterialRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {

    private final MaterialRepository materialRepository;

    public MaterialService(MaterialRepository materialRepository) {
        this.materialRepository = materialRepository;
    }

    public Material createMaterial(Material material) {
        return materialRepository.save(material);
    }

    public List<Material> getAllMaterials() {
        return materialRepository.findAll();
    }

    public Material getMaterialById(Long id) {
        return materialRepository.findById(id)
                .orElse(null);
    }

    public Material updateMaterial(Long id, Material material) {

        Material existingMaterial =
                materialRepository.findById(id)
                        .orElse(null);

        if (existingMaterial == null) {
            return null;
        }

        existingMaterial.setMaterialName(
                material.getMaterialName());

        existingMaterial.setDescription(
                material.getDescription());

        existingMaterial.setUnit(
                material.getUnit());

        existingMaterial.setUnitPrice(
                material.getUnitPrice());

        return materialRepository.save(existingMaterial);
    }

    public void deleteMaterial(Long id) {
        materialRepository.deleteById(id);
    }
}