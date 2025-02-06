package oops_java;


 class Test extends demo11{
	 void withoutBody() {};
	 void withbody() {
		 System.out.println("bastract class mdhe abstract keyword n VAPARTA MRTHOD la body deta yete");
	 }
	 
	 
	void withoutbody1() {
System.out.println("abstract class mdhli unimplimented method la body dyavi lagte");		
	}
	
}

abstract class demo11 {
	abstract void withoutbody1();
	void withbody1(){
		System.out.println("Extend kela test mdhe");
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1= new Test(); // extend n krta obj create nahi krt abstract class cha extend karava lagto
//		demo11 d0= new demo11(); //  abstract class cha object create nahi hot
		t1.withbody();
		t1.withoutBody();
		t1.withbody1();
		t1.withoutbody1();
	}

}
