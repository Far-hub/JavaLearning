package CodingChallenges;

public class PrimeNumbers {
	
	
	public static boolean isPrimeNumber(int num) {
		
		if (num<=1) {
			return false;
		}
		
		for (int i=2; i<num; i++) {
			if(num%2==0) {
				return false;
			}
		}
		return true;
		
		
	}
	
	public static void getPrimeNumbers(int num) {
		for (int i=2; i<num; i++) {
			if(isPrimeNumber(i))
			System.out.print(i +" ");
		}
		
	}
	
	public static void main(String[] args) {
		System.out.println("5 prime number::" +isPrimeNumber(5));
		System.out.println("7 prime number::" +isPrimeNumber(7));
		System.out.println("13 prime number::" +isPrimeNumber(13));
		
		getPrimeNumbers(13);
	}

}
