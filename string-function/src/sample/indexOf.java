package sample;
//indexOf();
//it gives (-ve) value when element not found.
public class indexOf {
	
	public static void main(String[] args) {
		String s1 ="abc 123 xyz";
		String s2 = "abcabcabc";
		String s3 = "abc abc abc";
		int i = s1.indexOf('a');
		System.out.println(i);
		int j = s1.indexOf("123");
		System.out.println(j);
		int k = s2.indexOf("bc",4); //means 4 index onwards search bc
		System.out.println(k);  // bc meet at 4th place so o/p 4
		int l = s3.indexOf("abc",6);
		System.out.println(l);
		
	}
}
