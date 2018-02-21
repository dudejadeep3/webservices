package com.course.webservices.services;

import java.util.List;

import com.course.webservices.dao.ProductDao;
import com.course.webservices.dao.ProductDaoImpl;
import com.course.webservices.model.Product;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao = new ProductDaoImpl();
	
	@Override
	public List<Product> getAllProducts() {
		return productDao.getAllProducts();
	}

	@Override
	public Product getProduct(int productId) {
		return productDao.getProduct(productId);
	}

	@Override
	public Product addProduct(Product product) {
		return productDao.addProduct(product);
	}

	@Override
	public Product updateProduct(Product product) {
		return productDao.updateProduct(product);
	}

	@Override
	public int deleteProduct(int productId) {
		return productDao.deleteProduct(productId);
	}

	@Override
	public List<Product> getCategoryProducts(String category) {
		return productDao.getCategoryProducts(category);
	}

	@Override
	public boolean purchaseProduct(int productId) {
		return productDao.purchaseProduct(productId);
	}

	@Override
	public List<Product> filterProduct(double startPrice, double maxPrice) {
		return productDao.filterProduct(startPrice, maxPrice);
	}

}
