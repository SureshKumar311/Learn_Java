public class Polymorphism {

	public static void main(String[] args) {
		
		// Vehicle vehicle1 = new Vehicle();
		Carsk Carsk = new Carsk();
		
		Vehicle vehicle2 = Carsk;
		
		vehicle2.design();
		Carsk.ride();
		//vehicle2.ride();
		
		createDesign(Carsk);		
	}
	
	public static void createDesign(Vehicle vehicle) {	
		vehicle.design();
	}	
}

 class Vehicle {

	public void design() {
		System.out.println("Vehicle design");
	}
}


 class Carsk extends Vehicle {

	@Override
	public void design() {
	System.out.println("Carsk design");
	}
	
	public void ride() {
		
		System.out.println("Riding the Carsk");
	}

}
