package emailapp;


import java.util.*;

public class EmailSecondary {
	private String firstName;
	private String lastName;
	private String passwd;
	private String depart;
	private int mailCapacity = 1000;
	private String email;
	private String altEmail;
	
	public EmailSecondary(String fname, String lname) {
		firstName = fname;
		lastName = lname;
		//System.out.println("Name created successfully: " + firstName + " " + lastName);
		this.depart = setDepartment();
		//System.out.println("Department: "+ this.depart);
		this.passwd = password(8);
		//System.out.println("Password: " + this.passwd);
		
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + depart + ".company.com";
		//System.out.println("Company email: " + email);
	}
	
	public String setDepartment() {
		System.out.println("Please enter your department: \n 1: Sales \n 2: Development \n 3: Accounting \n 0:None");
		Scanner scan = new Scanner(System.in);
		int dep = scan.nextInt();
		
		if(dep == 1) {
			return "Sales";
		}
		else if(dep == 2) {
			return "Development";
		}
		else if(dep == 3) {
			return "Accounting";
		}
		else {
			return "";
		}
	}
	
	public String password(int length) {
		String possibleCharString = "QWERTYUIOPASDFGHJKLZXCVBNM1234567890!@#$%^&*";
		char[] pwd = new char[length];
		
		for(int i=0; i<length; i++) {
			int randnum = (int)(Math.random() * possibleCharString.length());
			pwd[i] = possibleCharString.charAt(randnum);
		}
		
		return new String(pwd);
	}
	
	public void setMailCapacity(int capacity) {
		this.mailCapacity = capacity;
	}
	
	public void setOtherEmail(String altEmail) {
		this.altEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.passwd = password;
	}
	
	public int getMailCapacity() {
		return mailCapacity;
	}
	
	public String getAltEmail() {
		return altEmail;
	}
	
	public String getPassword() {
		return passwd;
	}
	
	public String getName() {
		return firstName + " " + lastName;
	}
	
	public String toString() {
		return "Name: " + getName() +
				"\nCompany Email: " + email +
				"\nMail capacity: " + getMailCapacity() + " messages" +
				"\nPassword: " + passwd;
	}
}
