package OneToOneUni;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")
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

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, int pinCode,String street) {
		super();
		City = city;
		this.pinCode = pinCode;
		this.street=street;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", City=" + City + ", pinCode=" + pinCode + ", street=" + street
				+ "]";
	}


    
	
}
