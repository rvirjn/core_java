import java.text.* ;
public class B
{

	public static void main(String[] args)
	{
		int myInt = 163;
		while (myInt<357){
		  //String myStringRepOfInt = String.format("%05d", myInt);
		  //System.out.println("Using String.format: " + myStringRepOfInt);

		  DecimalFormat decimalFormat = new DecimalFormat("00000");
		  String s1= "copy /b";
		  String s3 = "D:\\Merged.mts";
		  System.out.print(decimalFormat.format(myInt)+".MTS+");
		  myInt++;
	}
		}
	
}
