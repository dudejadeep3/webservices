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
<script src="js/seller.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-10">
				<h1>Electronics Store</h1>
			</div>
			<div class="col-md-1 col-md-offset-1" class="buyer">
				<input type="button" id="buyer" value="Logout" class="btn btn-danger" />
			</div>
		</div>
		<div class="row col-xs-12">
		<%if(request.getParameter("message")!=null){ %>
			<h4 class="message"><%=request.getParameter("message")%></h4>
		<%}%></br>
		</div>
		<table class="table table-bordered" id="resultTable">
			<thead>
				<tr>
					<th>Product</th>
					<th>Stock</th>
					<th>Price</th>
					<th>Description</th>
					<th>Edit</th>
				</tr>
			</thead>
			<tbody id="tableBody">

			</tbody>
		</table>
		<div class="row col-xs-4">
			<button id="add" class="btn btn-primary">Add Product</button>
		</div>

	</div>
</body>
</html>