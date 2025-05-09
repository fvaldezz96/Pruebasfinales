package com.example.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public String getProducts() {
        return "List of products";
    }

    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productRepository.save(product);
    }

//     private List<String> products = new ArrayList<>();
// 
//     @GetMapping
//     public List<String> getProducts() {
//         return products;
//     }
// 
//     @PostMapping
//     public String addProduct(@RequestBody String product) {
//         products.add(product);
//         return "Product added: " + product;
//     }
// 
//     @GetMapping("/{id}")
//     public String getProductById(@PathVariable int id) {
//         if (id >= 0 && id < products.size()) {
//             return products.get(id);
//         } else {
//             return "Product not found";
//         }
//     }
// 
//     @PutMapping("/{id}")
//     public String updateProduct(@PathVariable int id, @RequestBody String product) {
//         if (id >= 0 && id < products.size()) {
//             products.set(id, product);
//             return "Product updated: " + product;
//         } else {
//             return "Product not found";
//         }
//     }
// 
//     @DeleteMapping("/{id}")
//     public String deleteProduct(@PathVariable int id) {
//         if (id >= 0 && id < products.size()) {
//             String removedProduct = products.remove(id);
//             return "Product removed: " + removedProduct;
//         } else {
//             return "Product not found";
//         }
//     }
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