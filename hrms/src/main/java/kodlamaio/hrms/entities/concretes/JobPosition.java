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
	@Column(name = "job_position_id")
	private int jobPositionId;

	@Column(name = "job_position_name") 
	private String jobPositionName;
	

	@Column(name = "job_position_details")
	private String jobPositionDetails;

	public JobPosition() {
		
	}

	public JobPosition(int jobPositionId, String jobPositionName, String jobPositionDetails) {
		super();
		this.jobPositionId = jobPositionId;
		this.jobPositionName = jobPositionName;
		this.jobPositionDetails = jobPositionDetails;
	}

	public int getJobPositionId() {
		return jobPositionId;
	}

	public void setJobPositionId(int jobPositionId) {
		this.jobPositionId = jobPositionId;
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
