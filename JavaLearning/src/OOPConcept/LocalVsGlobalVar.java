package OOPConcept;

public class LocalVsGlobalVar {
      
	String s ="Farjana";  //here s is global var
	int i = 25;           // here i is global var
	
	
	
	public static void main(String[] args) {
		
		LocalVsGlobalVar ob = new LocalVsGlobalVar();
		System.out.println(ob.s);
		System.out.println(ob.i);
		
		int l = 10;    // here l is Local Var of main method
		System.out.println(l);
		
		double s = ob.sum();
		System.out.println(s);

	}
   
	public double sum() {
		System.out.println("sum method");
		double d = 10.50;  // here d & c are local var of sum method
		double c = 20.25;
		double e = c+d;
		return e;
		
	}
}
