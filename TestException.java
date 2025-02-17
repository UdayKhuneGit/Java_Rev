package exceptionHandling;

public class TestException {
public static void main(String[] args)  {
	String s=null;
	try 
	{int i = s.length();}catch (Exception e) {
System.out.println(e);	}
}
}
