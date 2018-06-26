package edu.fa.mock.dao;

import java.util.List;

import edu.fa.mock.model.Products;

public interface ProductsDao {
	
	void createProduct(Products product);
	
	void updateProduct(Products products);
	
	void deleteProduct(int productId);
	
	List<Products> getAllProduct();
	
}
