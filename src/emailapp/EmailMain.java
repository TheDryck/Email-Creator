package emailapp;

import java.util.Scanner;

public class EmailMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmailSecondary email1 = new EmailSecondary("Jack", "Black");
		
		System.out.println(email1.toString());
		
		System.out.println("Would you like to change your password? Y: Yes N: No");
		Scanner in = new Scanner(System.in);
		String option = in.next();
		
		if(option.equalsIgnoreCase("Y")){
			System.out.println("Enter new password");
			Scanner wrd = new Scanner(System.in);
			String pass = wrd.next();
			
			email1.changePassword(pass);
			System.out.println("Password changed successfully!");
		}
		else {
			System.out.println("Koolio!!");
		}
	}

}
