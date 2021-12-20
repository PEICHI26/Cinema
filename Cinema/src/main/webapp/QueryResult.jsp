<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Query Successful</title>
<style>
table, th, td {
  border:1px solid black;
}
</style>
</head>
<body>
	<jsp:useBean id="themovie" class="tw.cinema.model.Movie" scope="session" />
	<h1>
		You have queryed
		<jsp:getProperty name="themovie" property="movie_Name" />
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
    <td><jsp:getProperty name="themovie" property="movie_No" /></td>
    <td><jsp:getProperty name="themovie" property="movie_Name" /></td>
    <td><jsp:getProperty name="themovie" property="movie_Date" /></td>
    <td><jsp:getProperty name="themovie" property="movie_Length" /></td>
    <td><jsp:getProperty name="themovie" property="type" /></td>
    <td><jsp:getProperty name="themovie" property="grading" /></td>
    <td><jsp:getProperty name="themovie" property="release" /></td>
    <td><jsp:getProperty name="themovie" property="director" /></td>
    <td><jsp:getProperty name="themovie" property="actor" /></td>
    <td><jsp:getProperty name="themovie" property="intro" /></td>
    
    
  </tr>
  
</table>
</body>
</html>