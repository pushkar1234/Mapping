package OneToOneUni;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="Student_Info")
public class Student {
	@Id
	@GeneratedValue
	int studentId;
	@Column
	String studentName;
	@Column
	int studentRollno;

	@OneToOne(cascade=CascadeType.ALL)
	  @JoinTable(
	            name = "Sudent_Address",
	            joinColumns = @JoinColumn(name = "studentId"),
	            inverseJoinColumns = @JoinColumn(name = "addressId")
	    )
	Address address;
	
	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}
	


	public int getStudentRollno() {
		return studentRollno;
	}


	public void setStudentRollno(int studentRollno) {
		this.studentRollno = studentRollno;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	


	public Student(String studentName, int studentRollno,Address address) {
		super();
		this.studentName = studentName;
		this.studentRollno = studentRollno;
		this.address=address;
		
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRollno=" + studentRollno
				+ ", address=" + address + "]";
	}


	
	
	

}
