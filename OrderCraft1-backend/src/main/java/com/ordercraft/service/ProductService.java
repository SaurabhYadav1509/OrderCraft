package com.ordercraft.service;

import com.ordercraft.entity.Product;
import com.ordercraft.repository.ProductRepository;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElse(null);
    }

    public Product updateProduct(Long id, Product product) {

        Product existingProduct =
                productRepository.findById(id)
                        .orElse(null);

        if (existingProduct == null) {
            return null;
        }

        existingProduct.setProductName(
                product.getProductName());

        existingProduct.setDescription(
                product.getDescription());

        existingProduct.setPrice(
                product.getPrice());

        return productRepository.save(existingProduct);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}