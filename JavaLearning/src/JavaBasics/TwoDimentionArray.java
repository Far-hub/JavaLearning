package JavaBasics;

public class TwoDimentionArray {

	public static void main(String[] args) {
		//two dimentional array
		
		String x[][] = new String [3][4];
		
		//1st row, col 0 to 4
		
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		
		//2nd Row
		x[1][0] ="AA";
		x[1][1] ="BB";
		x[1][2] ="CC";
		x[1][3] ="DD";
		
		x[2][0] ="abc";
		x[2][1] ="efg";
		x[2][2] ="pqr";
		x[2][3] ="xyz";
		
		System.out.println(x[0][3]);
		for (int row=0;row<x.length;row++) {
			for(int col=0;col<x[0].length;col++) {
				System.out.println(x[row][col]);
			}
		}
		
		

	}

}
