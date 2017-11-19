package com.tutorial.webservice.business;

import java.util.ArrayList;
import java.util.List;

import com.tutorial.webservice.model.Product;

public class ProductService {
	
	List<String> booksList= new ArrayList<String>();
	List<String> musicList= new ArrayList<String>();
	List<String> moviesList= new ArrayList<String>();
	
	public ProductService(){
		booksList.add("Inferno");
		booksList.add("Angels and Demons");
		
		musicList.add("what goes around comes around");
		musicList.add("closer");
		
		moviesList.add("The Notebook");
		moviesList.add("Argo");
		
	}
	
	
	public List<String> getProductList(){
		List<String> categories = new ArrayList<String>();
		categories.add("Books");
		categories.add("Music");
		categories.add("Movies");
		return categories;
	}
	
	public List<String> getProducts(String category){
		switch(category.toLowerCase()){
		case "books" : 
			return booksList;
		case "music":
			return musicList;
		case "movies":
			return moviesList;
		}
		return null;
	}
	
	public boolean addProduct(String category, String product){
		switch(category.toLowerCase()){
		case "books" : 
			booksList.add(product);
			return true;
		case "music":
			musicList.add(product);
			return true;
		case "movies":
			moviesList.add(product);
			return true;
		}
		return false;
	}
	
	public List<Product> getProductsv2(String category){
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product("Java Book","1234",99.0));
		productList.add(new Product("Another Book","1235",123.0));
		return productList;
	}

}
