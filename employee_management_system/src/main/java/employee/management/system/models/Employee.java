package employee.management.system.models;

import javax.persistence.*;

@Entity
@Table(name = "employees")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Long id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "second_name")
	private String secondName;

	@Column(name = "address")
	private String address;

	@Column(name = "mobile_no")
	private int mobileNo;

	@Column(name = "email")
	private String email;

	public Employee() {

	}

	public Employee(String firstName, String secondName, String address, int mobileNo, String email) {
		this.firstName = firstName;
		this.secondName = secondName;
		this.address = address;
		this.mobileNo = mobileNo;
		this.email = email;
	}

	// getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(int mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", secondName=" + secondName + ", address=" + address
				+ ", mobileNo=" + mobileNo + ", email=" + email + "]";
	}

}
