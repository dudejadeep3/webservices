package com.tutorial.webservice.old;

import java.util.List;

import javax.jws.WebService;

import com.tutorial.webservice.business.ProductService;
import com.tutorial.webservice.model.Product;

@WebService(endpointInterface="com.tutorial.webservice.old.ProductCatalogInterface", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogServiceOld")
public class ProductCatalog implements ProductCatalogInterface{
	
	ProductService productService = new ProductService();
			
	@Override
	public List<String> getProductCategories() {
		return productService.getProductList();
	}

	@Override
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	@Override
	public boolean addProduct(String category, String productName) {
		return productService.addProduct(category, productName);
	}

	@Override
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}

}
