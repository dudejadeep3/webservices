package com.tutorial.webservice.old;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.tutorial.webservice.model.Product;

@WebService(name = "TestMartCatalogOld", targetNamespace = "http://testmart.com")
@SOAPBinding(style=Style.DOCUMENT)
public interface ProductCatalogInterface {
	
	@WebMethod(action="fetch_categories",operationName="fetchCategories")
	List<String> getProductCategories();

	@WebMethod
	List<String> getProducts(String category);
	
	@WebMethod
	boolean addProduct(String category, String productName);
	
	@WebMethod
	@WebResult(name="Product")
	List<Product> getProductsv2(String category);

}