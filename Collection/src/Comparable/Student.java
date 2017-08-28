package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
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

	@Override
	public int compareTo(Student o) {
		
		String s=o.name;
		
		return this.name.compareTo(s);
	}
   
	public static void main(String[] args) {
		Student student=new Student(102,"z","karad",'d');
		Student student1=new Student(101,"raj","karad",'a');
		List<Student> ls=new ArrayList<>();
		ls.add(student);
		ls.add(student1);
		Collections.sort(ls);
		
		student.compareTo(student1);
		for (Student student2 : ls) {
         
		System.out.println(student2);
			
		}

	}

}
