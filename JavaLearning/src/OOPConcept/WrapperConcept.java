package OOPConcept;

public class WrapperConcept {

	public static void main(String[] args) {
		String s = "100";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		
		String c = "12.33";
		double d = Double.parseDouble(c);
		System.out.println(c+10);
		//str to int,double, boolean convert use parse;
		
		int a = 10;
		String b = String.valueOf(a); // int, boolean to str conversion use valueof;
		System.out.println(b);
	}

}
