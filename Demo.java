package basic_java_1;

class DataTypes{
	// Bytes (Range- between -128 to 127 tyanantr error yeta )
	byte b=123;
//	byte b1=197;
	
	//short (Range- between -3276 -2*(15)   32767  2*(15))
	short s=28736;
//	short s1=45658;
	
	//Integer
	int i =11809347;
//	int i1=798687565765;
	 int max_min(){
		 return Integer.MAX_VALUE;
	 }
	
//	long(Range between lai mothi) where int is not sufficient to store data
	long l = 7987987;
	
//	Float la f dyava lagta pudhe
	float f=13.4f;
	
//	Double(Range)
	double d =10.3565;
	
//	Character (Range 0- 65536) value single quote mdhge ch pahije
	char ch ='k';
//	char ch1='jd'; // single character allowed asta
	// jast char sathi string Use krichi
	
//	Boolean (trur or false asta)
	boolean b1=true;
	boolean b2= false;
	
	
	//String
	String str= "jhdso";
		
}

class Scopes{
//	 Global Variables - class chya aat pn method chya baher declare kricha
//	 Static Variables - value change nahi hot mg class mdhe declare kricha mrthod mdhe nahi ha class 
//	leavel la same asto 
	
	
	public int hd=77767;
	
	static int a=0;	//static
	int b=10;        // Global
	void add(){
		int c=8;    //Local
		System.out.println(b+c);
	}
	
}

public class Demo {

	protected int hd=77767;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTypes d= new DataTypes();
		Scopes s1=new Scopes();
		System.out.println(d.b);
		System.out.println(d.s);
		System.out.println(d.i);
		System.out.println(d.ch);
		System.out.println(d.l);
		System.out.println(d.f);
		System.out.println(d.b1);
		System.out.println(d.b2);
		System.out.println(d.d);
		
		System.out.println(d.str);
		System.out.println("Datatypes zale");

		s1.add();

		System.out.println(s1.a);
		System.out.println(d.max_min());
	}

}
