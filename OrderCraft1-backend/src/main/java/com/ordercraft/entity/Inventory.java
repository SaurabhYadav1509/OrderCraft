package com.ordercraft.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "material_name")
    private String materialName;

    private double quantity;

    private String unit;

    @Column(name = "reorder_level")
    private double reorderLevel;

    public Inventory() {
    }

    public Inventory(String materialName, double quantity,
                     String unit, double reorderLevel) {
        this.materialName = materialName;
        this.quantity = quantity;
        this.unit = unit;
        this.reorderLevel = reorderLevel;
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

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public double getReorderLevel() {
        return reorderLevel;
    }

    public void setReorderLevel(double reorderLevel) {
        this.reorderLevel = reorderLevel;
    }
}