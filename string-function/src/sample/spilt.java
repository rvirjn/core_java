package sample;

public class spilt {
public static void main(String[] args) {
	String s1 ="rajesh;kumar;singh";
	String[] x = s1.split(";");
	for(String s :x)
	{
		System.out.println(s);
	}
	
}
}
