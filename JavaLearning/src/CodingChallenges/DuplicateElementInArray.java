package CodingChallenges;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElementInArray {

	public static void main(String[] args) {
	     
		String names[] = {"java", "perl","ruby", "java", "c","perl"};
		
		for (int i = 0; i <names.length; i++) {
			for (int j =i+1; j<names.length; j++) {
				if (names[i].equals(names[j])){
					System.out.println("Duplicate Elemnet::" +names[i]);
				}
			}
		}
		
		System.out.println("-------------------------------------");
		Set <String> store = new HashSet <String> ();
		for (String name : names) {
			if (store.add(name)==false) {
				System.out.println("Duplicate name::" +name);
			}
			// Wrong --- System.out.println("Duplicate name::" +name);
			
		}
	}

}
