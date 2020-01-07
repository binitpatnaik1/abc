import java.util.Scanner;

public class ReplaceCharacter {

	static void oldReplace(String s, char old, char now) {
		int len = s.length();
		String nowString = null;
		char[] abc = s.toCharArray();
		for (int i = 0; i < len; i++) {
			nowString = s.replace(old, now);
		}

		for (int i = 0; i < len; i++) {
			if (abc[i] == old) {
				abc[i] = now;
				break;
			}
		}
		
		for (int j = len - 1; j >= 0; j--) {
			if (abc[j] == old) {
				abc[j] = now;
				break;
			}
		}
		String some= new String(abc);
		return some;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		char old = sc.next().charAt(0);
		char now = sc.next().charAt(0);
		oldReplace(s, old, now);

	}

}
