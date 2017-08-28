package OneToOneBi;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address_Info")
public class Address {
	@Id
	@GeneratedValue
	int addressId;
	@Column
	String City;
	@Column
	int pinCode;
	@Column
	String street;
	@OneToOne(cascade=CascadeType.ALL)
	Student student;
   
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, int pinCode,String street,Student student) {
		super();
		City = city;
		this.pinCode = pinCode;
		this.street=street;
		this.student=student;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", City=" + City + ", pinCode=" + pinCode + ", street=" + street
				+ "]";
	}

	


    
	
}
