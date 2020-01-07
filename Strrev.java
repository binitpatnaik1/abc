import java.util.Scanner;

public class Strrev {

	static String rev(String s) {

		char[] a = s.toCharArray();
		char[] rev = new char[a.length];
		for (int i = 0; i < a.length; i++) {
			rev[a.length - i - 1] = a[i];
		}
		
		for (int i = 0; i <a.length; i++) {
			if((int)a[i]>=97&&(int)a[i]<=122){
				if((int)rev[i]>=65 && (int)rev[i]<=90){
					char z= rev[i];
					int x = (int)z + 32;
					rev[i]= (char)x;
				}
		}

	}
		
		for (int i = 0; i <a.length; i++) {
			if((int)a[i]>=65&&(int)a[i]<=90){
				if((int)rev[i]>=97 && (int)rev[i]<=122){
					char z= rev[i];
					int x = (int)z - 32;
					rev[i]= (char)x;
				}
		}

	}

	String reverse = new String(rev);
	return reverse;
}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		System.out.println("The reverse string is: "+ rev(s));

	}

}
