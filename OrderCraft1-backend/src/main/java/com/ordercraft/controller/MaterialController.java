package com.ordercraft.controller;

import com.ordercraft.entity.Material;
import com.ordercraft.service.MaterialService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/materials")
public class MaterialController {

    private final MaterialService materialService;

    public MaterialController(MaterialService materialService) {
        this.materialService = materialService;
    }

    @PostMapping
    public Material createMaterial(
            @RequestBody Material material) {

        return materialService.createMaterial(material);
    }

    @GetMapping
    public List<Material> getAllMaterials() {

        return materialService.getAllMaterials();
    }

    @GetMapping("/{id}")
    public Material getMaterialById(
            @PathVariable Long id) {

        return materialService.getMaterialById(id);
    }

    @PutMapping("/{id}")
    public Material updateMaterial(
            @PathVariable Long id,
            @RequestBody Material material) {

        return materialService.updateMaterial(id, material);
    }

    @DeleteMapping("/{id}")
    public String deleteMaterial(
            @PathVariable Long id) {

        materialService.deleteMaterial(id);

        return "Material deleted successfully";
    }
}