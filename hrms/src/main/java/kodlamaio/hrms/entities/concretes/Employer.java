package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employers")

@Data
@AllArgsConstructor
@NoArgsConstructor
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


}
