package com.tutorial.webservice.model;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * 
 * to specify product as the root element.if it wasn't a root element but just
 * part of xml structure then we have to spcify on xmltype.
 *
 */
@XmlRootElement(name = "Prodcuct")
@XmlType(propOrder = { "price", "sku", "name" })
public class Product {

	private String name;
	private String sku;
	private double price;
	
	public Product(){
		
	}
	
	public Product(String name, String sku, double price) {
		super();
		this.name = name;
		this.sku = sku;
		this.price = price;
	}

	@XmlElement(name="productName")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
