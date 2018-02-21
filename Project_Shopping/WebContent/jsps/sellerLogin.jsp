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
<link rel="stylesheet" href="css/login.css"></link>
<script src="js/login.js"></script>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="row login">
				<div class="col-xs-5 col-xs-offset-3 loginForm">
					<div class="row col-xs-12">
						<h3 class="loginHeading">Seller Login</h3>
					</div>
					<br/>
					<div class="row col-xs-12">
						<h5 class="errorMessage">${message}</h5>
					</div>
					<br/>
					<form action="login" method="post">
						<div class="row">
							<div class="col-xs-12">
								<label class="col-xs-6">User Id</label>
								<input class="col-xs-6" type="text" name="userId"/>
							</div>
						</div><br/>
						<div class="row">
							<div class="col-xs-12">
								<label class="col-xs-6">Password</label>
								<input class="col-xs-6" type="password" name="password"/>
							</div>
						</div><br/>
						<div class="row">
							<div class="col-xs-12">
								<input class="col-xs-3 btn btn-success" type="submit" value="Login"/>
								<input class="col-xs-3 col-xs-offset-6 btn btn-danger" type="button" id="goBack" value="Go Back"/>
							</div>
						</div>
						<div>
							<h4>Default user id & Pwd are: admin & admin </h4>
						</div>
					</form>
				</div>
				<div class="col-md-6">
				</div>
			</div>
			
		</div>
	</div>
</body>
</html>