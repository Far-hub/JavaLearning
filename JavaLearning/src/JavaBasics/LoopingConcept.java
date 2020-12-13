package JavaBasics;

public class LoopingConcept {

	public static void main(String[] args) {
		//while loop
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("*******");
		
		for(int j=1;j<=10;j++) {   //initialization, conditional, incremental
			System.out.println(j);
			
		}
		System.out.println("########");
		for (int k=10; k>=-10; k--) {  //initialization, conditional, decremental
			System.out.println(k);
		}
		//i++ means i=i+1
		//k-- means k=k-1

	}

}
