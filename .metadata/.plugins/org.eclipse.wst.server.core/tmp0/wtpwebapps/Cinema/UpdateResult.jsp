<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Result</title>
<style>
table, th, td {
  border:1px solid black;
}
</style>
</head>
<body>
<jsp:useBean id="updateName" class="tw.cinema.model.Movie" scope="session" />
<jsp:useBean id="updateType" class="tw.cinema.model.Movie" scope="session" />
<jsp:useBean id="updateDate" class="tw.cinema.model.Movie" scope="session" />
<jsp:useBean id="updateLength" class="tw.cinema.model.Movie" scope="session" />
<jsp:useBean id="updateRelease" class="tw.cinema.model.Movie" scope="session" />
<jsp:useBean id="updateGrading" class="tw.cinema.model.Movie" scope="session" />
<jsp:useBean id="updateDirector" class="tw.cinema.model.Movie" scope="session" />
<jsp:useBean id="updateActor" class="tw.cinema.model.Movie" scope="session" />
<jsp:useBean id="updateIntro" class="tw.cinema.model.Movie" scope="session" />

<h1>您已經修改電影資訊如下 :</h1>
<table>
  <tr>
 
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
    <td><jsp:getProperty name="updateName" property="movie_Name" /></td>
    <td><jsp:getProperty name="updateDate" property="movie_Date" /></td>
    <td><jsp:getProperty name="updateLength" property="movie_Length" /></td>
    <td><jsp:getProperty name="updateType" property="type" /></td>
    <td><jsp:getProperty name="updateGrading" property="grading" /></td>
    <td><jsp:getProperty name="updateRelease" property="release" /></td>
    <td><jsp:getProperty name="updateDirector" property="director" /></td>
    <td><jsp:getProperty name="updateActor" property="actor" /></td>
    <td><jsp:getProperty name="updateIntro" property="intro" /></td>
    
    
  </tr>
  
</table>
</body>
</html>