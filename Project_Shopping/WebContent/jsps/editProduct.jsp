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
<link rel="stylesheet" href="css/seller.css"></link>
<script>
	var productId =<%=request.getParameter("productId")%>;
	
</script>
<script src="js/editProduct.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-10">
				<h1>Electronics Store</h1>
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<br/>
				<br/>
				<div class="row">
						<button id="back" class="col-xs-4 btn btn-primary">Back</button>
				</div>
				<div class="row">
					<div class="col"><h3>Edit Product</h3></div>
				</div>
				<div class="row">
					<label class="col-xs-6">Product Name</label>
					 <input class="col-xs-6" type="text" id="productName" value="" />
				</div><br>
				<div class="row">
					<label class="col-xs-6">Stock</label>
					 <input class="col-xs-6" type="text" id="stock" value="" />
				</div><br>
				<div class="row">
					<label class="col-xs-6">Price</label>
					 <input class="col-xs-6" type="text" id="price" value="" />
				</div><br>
					<div class="row">
					<label class="col-xs-6">Category</label>
					 <input class="col-xs-6" type="text" id="category" value="" />
				</div><br>
				<div class="row">
					<label class="col-xs-6">Description</label>
					<textarea class="col-xs-6" rows="4" cols="40" id="description"></textarea>
				</div><br>
				<div class="row">
					<input type="button" class="col-xs-4 btn btn-success" onClick="updateProduct()"value="Update"/>
					<input type="button" onClick="deleteProduct()" class="col-xs-4 col-xs-offset-4  btn btn-danger" value="Delete"/>
				</div>
			</div>
		</div>
	</div>
</body>
</html>