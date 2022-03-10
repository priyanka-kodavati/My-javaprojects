package package3;

import package2.M;
import package2.N;
import package2.P;
import package3.X;

public class Z extends M {

	public static void main(String[] args) {
		Z e=new Z();
		N b=new N();
		P c=new P();
		X d=new X();
		e.protectedmethodM();
		e.publicmethodM();
		b.publicmethodN();
		P.publicmethodP();
		d.method1();
	}

}
