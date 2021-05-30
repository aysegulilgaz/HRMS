package kodlamaio.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "job_positions")
public class JobPosition {

	
	@Id
	@GeneratedValue
	@Column(name = "id")
	private int id;

	@Column(name = "job_position_name") 
	private String jobPositionName;
	

	@Column(name = "job_position_details")
	private String jobPositionDetails;

	public JobPosition() {
		
	}

	public JobPosition(int id, String jobPositionName, String jobPositionDetails) {
		super();
		this.id = id;
		this.jobPositionName = jobPositionName;
		this.jobPositionDetails = jobPositionDetails;
	}

	public int getJobPositionId() {
		return id;
	}

	public void setJobPositionId(int id) {
		this.id = id;
	}

	public String getJobPositionName() {
		return jobPositionName;
	}

	public void setJobPositionName(String jobPositionName) {
		this.jobPositionName = jobPositionName;
	}

	public String getJobPositionDetails() {
		return jobPositionDetails;
	}

	public void setJobPositionDetails(String jobPositionDetails) {
		this.jobPositionDetails = jobPositionDetails;
	}
	
	
	
	
	
}
