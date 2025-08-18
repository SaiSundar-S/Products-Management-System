package com.products.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.products.model.Product;
import com.products.repo.ProdRepo;

@Service
public class ProductService {


	@Autowired
	private ProdRepo repo;

   
//	List<Product> products=new ArrayList<Product>(Arrays.asList(
//			                 new Product(101,"Monitor",10000),
//							new Product(102,"Mouse",1000),
//							new Product(103,"CPU",15000)
//							));


	public List<Product> getProducts() {
		return repo.findAll();
	}


	public Product getProductById(int prodId) {
		/*   in mysql
		 * // return products.stream().filter(p->p.getProdId()==prodId) //
		 * .findFirst().orElse(new Product(100,"item not found",0));
		 */
		
		
		 // for H2 Database;
		
		return repo.findById(prodId).orElse(new Product());
	}


	public void addProduct(Product prod) {
//		products.add(prod);  ---> for mysql
		
		repo.save(prod);   //--> H2 database
	}


	public void updateProduct(Product prod) {
//		int index=0;
//		for(int i=0;i<products.size();i++) {
//			if(products.get(i).getProdId()==prod.getProdId()) {
//				index=i;
//			}
//		}
//		products.set(index, prod);     for my sql
		
		repo.save(prod);
		
	}


	public void deleteproduct(int prodId) {
//		int index=0;
//		for(int i=0;i<products.size();i++) {
//			if(products.get(i).getProdId()==prodId) {
//				index=i;
//			}
//		}
//		products.remove(index);
		
		repo.deleteById(prodId);
		
	}
	

}
