package String;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int i,j;
		System.out.println("Enter the String1");
		String a = s.nextLine();
		String word[] = a.split(" ");
		for(i=0;i<word.length;i++) {
			if(i%2!=0) {
				int l = word[i].length();
				for(j=l-1;j>=0;j--) {
					System.out.print(word[i].charAt(j));
				}
				System.out.print(" ");
			}
			else {
				System.out.print(word[i]+" ");
			}
			
		}
		
		
		
	
	}

	}

