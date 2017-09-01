package com.design_pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Cloneable{
	
	
	private List<String> empList;
	public Employee(){
		empList = new ArrayList<String>();		
	}
	
	public Employee(List empList){
		this.empList = empList; 
	}
	
	public void loadData(){
		empList.add("Manoj");
		empList.add("Rajkumar");
		empList.add("Durgesh");
		empList.add("Roshan");
	}
	
	
	public List getEmp(){
		return empList;
	}

	@Override
	public Object clone() throws CloneNotSupportedException{
		
		List<String> temp = new ArrayList<String>();
		for (String name : this.empList) {
			temp.add(name);
		}
		
		return new Employee(temp);
	}
}
