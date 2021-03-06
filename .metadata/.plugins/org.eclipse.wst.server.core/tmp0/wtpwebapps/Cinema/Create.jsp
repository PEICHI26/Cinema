<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Movie</title>
<style>
* {
	box-sizing: border-box;
}

input[type=text], select, textarea {
	width: 100%;
	padding: 12px;
	border: 1px solid #ccc;
	border-radius: 4px;
	resize: vertical;
}

label {
	padding: 12px 12px 12px 0;
	display: inline-block;
}

input[type=submit] {
	background-color: #4CAF50;
	color: white;
	padding: 12px 20px;
	border: none;
	border-radius: 4px;
	cursor: pointer;
	float: right;
}

input[type=submit]:hover {
	background-color: #45a049;
}

.container {
	border-radius: 5px;
	background-color: #f2f2f2;
	padding: 20px;
	width: 900px;
}

.col-25 {
	float: left;
	width: 25%;
	margin-top: 6px;
}

.col-75 {
	float: left;
	width: 75%;
	margin-top: 6px;
}

/* Clear floats after the columns */
.row:after {
	content: "";
	display: table;
	clear: both;
}

/* Responsive layout - when the screen is less than 600px wide, make the two columns stack on top of each other instead of next to each other */
@media screen and (max-width: 600px) {
	.col-25, .col-75, input[type=submit] {
		width: 100%;
		margin-top: 0;
	}
}
</style>
</head>

<body>
	<div class="container">
		<h2>新增電影</h2>
		<form action="MovieServlet" method="post">
			<div class="row">
				<div class="col-25">
					<label for="moviename">Movie Name</label>
				</div>
				<div class="col-75">
					<input type="text" id="moviename" name="moviename" placeholder="">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="moviename">Release Date</label>
				</div>
				<div class="col-75">
					<input type="date" id="rdate" name="rdate">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="movielength">Length</label>
				</div>
				<div class="col-75">
					<input type="text" id="movielength" name="movielength"
						placeholder="">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="type">Type</label>
				</div>
				<div class="col-75">
					<input type="text" id="type" name="type" placeholder="">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="grading">Grading</label>
				</div>
				<div class="col-75">
					<input type="text" id="grading" name="grading" placeholder="">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="release">Release</label>
				</div>
				<div class="col-75">
					<input type="text" id="release" name="release" placeholder="">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="director">Director</label>
				</div>
				<div class="col-75">
					<input type="text" id="director" name="director" placeholder="">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="actors">Actors</label>
				</div>
				<div class="col-75">
					<input type="text" id="actors" name="actors" placeholder="">
				</div>
			</div>
			<div class="row">
				<div class="col-25">
					<label for="intro">Introduction</label>
				</div>
				<div class="col-75">
					<textarea id="intro" name="intro" placeholder=""
						style="height: 200px"></textarea>
				</div>
			</div>
			<br>
			<div class="row">
				<input type="submit" name="INSERT" value="新增電影">
			</div>
		</form>
	</div>
	<%@ include file="copyright.jspf" %>
</body>
</html>