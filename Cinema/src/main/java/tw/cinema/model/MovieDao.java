package tw.cinema.model;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import tw.cinema.util.HibernateUtil;

public class MovieDao {

	private SessionFactory factory;

	public MovieDao() {
		this.factory = HibernateUtil.getSessionFactory();
	}

	public Movie insert(Movie movie) {

		Session session = factory.getCurrentSession();
		Movie newMovie = session.get(Movie.class, movie.getMovie_No());
		if (newMovie == null) {
			session.save(movie);
			return movie;
		}

		return null;
	}

	public boolean delete(int id) {

		Session session = factory.getCurrentSession();
		System.out.println("s");
		Movie theMovie = session.get(Movie.class, id);
		System.out.println("d");
		if (theMovie != null) {
			session.delete(theMovie);
			System.out.println("a");
			return true;
		}
		return false;
	}

	public Movie select(int id) {
		Session session = factory.getCurrentSession();
		return session.get(Movie.class, id);

	}

	public List<Movie> selectAll() {
		Session session = factory.getCurrentSession();
		Query<Movie> query = session.createQuery("from Movie", Movie.class);
		return query.list();
	}

	public Movie updateName(int id, String name) {
		Session session = factory.getCurrentSession();
		Movie movie = session.get(Movie.class, id);
		if (movie != null) {
			movie.setMovie_Name(name);
		}
		return movie;
	}

	public Movie updateLength(int id, int movieLength) {
		Session session = factory.getCurrentSession();
		Movie movie = session.get(Movie.class, id);
		if (movie != null) {
			movie.setMovie_Length(movieLength);
		}
		return movie;
	}

	public Movie updateDate(int id, Date moviedate) {
		Session session = factory.getCurrentSession();
		Movie movie = session.get(Movie.class, id);
		if (movie != null) {
			movie.setMovie_Date(moviedate);
		}
		return movie;
	}

	public Movie updateType(int id, String type) {
		Session session = factory.getCurrentSession();
		Movie movie = session.get(Movie.class, id);
		if (movie != null) {
			movie.setType(type);
		}
		return movie;
	}

	public Movie updateGrading(int id, String grading) {
		Session session = factory.getCurrentSession();
		Movie movie = session.get(Movie.class, id);
		if (movie != null) {
			movie.setGrading(grading);
		}
		return movie;
	}

	public Movie updateRelease(int id, String release) {
		Session session = factory.getCurrentSession();
		Movie movie = session.get(Movie.class, id);
		if (movie != null) {
			movie.setRelease(release);
		}
		return movie;
	}

	public Movie updateActor(int id, String actor) {
		Session session = factory.getCurrentSession();
		Movie movie = session.get(Movie.class, id);
		if (movie != null) {
			movie.setActor(actor);
		}
		return movie;
	}

	public Movie updateDirector(int id, String director) {
		Session session = factory.getCurrentSession();
		Movie movie = session.get(Movie.class, id);
		if (movie != null) {
			movie.setDirector(director);
		}
		return movie;
	}

	public Movie updateIntro(int id, String intro) {
		Session session = factory.getCurrentSession();
		Movie movie = session.get(Movie.class, id);
		if (movie != null) {
			movie.setIntro(intro);
		}
		return movie;
	}

}
