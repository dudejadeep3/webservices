package com.course.webservices.constants;

public class DatabaseConstants {
	
	public static final String CONFIG_FILE_PATH="/database.properties";
	public static final String DATABASE_USERNAME="DATABASE_USERNAME";
	public static final String DATABASE_PASSWORD="DATABASE_PASSWORD";
	public static final String DATABASE_URL="DATABASE_URL";
	public static final String DATABASE_NAME="DATABASE_NAME";
	
	public class QueryConstants{
		public static final String GET_ALL_PRODUCTS= "select * from product";
		public static final String DELETE_PRODUCT ="delete from product where id=?";
		public static final String GET_PRODUCT = "select * from product where id=?";
		public static final String ADD_PRODUCT = "insert into product (product_name,category,price,stock,remark) values(?,?,?,?,?)";
		public static final String UPDATE_PRODUCT = "update product set product_name=?,category=?,price=?,stock=?,remark=? where id=?";
		public static final String CATEGORY_PRODUCT="select * from product where category=?";
		public static final String PURCHASE_PRODUCT = "update product set stock = stock-1 where id=?";
		public static final String FILTER_PRODUCT_PRICE="select * from product where price>? and price<=?";
	}

}
