package oops;

class Vehicle {
	
	int wheels;
	int headLights;
	String color;
	
	Vehicle(int wheels) {
		this.wheels = wheels;
		headLights = 2;
}
	
	Vehical(int wheels, String color) {
		this.wheels = wheels;
		this.color = color;
		headLights = 2;
	}
}
public class MyConstructor {
	
	MyConstructor() {
		System.out.println("object is now created");
	}

	public static void main(String[] args) {
		
		Vehicle car = new Vehicle(4);
		Vehicle scooty = new Vehicle(2);
		
		System.out.println(scooty.wheels +" wheels");
		
		MyConstructor obj =new MyConstructor();
		
		

	}

}
