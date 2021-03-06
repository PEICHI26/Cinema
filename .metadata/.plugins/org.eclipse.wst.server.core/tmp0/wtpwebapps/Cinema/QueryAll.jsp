<%@page import="tw.cinema.model.Movie"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Query all</title>
<style>
table, th, td {
  border:1px solid black;
}
</style>
</head>
<body>
<h1>All Movies</h1>

<% List<Movie> movies = (List<Movie>)request.getAttribute("allMovie"); %>
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
<c:forEach items="${allMovie}" var="element">  
  
  <tr> 
    <td>${element.movie_No}</td> 
    <td>${element.movie_Name}</td>
    <td>${element.movie_Date}</td> 
    <td>${element.movie_Length}</td>
    <td>${element.type}</td> 
    <td>${element.grading}</td>
    <td>${element.release}</td>
    <td>${element.director}</td> 
    <td>${element.actor}</td>
    <td>${element.intro}</td>   
  </tr> 
  
 
</c:forEach> 
</table>
</body>
</html>