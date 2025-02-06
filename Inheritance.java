package oops_java;

public class Inheritance implements Animal {
	
	// konti pn method run karila tya class cha object banvicha asto 
	// interface la body dusrya class mdhe dyichi aste
	// interface impliment krichi asel tr tithlya mrthod ikda bopdy dyavi lagte
	
			@Override
			public void Run() {
				// TODO Auto-generated method stub
				System.out.println("Interface Method");
			}

		public static void main(String[] args) {
		Inheritance inheritance= new Inheritance();
		inheritance.Run();
		
		
			}

	
	
}
