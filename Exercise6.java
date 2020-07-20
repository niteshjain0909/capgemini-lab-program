package com.cg.eis.exception;

import java.util.*;

public class Employee {

	public static void main(String[] args) {
		System.out.println("ENTER YOUR SALARY");
		EmployeeSalary em= new EmployeeSalary();
		try{
			em.showSalary();
			System.out.println("Your salary= "+em.getsalary());
			
	}catch(Exception e) {
		System.out.println(e.getMessage());
	}
}
	}


class EmployeeException extends Exception{
	String s;
	EmployeeException(String m){
		s=m;
	}
	public String getMessage() {
	return s;
	}	
}
class EmployeeSalary{
	Scanner s=new Scanner(System.in);
    int salary=s.nextInt();
    public void showSalary() throws EmployeeException{
           if(salary<3000) {
            	throw new EmployeeException("SALARY IS BELOW 3000");
            }
            		
           	}
            	public int getsalary() {
            		return salary;
            	}
            	
            	
}
