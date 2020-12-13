package CodingChallenges;

public class ReverseInteger {

	public static void main(String[] args) {
		int i = 12345;
		int rev =0;
		while(i!=0) {
			rev= rev*10 + i%10;
			i = i/10;
		}
		System.out.println("Reverse int::"+rev);
		
       int num = 987654321;
	   int rv = 0;
	   while(num!=0) {
	   
	   rv = rv*10 + num%10;
	   num = num/10;
	}
      System.out.println("Reverse num::"+ rv);
      System.out.println("--------------");
      
      
      //String Buffer solution
      
      int n = 1234567;
      System.out.println(new StringBuffer(String.valueOf(n)).reverse());
      
      int in = 56789;
      System.out.println(new StringBuffer(String.valueOf(in)).reverse());
      
     
      
 }
}