package String;

import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		int uppercase=0,consonant=0,vowel=0,special=0;;
		int i,count;
		int a=str.length();
		System.out.println("length: "+a);
		for(i=0;i<str.length();i++)
		{

		if(str.charAt(i)=='a'|| str.charAt(i)=='A'||str.charAt(i)=='e'||str.charAt(i)=='E'||str.charAt(i)=='i'||str.charAt(i)=='I'||str.charAt(i)=='o'||str.charAt(i)=='O'||str.charAt(i)=='u'||str.charAt(i)=='U')
		{
		
		vowel++;
		}
		else if(str.charAt(i)=='@'||str.charAt(i)=='#'||str.charAt(i)=='$'||str.charAt(i)=='&')
		{
		special++;
		}
		else if(str.charAt(i)>65&&str.charAt(i)<97)
		{
		uppercase++;
		}
		else
		{
		consonant++;
		}
		}
		System.out.println("uppercase: "+uppercase);
		System.out.println("vowel: "+vowel);
		System.out.println("consonants: "+consonant);
		System.out.println("special characters: "+special);
		
		

		

	}

}
