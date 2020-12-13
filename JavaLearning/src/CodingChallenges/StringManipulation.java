package CodingChallenges;

public class StringManipulation {

	public static void main(String[] args) {
		//string swap
		String a = "Farjana";
		String b = "Akond";
		
		a = a+b; //appending(FarjanaAkond)
		b = a.substring(0, (a.length()-b.length())); //Farjana
		a = a.substring(b.length()); //Akond
		System.out.println(a);
		System.out.println(b);
		
		
		//split
		String st = "Hello_Farjana_Akond";
		String sp[] = st.split("_");
		for (int i = 0; i <sp.length; i++) {
			System.out.print(sp[i]);
		}
		

	}

}
