package CodingChallenges;

import java.util.Arrays;

public class SmallAndLargeNumInArray {

	public static void main(String[] args) {
		int num []= {-5,8,15,-1,150};
		int largest = 0;
		int smallest =0;
		
		for (int i = 0; i<num.length; i++) {
			if (num[i]>largest) {
				largest = num[i];
			}else if(num[i]<smallest) {
				smallest = num[i];
			}
		
		}
		System.out.println("given array::" + Arrays.toString(num));
		System.out.println("Largest::" + largest);
		System.out.println("Smallest::" + smallest);
		

	}

}
