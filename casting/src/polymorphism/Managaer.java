package polymorphism;

import java.io.IOException;

public class Managaer
{


		public static void main(String[] args) 
		{
			E e1 = new E();
			F f1 = new F();
			G g1 = new G();
			E e2 = new G();
			E e3 = new F();
			E[]x = new F[5];//[new E,new F,new G,new G,new F]
			//x[0]=e1;
			x[1] = f1;
			x[2] = g1;
			x[3] = e2;
			x[4] = e3;
			for(int i = 0; i< x.length; i++)
			{
			x[i].test();
			}
		}

}
