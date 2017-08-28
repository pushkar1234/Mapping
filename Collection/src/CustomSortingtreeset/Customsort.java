package CustomSortingtreeset;

import java.util.Collections;
import java.util.*;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Customsort {

	public static void main(String[] args) {
		Employee employee=new Employee(5,"raj");
		Employee employee2=new Employee(2,"pushkar");
		Set <Employee> employees=new TreeSet<>(new IdComarator());
		employees.add(employee);
		employees.add(employee2);
		
		for (Employee employee3 : employees) {
			System.out.println("Name:"+employee3.getName()+" "+"id:"+employee3.getId());
			break;
		}
		
		// TODO Auto-generated method stub

	}

}
