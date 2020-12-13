package JavaBasics;

public class ArrayConcept {

	//one dimention array
	public static void main(String[] args) {
		//array
		int i[]= new int[4];
		i[0]=10;
		i[1]=20;
		i[2]=30;
		i[3]=40;
		System.out.println(i[0]);
        for (int j=1;j<i.length;j++) {
	    System.out.println(i[j]);
        
        }
        
        //object is super class of all class
        
        
        Object ob[] = new Object[5];
        ob[0] = 10;
        ob[1] = 21.50;
        ob[2] = true;
        ob[3] = '#';
        ob[4] = "Juthi";
        
        System.out.println(ob.length);
        for (int a=0;a<ob.length;a++) {
        	System.out.println(ob[a]);
        }
        
        
        }
	
	
	
	
	
	
	
}