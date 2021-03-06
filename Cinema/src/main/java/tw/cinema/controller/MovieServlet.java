package tw.cinema.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




import tw.cinema.model.Movie;
import tw.cinema.service.MovieService;

@WebServlet("/MovieServlet")
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MovieServlet() {
		super();

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");

		MovieService movieService = new MovieService();
		if (request.getParameter("QUERY") != null) {
			processQuery(request, response, movieService);
		}
		if (request.getParameter("QUERYALL") != null) {
			processQueryAll(request, response, movieService);
		}

		if (request.getParameter("INSERT") != null) {
			processInsert(request, response, movieService);
		}
		if (request.getParameter("DELETE") != null) {
			processDelete(request, response, movieService);
		}
		if (request.getParameter("UPDATENAME") != null) {
			processUpdateName(request, response, movieService);
		}
		if (request.getParameter("UPDATELENGTH") != null) {
			processUpdateLength(request, response, movieService);
		}
		if (request.getParameter("UPDATEDATE") != null) {
			processUpdateDate(request, response, movieService);
		}
		if (request.getParameter("UPDATETYPE") != null) {
			processUpdateType(request, response, movieService);
		}
		if (request.getParameter("UPDATEDIRECTOR") != null) {
			processUpdateDirector(request, response, movieService);
		}
		if (request.getParameter("UPDATEACTOR") != null) {
			processUpdateActor(request, response, movieService);
		}
		if (request.getParameter("UPDATEGRADING") != null) {
			processUpdateGrading(request, response, movieService);
		}
		if (request.getParameter("UPDATERELEASE") != null) {
			processUpdateRelease(request, response, movieService);
		}
		if (request.getParameter("UPDATEINTRO") != null) {
			processUpdateIntro(request, response, movieService);
		}
	}

	private void processUpdateIntro(HttpServletRequest request, HttpServletResponse response,
			MovieService movieService) throws ServletException, IOException {
		int movieno = Integer.parseInt(request.getParameter("movieno"));
		String intro = request.getParameter("intro");
		Movie updateIntro = movieService.updateIntro(movieno, intro);
		request.getSession(true).setAttribute("updateIntro", updateIntro);
		if (updateIntro !=null) {
			request.getRequestDispatcher("UpdateResult.jsp").forward(request, response);
		}
	}

	private void processUpdateRelease(HttpServletRequest request, HttpServletResponse response,
			MovieService movieService) throws ServletException, IOException {
		int movieno = Integer.parseInt(request.getParameter("movieno"));
		String release = request.getParameter("release");
		Movie updateRelease = movieService.updateRelease(movieno, release);
		request.getSession(true).setAttribute("updateRelease", updateRelease);
		if (updateRelease !=null) {
			request.getRequestDispatcher("UpdateResult.jsp").forward(request, response);
		}
	}

	private void processUpdateGrading(HttpServletRequest request, HttpServletResponse response,
			MovieService movieService) throws ServletException, IOException {
		int movieno = Integer.parseInt(request.getParameter("movieno"));
		String grading = request.getParameter("grading");
		Movie updateGrading = movieService.updateGrading(movieno, grading);
		request.getSession(true).setAttribute("updateGading", updateGrading);
		if (updateGrading !=null) {
			request.getRequestDispatcher("UpdateResult.jsp").forward(request, response);
		}
	}

	private void processUpdateActor(HttpServletRequest request, HttpServletResponse response,
			MovieService movieService) throws ServletException, IOException {
		int movieno = Integer.parseInt(request.getParameter("movieno"));
		String actors = request.getParameter("actors");
		Movie updateActor = movieService.updateActor(movieno, actors);
		request.getSession(true).setAttribute("updateActor", updateActor);
		if (updateActor !=null) {
			request.getRequestDispatcher("UpdateResult.jsp").forward(request, response);
		}
	}

	private void processUpdateDirector(HttpServletRequest request, HttpServletResponse response,
			MovieService movieService) throws ServletException, IOException {
		int movieno = Integer.parseInt(request.getParameter("movieno"));
		String director = request.getParameter("director");
		Movie updateDirector = movieService.updateDirector(movieno, director);
		request.getSession(true).setAttribute("updateDirector", updateDirector);
		if (updateDirector !=null) {
			request.getRequestDispatcher("UpdateResult.jsp").forward(request, response);
		}
	}

	private void processUpdateType(HttpServletRequest request, HttpServletResponse response,
			MovieService movieService) throws ServletException, IOException {
		int movieno = Integer.parseInt(request.getParameter("movieno"));
		String type = request.getParameter("type");
		Movie updateType = movieService.updateType(movieno, type);
		request.getSession(true).setAttribute("updateType", updateType);
		if (updateType !=null) {
			request.getRequestDispatcher("UpdateResult.jsp").forward(request, response);
		}
	}

	private void processUpdateDate(HttpServletRequest request, HttpServletResponse response,
			MovieService movieService) throws ServletException, IOException {
		int movieno = Integer.parseInt(request.getParameter("movieno"));
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = (Date) formatter.parse(request.getParameter("rdate"));
		} catch (ParseException e) {

			e.printStackTrace();
		}
		Movie updateDate = movieService.updateDate(movieno, date);
		request.getSession(true).setAttribute("updateDate", updateDate);
		if (updateDate !=null) {
			request.getRequestDispatcher("UpdateResult.jsp").forward(request, response);
		}
	}

	private void processUpdateLength(HttpServletRequest request, HttpServletResponse response,
			MovieService movieService) throws ServletException, IOException {
		int movieno = Integer.parseInt(request.getParameter("movieno"));
		Integer movielength = Integer.parseInt(request.getParameter("movielength"));
		Movie updateLength = movieService.updateLength(movieno, movielength);
		request.getSession(true).setAttribute("updateLength", updateLength);
		if (updateLength !=null) {
			request.getRequestDispatcher("UpdateResult.jsp").forward(request, response);
		}
	}

	private void processQueryAll(HttpServletRequest request, HttpServletResponse response, MovieService movieService)
			throws ServletException, IOException {
		List<Movie> allMovie = movieService.selectAll();
		request.getSession(true).setAttribute("allMovie", allMovie);
		request.getRequestDispatcher("QueryAll.jsp").forward(request, response);


	}

	private void processUpdateName(HttpServletRequest request, HttpServletResponse response,
			MovieService movieService) throws ServletException, IOException {
		int movieno = Integer.parseInt(request.getParameter("movieno"));
		String moviename = request.getParameter("moviename");
 
		Movie updateName = movieService.updateName(movieno, moviename);
		request.getSession(true).setAttribute("updateName", updateName);
		if (updateName != null) {
			request.getRequestDispatcher("UpdateResult.jsp").forward(request, response);
		}

	}

	private void processDelete(HttpServletRequest request, HttpServletResponse response, MovieService movieService)
			throws ServletException, IOException {
		int movieno = Integer.parseInt(request.getParameter("movieno"));
		boolean deleteMovie = movieService.delete(movieno);
		if (deleteMovie) {
			request.getRequestDispatcher("DeleteResult.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		}

	}

	private void processInsert(HttpServletRequest request, HttpServletResponse response, MovieService movieService)
			throws ServletException, IOException {
		String moviename = request.getParameter("moviename");
		Integer movielength = Integer.parseInt(request.getParameter("movielength"));
		String type = request.getParameter("type");
		String grading = request.getParameter("grading");
		String release = request.getParameter("release");
		String director = request.getParameter("director");
		String actors = request.getParameter("actors");
		String intro = request.getParameter("intro");
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = (Date) formatter.parse(request.getParameter("rdate"));
		} catch (ParseException e) {

			e.printStackTrace();
		}
		Movie movie = new Movie(moviename, date, movielength, type, grading, release, director, actors, intro);
		request.getSession(true).setAttribute("movie", movie);
		Movie insertMovie = movieService.insert(movie);
		if (insertMovie != null) {
			request.getRequestDispatcher("CreateResult.jsp").forward(request, response);
			request.getSession(true).invalidate();
		} else {
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		}

	}

	private void processQuery(HttpServletRequest request, HttpServletResponse response, MovieService movieService)
			throws ServletException, IOException {
		int movieno = Integer.parseInt(request.getParameter("movieno"));
		Movie themovie = movieService.select(movieno);
		request.getSession(true).setAttribute("themovie", themovie);
		if (themovie != null) {
			request.getRequestDispatcher("QueryResult.jsp").forward(request, response);
		} else {
			request.getRequestDispatcher("Error.jsp").forward(request, response);
		}
	}

}
