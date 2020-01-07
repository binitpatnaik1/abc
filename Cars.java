
import java.util.ArrayList;
import java.util.HashMap;
public class Cars {
    public static void main(String[] args) {
		Showroom s1= new Showroom("Utkal","bbsr","dzire","MS",6);
		Showroom s2= new Showroom("Utkal","bbsr","omni","MS",5);
		Showroom s3= new Showroom("Pride","Hyd","dzire","MS",6);
		Showroom s4= new Showroom("Pride","Hyd","omni","MS",6);
		Showroom s5= new Showroom("Pride","Hyd","alto","MS",5);
		ArrayList<Showroom> sw1= new ArrayList<>();
		sw1.add(s1);
		sw1.add(s2);
		

		ArrayList<Showroom> sw2= new ArrayList<>();
		sw2.add(s3);
		sw2.add(s4);
		sw2.add(s5);
		
		HashMap<String, ArrayList<Showroom>> hm= new HashMap<>();
		
		hm.put(s1.getSname(), sw1);
		hm.put(s4.getSname(), sw2);
		
		ArrayList<Showroom> al1= hm.get("Utkal");
		ArrayList<Showroom> al2= hm.get("Pride");
		
		for(Showroom sw:al1){
			System.out.println(sw);
		}
		
		for(Showroom sw:al2){
			System.out.println(sw);
		}
		
		
				

	}
}
