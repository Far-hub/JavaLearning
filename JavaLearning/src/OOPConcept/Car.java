package OOPConcept;

public class Car { //here Car is the class
	
	int mod;
	int wheel;

	public static void main(String[] args) {
		
		Car a = new Car(); // here new Car the object of class 
		Car b = new Car(); //to create an object always use 'new' keyword
		
		a.mod = 2015;
		a.wheel = 4;
		
		b.mod = 2018;
		b.wheel = 4;
		
		System.out.println(a.wheel);
		System.out.println(b.mod);

		
		System.out.println("after shifting object");
		
		a = b;
		b = a;
		
		a.mod=10;
		System.out.println(a.mod);
		b.mod=20;
		System.out.println(a.mod);
				
		
		
		
		
	}

}
