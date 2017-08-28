package OneToMany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table(name="OneTo_Many")
public class Student {
	@Id
	@GeneratedValue
	int studentId;
	@Column
	String studentName;
	@Column
	int studentRollno;

	@OneToMany(cascade=CascadeType.ALL)
	List<Address> addresses;
	
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


	public List<Address> getAddress() {
		return addresses;
	}


	public void setAddress(List<Address> address) {
		this.addresses = address;
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

	


	public Student(String studentName, int studentRollno,List<Address> addresses) {
		super();
		this.studentName = studentName;
		this.studentRollno = studentRollno;
		this.addresses=addresses;
		
	}


	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentRollno=" + studentRollno
				+ ", address=" + addresses + "]";
	}


	
	
	

}
