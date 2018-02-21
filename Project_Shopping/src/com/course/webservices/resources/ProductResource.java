package com.course.webservices.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.course.webservices.model.Product;
import com.course.webservices.services.ProductService;
import com.course.webservices.services.ProductServiceImpl;

@Path("/product")
public class ProductResource {
	private ProductService productService = new ProductServiceImpl();
	
	/**
	 * 
	 * @return all the products available in the database
	 */
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_XML)
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	/**
	 * 
	 * @param productId
	 * @return the product based on the product id.
	 */
	@GET
	@Path("/{productId}")
	@Produces(MediaType.APPLICATION_XML)
	public Product getProduct(@PathParam("productId") int productId) {
		return productService.getProduct(productId);
	}

	/**
	 * 
	 * @param product
	 * @return
	 * adds a new product in the database.
	 */
	@POST
	@Path("/")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Product addProduct(Product product) {
		product.setCategory(product.getCategory().toLowerCase());
		return productService.addProduct(product);
	}

	/**
	 * 
	 * @param product
	 * @param productId
	 * @return 
	 * Updates a particular product based on the productid.
	 */
	@PUT
	@Path("/{productId}")
	@Produces(MediaType.APPLICATION_XML)
	@Consumes(MediaType.APPLICATION_XML)
	public Product updateProduct(Product product, @PathParam("productId") int productId) {
		product.setProductId(productId);
		product.setCategory(product.getCategory().toLowerCase());
		return productService.updateProduct(product);
	}

	/**
	 * 
	 * @param productId
	 * Deletes the products from the database.
	 */
	@DELETE
	@Produces(MediaType.APPLICATION_XML)
	@Path("/{productId}")
	public void deleteProduct(@PathParam("productId") int productId) {
		 productService.deleteProduct(productId);
	}
	
	/**
	 * 
	 * @param category
	 * @return
	 * Gets the products based on the category
	 */
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/filter/{category}")
	public List<Product> getCategoryProduct(@PathParam("category") String category){
		if(category!=null){
			category=category.toLowerCase();
		}
		return productService.getCategoryProducts(category);
	}
	
	/**
	 * 
	 * @param productId
	 * buy a particular product.
	 */
	@PUT
	@Path("/buy/{productId}")
	@Produces(MediaType.APPLICATION_JSON)
	public void purchaseProduct(@PathParam("productId")int productId){
		 productService.purchaseProduct(productId);
	}
	
	/**
	 * 
	 * @param startPrice
	 * @param maxPrice
	 * @return
	 * Gets the products between a particular price range.
	 */
	@GET
	@Path("/filter")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Product> filterProduct(@QueryParam("startPrice") double startPrice, @QueryParam("maxPrice") double maxPrice){
		return productService.filterProduct(startPrice, maxPrice);
	}
	
	
}
