<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert Successful</title>
<style>
table, th, td {
  border:1px solid black;
}
</style>
</head>
<body>
	<jsp:useBean id="movie" class="tw.cinema.model.Movie" scope="session" />
	<h1>
		You have inserted
		<jsp:getProperty name="movie" property="movie_Name" />
		successfully
	</h1>
	<table>
  <tr>
    <th>Movie Number</th>
    <th>Movie Name</th>
    <th>Release Date</th>
    <th>Movie Length</th>
    <th>Movie Type</th>
    <th>Movie Grading</th>
    <th>Movie Release</th>
    <th>Movie Director</th>
    <th>Movie Actors</th>
    <th>Movie Introduction</th>
    
    
  </tr>
  <tr>
    <td><jsp:getProperty name="movie" property="movie_No" /></td>
    <td><jsp:getProperty name="movie" property="movie_Name" /></td>
    <td><jsp:getProperty name="movie" property="movie_Date" /></td>
    <td><jsp:getProperty name="movie" property="movie_Length" /></td>
    <td><jsp:getProperty name="movie" property="type" /></td>
    <td><jsp:getProperty name="movie" property="grading" /></td>
    <td><jsp:getProperty name="movie" property="release" /></td>
    <td><jsp:getProperty name="movie" property="director" /></td>
    <td><jsp:getProperty name="movie" property="actor" /></td>
    <td><jsp:getProperty name="movie" property="intro" /></td>
    
    
  </tr>
  
</table>
</body>
</html>