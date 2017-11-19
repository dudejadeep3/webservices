package com.tutorial.webservice;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.tutorial.webservice.business.ProductService;
import com.tutorial.webservice.model.Product;

@WebService(name = "TestMartCatalog", portName = "TestMartCatalogPort", serviceName = "TestMartCatalogService", targetNamespace = "http://testmart.com")
@SOAPBinding(style=Style.DOCUMENT)
public class ProductCatalog {

	ProductService productService = new ProductService();

	@WebMethod(action="fetch_categories",operationName="fetchCategories")
	public List<String> getProductCategories() {
		return productService.getProductList();
	}

	@WebMethod
	public List<String> getProducts(String category) {
		return productService.getProducts(category);
	}

	@WebMethod
	public boolean addProduct(String category, String productName) {
		return productService.addProduct(category, productName);
	}
	
	@WebMethod
	public List<Product> getProductsv2(String category) {
		return productService.getProductsv2(category);
	}

}
