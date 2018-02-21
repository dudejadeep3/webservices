package com.course.webservices.services;

import java.util.List;

import com.course.webservices.model.Product;

public interface ProductService {

	public List<Product> getAllProducts();

	public Product getProduct(int productId);

	public Product addProduct(Product product);

	public Product updateProduct(Product product);

	public int deleteProduct(int productId);

	public List<Product> getCategoryProducts(String category);

	public boolean purchaseProduct(int productId);
	
	public List<Product> filterProduct(double startPrice, double maxPrice);
}
