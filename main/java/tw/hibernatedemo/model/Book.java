package tw.hibernatedemo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;



@Entity
@Table(name = "books")
public class Book implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	private String booktitle;
	private String publicYear;

	@Column(name = "fk_user_id")
	@Transient
	private int userId;

	@ManyToOne
	@JoinColumn(name = "fk_user_id")
	private BookUsers bookUsers;

	public Book() {

	}
	

	public Book(String booktitle, String publicYear) {
		super();
		this.booktitle = booktitle;
		this.publicYear = publicYear;
		
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBooktitle() {
		return booktitle;
	}

	public void setBooktitle(String booktitle) {
		this.booktitle = booktitle;
	}

	public String getBookYear() {
		return publicYear;
	}

	public void setBookYear(String publicYear) {
		this.publicYear = publicYear;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public BookUsers getBookUsers() {
		return bookUsers;
	}

	public void setBookUsers(BookUsers bookUsers) {
		this.bookUsers = bookUsers;
	}
  
}
