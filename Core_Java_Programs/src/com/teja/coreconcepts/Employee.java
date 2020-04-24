package com.teja.coreconcepts;

public class Employee {
	private String empId;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Employee(String name) {
		super();
		this.name = name;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	public static void main(String[] args) {
		
		Employee emp=new Employee("Dharma");
		emp.setName("Teja");
		System.out.println(emp);
		
		String s=new String("Dharma");
		String s1=s.concat("Teja");
		System.out.println(s);
		System.out.println(s1);
	
	}
	
}



