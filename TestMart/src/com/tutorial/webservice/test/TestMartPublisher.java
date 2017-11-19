package com.tutorial.webservice.test;

import javax.xml.ws.Endpoint;

import com.tutorial.webservice.ProductCatalog;

public class TestMartPublisher {

	public static void main(String[] args) {
		//this is the single thread implementation. In glass fish it will be multi thread.
		Endpoint.publish("http://localhost:1234/productcatalog",new ProductCatalog() );
	}

}
