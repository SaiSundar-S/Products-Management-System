package com.products.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.products.model.Product;
import com.products.service.ProductService;

@RestController

public class ProductsContoller {
	@Autowired
  public ProductService service;
  
  	@RequestMapping("/products")
  	public List<Product> getProducts(){
  		return service.getProducts();
  	}
  	
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId) {
		return service.getProductById(prodId);
	}
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod) {
		 service.addProduct(prod);
	}
	
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prodId) {
		System.out.println("i am in update");
		service.updateProduct(prodId);
	}
	
	@DeleteMapping("/products/{prodId}")
	public void deleteProduct(@PathVariable int prodId) {
		 service.deleteproduct(prodId);
	}
  
  	
}
