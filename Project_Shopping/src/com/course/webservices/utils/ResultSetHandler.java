package com.course.webservices.utils;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.course.webservices.model.Product;

public class ResultSetHandler {

	public static List<Product> getAllProductsHandler(ResultSet resultSet) throws SQLException{
		List<Product> listOfProuducts = new ArrayList<Product>();
		while(resultSet.next()){
			Product product = new Product();
			product.setProductId(resultSet.getInt(1));
			product.setProductName(resultSet.getString(2));
			product.setCategory(resultSet.getString(3));
			product.setPrice(resultSet.getDouble(4));
			product.setCurrentStock(resultSet.getInt(5));
			product.setRemarks(resultSet.getString(6));
			listOfProuducts.add(product);
		}
		return listOfProuducts;
	}

	public static Product getProduct(ResultSet resultSet) throws SQLException {
		Product product = new Product();
		if(resultSet.next()){
			product.setProductId(resultSet.getInt(1));
			product.setProductName(resultSet.getString(2));
			product.setCategory(resultSet.getString(3));
			product.setPrice(resultSet.getDouble(4));
			product.setCurrentStock(resultSet.getInt(5));
			product.setRemarks(resultSet.getString(6));
		}
		return product;
	}
}
