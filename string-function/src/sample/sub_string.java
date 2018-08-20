package sample;

public class sub_string {
public static void main(String[] args) {
	String s1 = "Rajesh kumar";
	String s2 = s1.substring(0,6); // 0,3 means 0 to 2
	String s3 = s1.substring(7,12);
	System.out.println(s2+" "+s3);
	System.out.println(s3);
	System.out.println("***********");
	int i = s1.indexOf(' ');
	System.out.println(i);
	String s5 = s1.substring(0,i);
	String s6 = s1.substring(i+1,s1.length());
	System.out.println(s5);
	System.out.println(s6);
	
}
}
