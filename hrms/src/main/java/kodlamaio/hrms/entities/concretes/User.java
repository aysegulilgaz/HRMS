package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;

	@Column(name = "e_mail")
	private String eMail;

	@Column(name = "e_mail_repeat")
	private String eMailRepeat;

	@Column(name = "passsword")
	private String passsword;

	@Column(name = "passsword_repeat")
	private String passswordRepeat;

	public User() {

	}

	public User(int id, String eMail, String eMailRepeat, String passsword, String passswordRepeat) {
		super();
		this.id = id;
		this.eMail = eMail;
		this.eMailRepeat = eMailRepeat;
		this.passsword = passsword;
		this.passswordRepeat = passswordRepeat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String geteMailRepeat() {
		return eMailRepeat;
	}

	public void seteMailRepeat(String eMailRepeat) {
		this.eMailRepeat = eMailRepeat;
	}

	public String getPasssword() {
		return passsword;
	}

	public void setPasssword(String passsword) {
		this.passsword = passsword;
	}

	public String getPassswordRepeat() {
		return passswordRepeat;
	}

	public void setPassswordRepeat(String passswordRepeat) {
		this.passswordRepeat = passswordRepeat;
	}

}