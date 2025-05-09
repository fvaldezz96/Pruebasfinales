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