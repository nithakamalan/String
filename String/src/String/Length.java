package String;

import java.util.Scanner;

public class Length {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the String1");
		String a = s.nextLine();
		System.out.println("Enter the String1");
		String b = s.nextLine();
		int length = a.length();//to find the length of the string 
		System.out.println("length: "+length);
		char character = a.charAt(4);//character
		System.out.println(character);
		String substring = a.substring(2,4);//substring
		System.out.println("Substring: "+substring);
		boolean Startwith = a.startsWith("the");
		System.out.println("Startwith: "+Startwith);
		int indexof = a.indexOf("is");//indexof-from where is starting
		System.out.println("indexof: "+indexof);
	    String concat = a.concat(b);//Joining 2 String in a and in b
	    System.out.println("concat : "+concat);
	    String word[] = a.split(" ");
	    for(int i=0;i<word.length;i++) {
	    	System.out.println(word[i]);
	    }
	    boolean equal = a.equals(b);
	    System.out.println("equals:" +equal);
	    String replace = a.replace("t", "T");
	    System.out.println("Replace:" +replace);
	    
	    
	    
	}

}
