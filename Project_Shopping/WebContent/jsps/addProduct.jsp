<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Electronics|Shopping</title>
<script src="http://code.jquery.com/jquery-3.3.1.min.js"
	integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
	crossorigin="anonymous"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
	integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
	crossorigin="anonymous"></script>
<link rel="stylesheet" href="css/addProduct.css"></link>
<script src="js/addProduct.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-10">
				<h1>Electronics Store</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-10">
				<br/>
				<br/>
				<div class="row">
					<div class="col"><h3>Add Product</h3></div>
				</div>
				<div class="row">
					<label class="col-xs-4">Product Name</label>
					 <input class="col-xs-4" type="text" id="productName" value="" />
					 <span class="col-xs-4 errorMessage"  id="productNameError"></span>
				</div><br>
				<div class="row">
					<label class="col-xs-4">Stock</label>
					 <input class="col-xs-4" type="text" id="stock" value="" />
					 <span class="col-xs-4 errorMessage" id="stockError"></span>
				</div><br>
				<div class="row">
					<label class="col-xs-4">Price</label>
					 <input class="col-xs-4" type="text" id="price" value="" />
					 <span class="col-xs-4 errorMessage"  id="priceError"></span>
				</div><br>
					<div class="row">
					<label class="col-xs-4">Category</label>
					 <input class="col-xs-4" type="text" id="category" value="" />
					 <span class="col-xs-4 errorMessage"  id="categoryError"></span>
				</div><br>
				<div class="row">
					<label class="col-xs-4">Description</label>
					<textarea class="col-xs-4" rows="4" cols="40" id="description"></textarea>
					<span class="col-xs-4 errorMessage" id="descriptionError"></span>
				</div><br>
				<div class="row">
					<input type="button" class="col-xs-2 btn btn-success" onClick="addProduct()"value="Add"/>
					<input type="button" onClick="cancel()" class="col-xs-2 col-xs-offset-4  btn btn-danger" value="Cancel"/>
				</div>
			</div>
		</div>
	</div>
</body>
</html>