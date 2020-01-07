
public class Car {
	
	String name;
	int gears;
	String model;
	static int wheels=4;
	
	public Car(String name, int gears, String model){
	this.name=name;
	this.gears=gears;
	this.model=model;
	}
	
	void show(){
		System.out.println("The car: "+name+" of model"+model +"has "+gears);
			
	}
	static{
		System.out.println("The car has "+wheels+" wheels");

	}
	


 public static void main(String[] args){
		
		Car c1=new Car("ABC",8,"XUV");
		Car c2=new Car("XYZ",6,"MNO");
		c1.show();
		c2.show();
	}
}