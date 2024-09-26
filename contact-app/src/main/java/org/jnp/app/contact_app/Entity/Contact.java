package org.jnp.app.contact_app.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "p_contact")
public class Contact {
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(columnDefinition="bigint",nullable = true)
	private Long id;	
	@Column(columnDefinition="VARCHAR(30)",nullable = false)
	private String first_name;
	@Column(columnDefinition="VARCHAR(30)",nullable = false)
	private String middle_name;
	@Column(columnDefinition="VARCHAR(30)",nullable = true)
	private String last_name;
	@Column(columnDefinition="VARCHAR(12)",nullable = false)
	private String phone;
	@Column(columnDefinition="VARCHAR(50)",nullable = false)
	private String email;
	@Column(columnDefinition="VARCHAR(11)",nullable = false)
	private String ssn;
	@Column(columnDefinition="VARCHAR(30)",nullable = true)
	private String marital_status;
	@Column(columnDefinition="VARCHAR(1)",nullable = true)
	private String gender;
	@Column(columnDefinition="VARCHAR(50)",nullable = true)
	private String race;
	@Column(columnDefinition="VARCHAR(100)",nullable = true)
	private String education;

	public Contact(Long id, String first_name, String middle_name, String last_name, String phone, String email,
			String ssn, String marital_status, String gender, String race, String education) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.middle_name = middle_name;
		this.last_name = last_name;
		this.phone = phone;
		this.email = email;
		this.ssn = ssn;
		this.marital_status = marital_status;
		this.gender = gender;
		this.race = race;
		this.education = education;
		
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getMarital_status() {
		return marital_status;
	}
	public void setMarital_status(String marital_status) {
		this.marital_status = marital_status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRace() {
		return race;
	}
	public void setRace(String race) {
		this.race = race;
	}
	public String getEducation() {
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
