package String;

import java.util.Scanner;

public class Case_study {

	public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
		StringBuffer a = new StringBuffer();
		StringBuffer b = new StringBuffer();
		System.out.println("1)Car\n2)Bike");
		int n = s.nextInt();
		switch(n) {
		case 1:
		
		System.out.println("Enter the details of car");
		System.out.println("Enter the color");
		a.append("color: " +s.next());
		System.out.println("Enter the maximum speed");
		a.append("\nmaximum speed: " +s.next());
		System.out.println("Enter the number of seats");
		a.append("\nnumber of seats: " +s.next());
		System.out.println("Enter the number of wheels");
		a.append("\nnumber of wheels: " +s.next());
		System.out.println("Enter the number of doors");
		a.append("\nnumber of doors: " +s.next());
		System.out.println("Enter the status of AC(true/false");
		a.append("\nStatus of Ac: " +s.next());
		System.out.println(a);
		break;
		
		case 2:
			System.out.println("Enter the details of bike");
			System.out.println("Enter the color");
			b.append("\ncolor: " +s.next());
			System.out.println("Enter the maximum speed");
			b.append("\nmaximum speed: " +s.next());
			System.out.println("Enter the number of seats");
			b.append("\nnumber of seats: " +s.next());
			System.out.println("Enter the number of wheels");
			b.append("\nnumber of wheels: " +s.next());
			System.out.println("Enter the status of diskbreak(true/false)");
			b.append("\nStatus of Ac: " +s.next());
			
			System.out.println(b);
			break;
		default:
			System.out.println("Invaild Option");
			break;
			
	}
		

}
}