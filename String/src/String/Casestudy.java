package String;

import java.util.Scanner;

public class Casestudy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		StringBuffer a = new StringBuffer();
		System.out.println("Registration");
		System.out.println("Enter the name");
		a.append("Name: " +s.next());
		System.out.println("Enter the Address");
		a.append("\nAddress: " +s.next());
		System.out.println("Contact Number");
		a.append("\nContact Number: " +s.next());
		System.out.println("Email ID");
		a.append("\nEmail ID: " +s.next());
		System.out.println("Enter Proof Type");
		a.append("\nproof Type: " +s.next());
		System.out.println("Enter Proof Id");
		a.append("\nproof Id: " +s.next());
		System.out.println("Thank you for registering. Your id is 1...");
		System.out.println("Your details are as follows");
		
		  System.out.println(a);
			   }
			}

	

