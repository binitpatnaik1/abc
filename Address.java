import java.util.Scanner;

public class Address {

	static void hasUpper(String s) {
		char[] st = s.toCharArray();
		int flag = 0;
		for (char a : st) {
			if (a >= 'A' && a <= 'Z') {
				flag++;
			}
		}
		if (flag > 0) {
			System.out.println("String has upper");
		} else {
			System.out.println("String does not have upper");
		}

	}

	static void hasNumber(String s) {
		char[] st = s.toCharArray();
		int flag = 0;
		for (char c : st) {
			if (c >= '0' && c <= '9') {
				flag++;
			}
		}
		if (flag > 0) {
			System.out.println("String has number");
		} else {
			System.out.println("String does not have number");
		}

	}

	static boolean allUpper(String s) {

		char[] st = s.toCharArray();
		int flag = 0;
		for (int i = 0; i < st.length; i++) {
			if (st[i] >= 'A' && st[i] <= 'Z') {
				flag++;
			}
		}
		if (flag == st.length) {
			return true;
		} else {

			return false;
		}

	}

	static int countCaps(String s) {

		char[] st = s.toCharArray();
		int flag = 0;
		for (int i = 0; i < st.length; i++) {
			if (st[i] >= 'A' && st[i] <= 'Z') {
				flag++;
			}
		}
		return flag;
	}

	static boolean isEqual(char c1, char c2) {
		char a = c1;
		char b = c2;
		if (a == b) {
			return true;
		} else {
			return false;
		}

	}

	static boolean isStringEqual(String s1, String s2) {
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		if (a.length == b.length) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == b[i] || (int) a[i] + 32 == (int) b[i] || (int) a[i] == (int) b[i] + 32) {

					return true;
				}
			}
		} 
		return false;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check");
		String s = sc.nextLine();
		hasUpper(s);
		hasNumber(s);
		System.out.println("Is String uppercase?: " + allUpper(s));
		System.out.println("Number of uppercase letters: " + countCaps(s));
		System.out.println("Enter two strings to compare: ");
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		System.out.println("Are both strings equal: " + isStringEqual(s1, s2));
		System.out.println("enter two characters to compare: ");
		char c1, c2;
		c1 = sc.nextLine().charAt(0);
		c2 = sc.nextLine().charAt(0);

		System.out.println("Are both characters equal?  " + isEqual(c1, c2));

	}

}
