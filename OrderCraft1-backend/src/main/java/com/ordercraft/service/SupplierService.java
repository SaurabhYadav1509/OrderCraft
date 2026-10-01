package com.ordercraft.service;

import com.ordercraft.entity.Supplier;
import com.ordercraft.repository.SupplierRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SupplierService {

    private final SupplierRepository supplierRepository;

    public SupplierService(SupplierRepository supplierRepository) {
        this.supplierRepository = supplierRepository;
    }

    public Supplier createSupplier(Supplier supplier) {
        return supplierRepository.save(supplier);
    }

    public List<Supplier> getAllSuppliers() {
        return supplierRepository.findAll();
    }

    public Supplier getSupplierById(Long id) {
        return supplierRepository.findById(id)
                .orElse(null);
    }

    public Supplier updateSupplier(Long id, Supplier supplier) {

        Supplier existingSupplier =
                supplierRepository.findById(id)
                        .orElse(null);

        if (existingSupplier == null) {
            return null;
        }

        existingSupplier.setSupplierName(
                supplier.getSupplierName());

        existingSupplier.setCompany(
                supplier.getCompany());

        existingSupplier.setEmail(
                supplier.getEmail());

        existingSupplier.setPhone(
                supplier.getPhone());

        existingSupplier.setAddress(
                supplier.getAddress());

        return supplierRepository.save(existingSupplier);
    }

    public void deleteSupplier(Long id) {
        supplierRepository.deleteById(id);
    }
}