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
<link rel="stylesheet" href="css/buyer.css"></link>
<script src="js/buyer.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-10">
				<h1>Electronics Shopping Application</h1>
			</div>
			<div class="col-md-2" class="seller">
				<input type="button" id="seller" value="Seller Login"
					class="btn btn-danger" />
			</div>
		</div>
		<div class="row">
			<div class="col-md-5">
				<div class="row">
					<nav class="navbar navbar-inverse">
					<div class="navbar-header">
						<a class="navbar-brand">Search Product</a>
					</div>
					<ul class="nav navbar-nav">
						<li class="active" id="categoryLink"><a href="#">Filter
								By Category</a></li>
						<li><a href="#" id="priceLink">Filter By Price</a></li>
					</ul>
					</nav>
				</div>
				<div id="category" class="row">
					<div class="form-group">
						<label for="category">Categories:</label> 
						<select class="form-control" id="categorySelect">
							<option value="television">Television</option>
							<option value="laptop">Laptop</option>
							<option value="mobile">Mobile</option>
						</select>
					</div>
					<div class="form-group" id="category-get">
						<input type="button" class="btn btn-primary form-control"
							value="Get Products" />
					</div>
				</div>

				<div id="priceRange" class="row">
					<div class="row">
						<div>
							<label class="col-md-6">Starting Price:</label> <input
								type="text" id="startingPrice" class="col-md-5" />
						</div>
					</div>
					<br />
					<div class="row">
						<label class="col-md-6">Maximum Price:</label> <input type="text"
							id="maxPrice" class="col-md-5" />
					</div>
					<br />
					<div class="form-group" id="price-get">
						<input type="button" class="btn btn-primary form-control"
							value="Get Products" />
					</div>
				</div>
			</div>

			<div class="col-md-7">
				<table class="table table-bordered" id="resultTable">
					<thead>
						<tr>
							<th>Product</th>
							<th>Stock</th>
							<th>Price</th>
							<th>Description</th>
							<th>Buy</th>
						</tr>
					</thead>
					<tbody id="tableBody">
						
					</tbody>
				</table>
				<div id="noItem">No Items Found</div>
				<div id="emptyValue">Please Enter the Required Fields.</div>
			</div>
		</div>
	</div>
</body>
</html>