package com.design_pattern.creational.prototype;

import java.util.List;

public class PrototypePattern {
	
	public static void main(String[] arg) throws CloneNotSupportedException{
		Employee emp = new Employee();
		emp.loadData();
		
		Employee emp1 = (Employee)emp.clone();
		List<String> list1 = emp1.getEmp();
		System.out.println("====");
		System.out.println(list1);
		list1.add("Nitin");
		System.out.println(list1);
		
		Employee emp2 = (Employee)emp.clone();
		List<String> list2 = emp2.getEmp();
		System.out.println("====");
		System.out.println(list2);
		list2.remove("Rajkumar");
		System.out.println(list2);
		System.out.println(emp.getEmp());
	}

}
