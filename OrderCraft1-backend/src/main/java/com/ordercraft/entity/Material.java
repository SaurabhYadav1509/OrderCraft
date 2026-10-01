package com.ordercraft.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "materials")
public class Material {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "material_name")
    private String materialName;

    private String description;

    private String unit;

    @Column(name = "unit_price")
    private double unitPrice;

    public Material() {
    }

    public Material(String materialName, String description,
                    String unit, double unitPrice) {
        this.materialName = materialName;
        this.description = description;
        this.unit = unit;
        this.unitPrice = unitPrice;
    }

    public Long getId() {
        return id;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
}