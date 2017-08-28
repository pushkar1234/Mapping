package Comparator;

public class Student {
	private int id;
	private String name;
	private String Address;
	private char c;
	
	public char getC() {
		return c;
	}

	public void setC(char c) {
		this.c = c;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
    
	
	public Student(int id, String name, String address ,char c) {
		super();
		this.id = id;
		this.name = name;
		this.Address = address;
		this.c=c;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", Address=" + Address + ", c=" + c + "]";
	}


}
