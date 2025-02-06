package oops_java;


class Person{
	
	private int age;
	private String name;
	
	
	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	void display() {
//	private int age1; // private variable method mdhe accessible naste
//s	String name1;
	}
	
}

class DataStored {
	Person p1= new Person();
//	p1.display();    method call nahi krta yet method chya baher ani direct class mdhe
	void demo() {
		p1.setAge(25);
		p1.setName("Uday");
		System.out.println(p1.getAge());
	}
}


public class Encapsulation{

	public static void main(String[] args) {
		Person p2= new Person();
		DataStored d1= new DataStored();
		p2.setAge(24);
		p2.setName("Uday");
		System.out.println("Name= "+ p2.getName());
		System.out.println("Age= "+p2.getAge());
		
		d1.demo();
	}

}
