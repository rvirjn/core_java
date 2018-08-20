package sample;

public class lastindexOf {
		public static void main(String[] args) {
			String s1 = "abc hello abc";
			String s2 = "abc abc abc abc";
			String s3 = "ab ab ab ab";
			int i = s1.lastIndexOf('a');
			System.out.println(i);
			int v = s1.lastIndexOf('l');
			System.out.println(v);
			int j = s1.lastIndexOf('r');
			System.out.println(j);
			int k = s2.lastIndexOf("abc"); // not understand
			System.out.println(k);
			int g = s2.lastIndexOf("abc", 9);
			System.out.println(g);
			int h = s3.lastIndexOf('a', 7);
			System.out.println(h);
			
		}
}
