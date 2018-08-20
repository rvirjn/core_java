package sample;

public class stringBuffer {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	sb.append("abcabcabc");
	System.out.println(sb);
	sb.delete(3,50);
	System.out.println(sb);
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	System.out.println("**************");
	StringBuffer sb1 =new StringBuffer();
	sb1.append("12345678987654321");
	System.out.println(sb1.length());
	System.out.println(sb1.capacity());
	sb1.trimToSize();
	System.out.println(sb1.capacity());
	System.out.println(sb1.length());
	System.out.println("----------");
	sb1.deleteCharAt(6);
	System.out.println(sb1);
	
}
}
