package kodlamaio.hrms.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "job_seekers")
public class JobSeeker {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "identity_number")
	private String identityNumber;

	@Column(name = "year_of_birth")
	private Date yearOfBirth;

	@OneToOne()
	@JoinColumn(name = "user_id")
	private User user;

	public JobSeeker() {

	}

	public JobSeeker(int id, String firstName, String lastName, String identityNumber, Date yearOfBirth, User user) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.identityNumber = identityNumber;
		this.yearOfBirth = yearOfBirth;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Date getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Date yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
