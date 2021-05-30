package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employers")
public class Employer {

	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "company_web_site")
	private String companyWebSite;

	@Column(name = "company_phone_number")
	private String companyPhoneNumber;

	@OneToOne()
	@JoinColumn(name = "user_id")
	private User user;

	public Employer() {

	}

	public Employer(int id, String companyName, String companyWebSite, String companyPhoneNumber, User user) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.companyWebSite = companyWebSite;
		this.companyPhoneNumber = companyPhoneNumber;
		this.user = user;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyWebSite() {
		return companyWebSite;
	}

	public void setCompanyWebSite(String companyWebSite) {
		this.companyWebSite = companyWebSite;
	}

	public String getCompanyPhoneNumber() {
		return companyPhoneNumber;
	}

	public void setCompanyPhoneNumber(String companyPhoneNumber) {
		this.companyPhoneNumber = companyPhoneNumber;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
