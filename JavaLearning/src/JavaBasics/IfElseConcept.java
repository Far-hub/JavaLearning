package JavaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		int i=100;
		int j=200;
		if(i==j) {
			System.out.println("i and j is equal");
		}
		else {
			System.out.println("i and j is not equal");
		}
		int a=100;
		int b=200;
		int c=300;
		if(a>b & a>c) {
			System.out.println("a is bigger");
		}
		else if(b>c) {
			System.out.println("b is bigger");
		}
		else {
			System.out.println("c is bigger");
		}
		
	}

}
