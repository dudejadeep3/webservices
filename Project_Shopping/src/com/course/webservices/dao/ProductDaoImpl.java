package com.course.webservices.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.course.webservices.constants.DatabaseConstants;
import com.course.webservices.exception.SystemException;
import com.course.webservices.model.Product;
import com.course.webservices.utils.ResultSetHandler;

public class ProductDaoImpl extends BaseDao implements ProductDao {

	@Override
	public List<Product> getAllProducts() {
		Statement statement = null;
		try {
			statement = getConnection().createStatement();
			ResultSet resultSet = statement.executeQuery(DatabaseConstants.QueryConstants.GET_ALL_PRODUCTS);
			return ResultSetHandler.getAllProductsHandler(resultSet);
		} catch (SQLException e) {
			throw new SystemException("Error in getting the Proudcts");
		} finally {
			closeStatement(statement);
		}
	}

	@Override
	public Product getProduct(int productId) {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = getConnection().prepareStatement(DatabaseConstants.QueryConstants.GET_PRODUCT);
			preparedStatement.setInt(1, productId);
			ResultSet resultSet = preparedStatement.executeQuery();
			return ResultSetHandler.getProduct(resultSet);
		} catch (SQLException e) {
			throw new SystemException("Error in the getting the product with product Id"+productId);
		}finally{
			closePreparedStatement(preparedStatement);
		}
	}

	@Override
	public Product addProduct(Product product) {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = getConnection().prepareStatement(DatabaseConstants.QueryConstants.ADD_PRODUCT,Statement.RETURN_GENERATED_KEYS);
			preparedStatement.setString(1, product.getProductName());
			preparedStatement.setString(2, product.getCategory());
			preparedStatement.setDouble(3, product.getPrice());
			preparedStatement.setInt(4, product.getCurrentStock());
			preparedStatement.setString(5, product.getRemarks());
			
			int geneartedId=preparedStatement.executeUpdate();
			product.setProductId(geneartedId);
			return product;
		} catch (SQLException e) {
			throw new SystemException("Error in adding a new product to the database");
		}finally{
			closePreparedStatement(preparedStatement);
		}
	}

	@Override
	public Product updateProduct(Product product) {
		PreparedStatement preparedStatement=null;
		try {
			preparedStatement = getConnection().prepareStatement(DatabaseConstants.QueryConstants.UPDATE_PRODUCT);
			preparedStatement.setString(1, product.getProductName());
			preparedStatement.setString(2, product.getCategory());
			preparedStatement.setDouble(3, product.getPrice());
			preparedStatement.setInt(4, product.getCurrentStock());
			preparedStatement.setString(5, product.getRemarks());
			preparedStatement.setInt(6, product.getProductId());
			preparedStatement.execute();
			return product;
		} catch (SQLException e) {
			throw new SystemException("Error in updating the product in the database");
		}finally{
			closePreparedStatement(preparedStatement);
		}
	}

	@Override
	public int deleteProduct(int productId) {
		PreparedStatement preparedStatement=null;
		try {
			preparedStatement = getConnection().prepareStatement(DatabaseConstants.QueryConstants.DELETE_PRODUCT);
			preparedStatement.setInt(1, productId);
			return preparedStatement.executeUpdate();
		} catch (SQLException e) {
			throw new SystemException("Error in deleting the product in the database");
		}finally{
			closePreparedStatement(preparedStatement);
		}
	}

	@Override
	public List<Product> getCategoryProducts(String category) {
		PreparedStatement preparedStatement=null;
		try {
			preparedStatement = getConnection().prepareStatement(DatabaseConstants.QueryConstants.CATEGORY_PRODUCT);
			preparedStatement.setString(1, category);
			ResultSet resultSet=preparedStatement.executeQuery();
			return ResultSetHandler.getAllProductsHandler(resultSet);
		} catch (SQLException e) {
			throw new SystemException("Error in getting the products of the category"+category);
		}finally{
			closePreparedStatement(preparedStatement);
		}
	}

	@Override
	public boolean purchaseProduct(int productId) {
		PreparedStatement preparedStatement=null;
		try {
			preparedStatement = getConnection().prepareStatement(DatabaseConstants.QueryConstants.PURCHASE_PRODUCT);
			preparedStatement.setInt(1, productId);
			int result=preparedStatement.executeUpdate();
			if(result>0){
				return true;
			}
		} catch (SQLException e) {
			throw new SystemException("Error in updating the purchase of the product to the database");
		}finally{
			closePreparedStatement(preparedStatement);
		}
		return false;
	}

	@Override
	public List<Product> filterProduct(double startPrice, double maxPrice) {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = getConnection().prepareStatement(DatabaseConstants.QueryConstants.FILTER_PRODUCT_PRICE);
			preparedStatement.setDouble(1, startPrice);
			preparedStatement.setDouble(2, maxPrice);
			ResultSet resultSet = preparedStatement.executeQuery();
			return ResultSetHandler.getAllProductsHandler(resultSet);
		} catch (SQLException e) {
			throw new SystemException("Error in getting the products in a particular price range");
		}finally{
			closePreparedStatement(preparedStatement);
		}
	}
	
	

}

