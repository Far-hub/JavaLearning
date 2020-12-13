package CodingChallenges;

public class RemoveJunk {

	public static void main(String[] args) {
		
		String s = "@@@### Farjana !!!*** Akond %%%";
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
	    System.out.println(s);
	    
	    System.out.println("_______________________");
        
	   String A = "I @@@@ am ((in)) Class ***";
	   
	   A = A.replaceAll("[^a-zA-Z0-9]", "");
	   System.out.println(A);
	   
	   String str = "123 **** My $$$ Program 456";
	   str = str.replaceAll("[^a-zA-Z0-9]", "");
	   System.out.println(str);
	    
	    
	    
	    
	}

}
