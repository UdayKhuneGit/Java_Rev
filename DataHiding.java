package oops_java;

import basic_java_1.Demo;

class AccessModifiers{
	public int a=183;
	public String s="Uday";
	
	private int P=007;
	protected int p= 005;
}

public class DataHiding {

	public static void main(String[] args) {
		AccessModifiers obj = new AccessModifiers();
		Test111 t1= new Test111();
		Demo di=new Demo();
	//	System.out.println(obj.P);  private itghe access nahi bhetat tyac ch class mdhe scope asto
		System.out.println(obj.a);
		System.out.println(obj.p);
		System.out.println(obj.s);
		System.out.println(t1.p1); // same package che protected diff class mdhe chaltat
//		System.out.println(di.hd);   dusrya packade madhlya class mdhle protected nahi access bhetat
		



		System.out.println("DataHiding");
		
	}

}
