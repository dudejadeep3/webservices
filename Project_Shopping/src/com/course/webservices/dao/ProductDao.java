package com.course.webservices.dao;

import java.util.List;

import com.course.webservices.model.Product;

public interface ProductDao {
	/**
	 * 
	 * @return
	 */
	public List<Product> getAllProducts();

	/**
	 * 
	 * @param productId
	 * @return
	 */
	public Product getProduct(int productId);

	/**
	 * 
	 * @param product
	 * @return
	 */
	public Product addProduct(Product product);

	/**
	 * 
	 * @param product
	 * @return
	 */
	public Product updateProduct(Product product);

	/**
	 * 
	 * @param productId
	 * @return
	 */
	public int deleteProduct(int productId);

	/**
	 * 
	 * @param category
	 * @return
	 */
	public List<Product> getCategoryProducts(String category);

	/**
	 * 
	 * @param productId
	 * @return
	 */
	public boolean purchaseProduct(int productId);

	/**
	 * 
	 * @param startPrice
	 * @param maxPrice
	 * @return
	 */
	public List<Product> filterProduct(double startPrice, double maxPrice);
}
