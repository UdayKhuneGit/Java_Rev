package exceptionHandling;
// unwanted or unexpected situations are Exceptions
//this can terminate normal execution of Program hence needs to be handled
//Hence we recommend Exception Hand	ling
public class Edemo {
 String s ="10";
static String str=null;
	public static void main(String[] args) {
		Edemo d= new Edemo();
		int a= d.s.length(); //jr ka instance variable cha obj create krun dusrya method mdhe use kricha sel tr [obj.var.method] asa call karava lagto 
//		int b= str.length(); // jr ka bahercha var access kricha dusrya method mdhge teva static var declare karaycha jo ikda use krnare
		
		
		try
		{int b= str.length();
		System.out.println(b);
		}
		catch(Exception e) {
			System.out.println(	e.getMessage());
		}
		}

}
