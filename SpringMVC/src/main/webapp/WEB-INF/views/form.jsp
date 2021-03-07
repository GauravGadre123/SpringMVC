<%@page import="java.text.Normalizer.Form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">

<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
		<div class="container">

			<div class="alert alert-danger alert-dismissible">
				<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			
				<form:errors path="user1.*"></form:errors>
			
				
			</div>
			<form class="form-horizontal" action="get_form_data" method="post">
				<div class="form-group">
					<label class="control-label col-sm-2">Name:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="Enter name"
							name="name">
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2">Id:</label>
					<div class="col-sm-10">
						<input type="text" class="form-control" placeholder="Enter id"
							name="id">
					</div>
				</div>

				<div class="form-group">
					<div class="col-sm-offset-2 col-sm-10">
						<button type="submit" class="btn btn-default">Submit</button>
					</div>
				</div>
			</form>
		</div>

</body>
</html>