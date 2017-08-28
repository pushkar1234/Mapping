package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IdComparator implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getId()-o2.getId();
		
	}

	
	
	public static void main(String[] args) {
		Student student =new Student(102,"raj","karad",'a');
		Student student1 =new Student(101,"aushi","karad",'a');
		List<Student>ls=new ArrayList<>();
		ls.add(student);
		ls.add(student1);
		Collections.sort(ls,new NameComparator());
		System.out.println(ls);
		
	}

}
