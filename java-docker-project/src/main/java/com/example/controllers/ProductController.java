package com.example.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private List<String> products = new ArrayList<>();

    @GetMapping
    public List<String> getProducts() {
        return products;
    }

    @PostMapping
    public String addProduct(@RequestBody String product) {
        products.add(product);
        return "Product added: " + product;
    }
}
//CLASS CRUDS PRODUCT

// package com.example.controllers;
// 
// import com.example.repositories.ProductRepository;
// import models.Product;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.*;
// 
// import java.util.List;
// 
// @RestController
// @RequestMapping("/api/products")
// public class ProductController {
// 
//     @Autowired
//     private ProductRepository productRepository;
// 
//     @GetMapping
//     public List<Product> getProducts() {
//         return productRepository.findAll();
//     }
// 
//     @PostMapping
//     public Product addProduct(@RequestBody Product product) {
//         return productRepository.save(product);
//     }
// 
//     @GetMapping("/{id}")
//     public Product getProductById(@PathVariable Long id) {
//         return productRepository.findById(id).orElse(null);
//     }
// 
//     @PutMapping("/{id}")
//     public Product updateProduct(@PathVariable Long id, @RequestBody Product product) {
//         product.setId(id);
//         return productRepository.save(product);
//     }
// 
//     @DeleteMapping("/{id}")
//     public String deleteProduct(@PathVariable Long id) {
//         productRepository.deleteById(id);
//         return "Product deleted with id: " + id;
//     }
// }