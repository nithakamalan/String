package String;
import java.util.Scanner;
public class Flames {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the String1");
		StringBuffer name1=new StringBuffer(s.next());
		System.out.println("Enter the String2");
		
		StringBuffer name2=new StringBuffer(s.next());
		
		
		for(int i=0;i<name1.length();i++)
		{
			char a=name1.charAt(i);
			for(int j=0;j<name2.length();j++)
			{
				char b=name2.charAt(j);
				if(a==b)
				{
					name1.replace(i,i+1,"0");
					name2.replace(j,j+1,"0");
					
				}
			}
		}
		
		
		
		
		
		
		
		
}
}
	
	