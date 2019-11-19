package String;

public class String_newString {

	public static void main(String[] args) {
		StringBuffer a = new StringBuffer("HELLO");
		StringBuffer b = new StringBuffer("HELLO WORLD");
		StringBuffer c = new StringBuffer("HELLO WORLD");
		StringBuffer d = new StringBuffer("HELLO WORLD");
		a.append(" WORLD");
		b.delete(0, 6);
	    c.replace(5,8,"welcome");
	    d.deleteCharAt(7);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
	}

}
