package OOPConcept;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();
		obj.nike();
		int l = obj.footlocker();
		System.out.println(l);
        String s1 = obj.macy();
        System.out.println(s1);
        int zz = obj.math(30, 10);
        System.out.println(zz);
 
        
	}
	
	public void nike() {
		System.out.println("nike method");
		
		
		}
	
	public int footlocker() {
	   System.out.println("footlocker method");
	   int c=10;
	   int d=20;
	   int f=c+d;
	   return f;
		
		}
	public String macy() {
		System.out.println("macy method");
		String s="Selenium";
				
		return s;
	}
	public int math(int x,int y) {
		System.out.println("math method");
		int z = x/y;
		return z;
		
		
		
	}
	

}
