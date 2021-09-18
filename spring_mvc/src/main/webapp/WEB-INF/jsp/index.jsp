<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<title>LESSON_18_JAVA__ADVANCE_SPRING-MVC</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>



	<nav class="navbar navbar-default">
		<div class="container-fluid">
			<div class="navbar-header">Spring MVC -Logos</div>
			<ul class="nav navbar-nav">
				<li class="active"><a href="/">All participants</a></li>
				<li><a href="new">new Participant</a></li>
			</ul>
		</div>
	</nav>


	<div class="container">

		<c:choose>
			<c:when test="${mode == 'PARTICIPANT_VIEW'}">
				<table class="table table-striped">
					<thead>
						<tr>
							<th>Id</th>
							<th>Participant Name</th>
							<th>Email</th>
							<th>Level</th>
							<th>PrimarySkill</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="participant" items="${participants}">
							<tr>
								<td>${participant.id}</td>
								<td>${participant.name}</td>
								<td>${participant.email}</td>
								<td><a href="update?id= ${participant.id}">Level</a></td>
								<td><a href="delete?id= ${participant.id}">PrimarySkill</a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</c:when>

			<c:when test="${mode == 'PARTICIPANT_EDIT' || mode == 'PARTICIPANT_CREATE'}">
				<form action="save" method="POST">
				
				<input type="hidden" value="${participant.id}" class="form-control" id="id" name="id">
				
					<div class="form-group">
						<label for="participantName">Participant Name:</label> <input type="text"
							class="form-control" id="name" name="name"
							value="${participant.name}">
					</div>


					<div class="form-group">
						<label for="email">Email:</label> <input type="text"
							class="form-control" id="email" name="email"
							value="${participant.email}">
					</div>
					<button type="submit" class="btn btn-default">Submit</button>
				</form>
			</c:when>

		</c:choose>
	</div>
</body>
</html>



