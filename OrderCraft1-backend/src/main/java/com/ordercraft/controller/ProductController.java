package com.ordercraft.controller;

import com.ordercraft.entity.Product;
import com.ordercraft.service.ProductService;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    // CREATE
    @PostMapping
    public Product createProduct(
            @RequestBody Product product) {

        return productService.createProduct(product);
    }

    // READ ALL
    @GetMapping
    public List<Product> getAllProducts() {

        return productService.getAllProducts();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Product getProductById(
            @PathVariable Long id) {

        return productService.getProductById(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public Product updateProduct(
            @PathVariable Long id,
            @RequestBody Product product) {

        return productService.updateProduct(id, product);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteProduct(
            @PathVariable Long id) {

        productService.deleteProduct(id);

        return "Product deleted successfully";
    }
}