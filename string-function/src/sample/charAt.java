package sample;
//charAt()
//in which line exception arrised... program will terminated.
public class charAt {
	public static void main(String[] args) {
		String s1 = "abcxyz";
			System.out.println(s1.charAt(2));
			char c1= s1.charAt(3);
			System.out.println(c1);
			System.out.println(s1.charAt(20));//Exception
			System.out.println("done"); // this statement not printed.becoz exception before
			
	}
}
