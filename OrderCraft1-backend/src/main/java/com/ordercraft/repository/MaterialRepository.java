package com.ordercraft.repository;

import com.ordercraft.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository
        extends JpaRepository<Material, Long> {

}