package tw.cinema.service;

import java.util.Date;
import java.util.List;

import tw.cinema.model.Movie;
import tw.cinema.model.MovieDao;

public class MovieService {

	private MovieDao movieDao;

	public MovieService() {

		this.movieDao = new MovieDao();

	}

	public Movie insert(Movie movie) {
		Movie newMovie = movieDao.insert(movie);
		if (newMovie != null) {
			return newMovie;
		}
		return null;
	}

	public boolean delete(int id) {
		boolean oneMovie = movieDao.delete(id);
		return oneMovie;
	}

	public Movie select(int id) {
		Movie oneMovie = movieDao.select(id);
		return oneMovie;
	}

	public List<Movie> selectAll() {
		List<Movie> all = movieDao.selectAll();
		return all;
	}

	public Movie updateName(int id, String name) {
		Movie updateMovie = movieDao.updateName(id, name);
		return updateMovie;
	}

	public Movie updateLength(int id, int movielength) {
		Movie updateMovie = movieDao.updateLength(id, movielength);
		return updateMovie;
	}

	public Movie updateDate(int id, Date moviedate) {
		Movie updateMovie = movieDao.updateDate(id, moviedate);
		return updateMovie;
	}

	public Movie updateType(int id, String type) {
		Movie updateMovie = movieDao.updateType(id, type);
		return updateMovie;
	}

	public Movie updateGrading(int id, String grading) {
		Movie updateMovie = movieDao.updateGrading(id, grading);
		return updateMovie;
	}

	public Movie updateRelease(int id, String release) {
		Movie updateMovie = movieDao.updateRelease(id, release);
		return updateMovie;
	}

	public Movie updateActor(int id, String actor) {
		Movie updateMovie = movieDao.updateActor(id, actor);
		return updateMovie;
	}

	public Movie updateDirector(int id, String director) {
		Movie updateMovie = movieDao.updateDirector(id, director);
		return updateMovie;
	}

	public Movie updateIntro(int id, String intro) {
		Movie updateMovie = movieDao.updateIntro(id, intro);
		return updateMovie;
	}
}
