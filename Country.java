import java.util.Scanner;

interface PhNumber {
	abstract boolean numberFormat(String n);
}

public abstract class Country implements PhNumber {
	public static void main(String[] args) {
		String n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number with country code");
		n = sc.nextLine();

		India ind = new India();
		System.out.println("India: " + ind.numberFormat(n));
		Brazil brz = new Brazil();
		System.out.println("Brazil: " + brz.numberFormat(n));

		Norway nor = new Norway();
		System.out.println("Norway: " + nor.numberFormat(n));

		Qatar qat = new Qatar();
		System.out.println("Qatar: " + qat.numberFormat(n));

		Turkey tur = new Turkey();
		System.out.println("Turkey: " + tur.numberFormat(n));

	}
}

class India extends Country {
	@Override
	public boolean numberFormat(String n) {
		char[] a = n.toCharArray();
		int ctr = 0;
		if (a.length == 14) {
			if (a[0] == '+' && a[1] == '9' && a[2] == '1' && a[3] == '-') {
				for (int i = 4; i < a.length; i++) {
					if ((int) a[i] >= 48 && a[i] <= 57) {
						ctr++;
					}

				}
			}
			if (ctr == 10) {
				return true;
			}
		} else {
			return false;
		}
		return false;

	}
}

class Brazil extends Country {
	@Override
	public boolean numberFormat(String n) {
		char[] a = n.toCharArray();
		int ctr = 0;
		int h = 0;
		if (a.length == 17) {
			if (a[0] == '+' && a[1] == '5' && a[2] == '5' && a[3] == ' ' && a[4] == '1' && a[5] == '5' && a[6] == ' '
					&& a[12] == '-') {
				for (int i = 6; i < 11; i++) {
					if ((int) a[i] >= 48 && (int) a[i] <= 57) {
						ctr++;
					}
				}
				for (int i = 13; i < a.length; i++) {
					if ((int) a[i] >= 48 && (int) a[i] <= 57) {
						ctr++;

					}
				}
				if (ctr == 9) {
					return true;
				}
			} else {
				return false;
			}
		}
		return false;
	}
}

class Norway extends Country {

	@Override
	public boolean numberFormat(String n) {
		char[] a = n.toCharArray();
		int ctr = 0;
		if (a.length == 15) {
			if (a[0] == '+' && a[1] == '4' && a[2] == '7' && a[3] == '-' && a[4] == '4' && a[6] == '-' && a[9] == '-'
					&& a[12] == '-') {
				for (int i = 5; i < 15; i++) {
					if ((int) a[i] >= 48 && (int) a[i] <= 57) {
						ctr++;
					}

					else if ((int) a[i] == 45) {

					}
				}
			}
			if (ctr == 7) {
				return true;
			}
		} else {
			return false;
		}
		return false;

	}
}

class Qatar extends Country {

	@Override
	public boolean numberFormat(String n) {
		char[] a = n.toCharArray();
		int ctr = 0;
		if (a.length == 14) {
			if (a[0] == '+' && a[1] == '9' && a[2] == '7' && a[3] == '4' && a[4] == ' ') {
				for (int i = 5; i <= 13; i++) {
					if ((int) a[i] >= 48 && (int) a[i] <= 57) {
						ctr++;
					} else if ((int) a[i] == 45) {
						continue;

					} else {
						ctr = 0;
						break;
					}
				}
			}
			if (ctr == 8 && a[9] == '-') {
				return true;
			}
		} else {
			return false;
		}
		return false;

	}
}

class Turkey extends Country {

	@Override 
  public boolean numberFormat(String n) { 
	  char[] a = n.toCharArray();
 int ctr=0; 
 if (a.length == 14) {
		if (a[0] == '+' && a[1] == '9' && a[2] == '0' && a[3] == ' ') {
			for (int i = 4; i <= 13; i++) {
				if ((int) a[i] >= 48 && (int) a[i] <= 57) {
					ctr++;
				}			
				else if((int)a[i]==45){
					
					
				}
				else
				{
					ctr=0;
					
				}
			}
		}
			if (ctr == 9 && a[7]=='-') {
				return true;
			}
		} else {
			return false;
		}
	return false;
	}
   }
  
	
	
	
