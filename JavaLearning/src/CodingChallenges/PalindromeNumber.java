package CodingChallenges;

public class PalindromeNumber{
	
	public static void isPalindromeNumber(int num) {
	
	System.out.println("Given num::" +num);
	int r = 0;
	int sum =0;
	int t;
	t = num;
	
	while (num>0) {
		r = num%10;
		sum = (sum*10)+r;
		num = num/10;
	}
	if (t==sum) {
		System.out.println("Is Palindrome");
	}else {
		System.out.println("is not Palindrome");
	}
	}
	

	public static void main(String[] args) {
	
		
		isPalindromeNumber(151);
		isPalindromeNumber(12);
		isPalindromeNumber(254);
		isPalindromeNumber(25852);
		isPalindromeNumber(1);
	}

}
