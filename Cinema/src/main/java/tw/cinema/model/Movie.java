package tw.cinema.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "movie")
public class Movie implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "movie_No")
	private int movie_No;
	
	@Column(name = "movie_Name")
	private String movie_Name;
	
	@Column(name = "movie_Date")
	private Date movie_Date;
	
	@Column(name = "movie_Length")
	private int movie_Length;
	
	@Column(name = "type")
	private String type;
	
	@Column(name = "grading")
	private String grading;
	
	@Column(name = "release")
	private String release;
	
	@Column(name = "director")
	private String director;
	
	@Column(name = "actor")
	private String actor;
	
	@Column(name = "intro")
	private String intro;
	
	public Movie() {
		super();
	}

	public Movie(String movie_Name, Date movie_Date, int movie_Length, String type, String grading, String release,
			String director, String actor, String intro) {
		super();
		this.movie_Name = movie_Name;
		this.movie_Date = movie_Date;
		this.movie_Length = movie_Length;
		this.type = type;
		this.grading = grading;
		this.release = release;
		this.director = director;
		this.actor = actor;
		this.intro = intro;
	}

	public int getMovie_No() {
		return movie_No;
	}

	public void setMovie_No(int movie_No) {
		this.movie_No = movie_No;
	}

	public String getMovie_Name() {
		return movie_Name;
	}

	public void setMovie_Name(String movie_Name) {
		this.movie_Name = movie_Name;
	}

	public Date getMovie_Date() {
		return movie_Date;
	}

	public void setMovie_Date(Date movie_Date) {
		this.movie_Date = movie_Date;
	}

	public int getMovie_Length() {
		return movie_Length;
	}

	public void setMovie_Length(int movie_Length) {
		this.movie_Length = movie_Length;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getGrading() {
		return grading;
	}

	public void setGrading(String grading) {
		this.grading = grading;
	}

	public String getRelease() {
		return release;
	}

	public void setRelease(String release) {
		this.release = release;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public String getIntro() {
		return intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}
	
	
}
