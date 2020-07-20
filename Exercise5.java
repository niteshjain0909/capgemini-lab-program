package lab5;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		  UserAge mUserAge = new UserAge();
		 
		 Scanner scAge = new Scanner(System.in);
		 
		 int age = scAge.nextInt();
		 
		 try {
			  
			 mUserAge.setAge(age);
			 
		 }catch(ArithmeticException e) {
			 
			 System.out.println(e.getMessage());
			 
		 }
		 
	}

}

class UserAge{
	
	private int age;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
		
		if(age>15) {
			
			System.out.println("Right Age");
		}else {
			throw new ArithmeticException("Age should be greater than 15");
		}
	}
	
	
	
	
}