 class Car extends Factory {

	public void brand() {
			
		System.out.println("Tesla");
	}
	// public void build() {
		
	// 	System.out.println("Build the car on carclass");
	// }	
}


 class Factory {
	
	public void design() {
		
		System.out.println("Design the car");
	}

	public void build() {
		
		System.out.println("Build the car");
	}
}

public class InheritanceandAccessModifiers {

	public static void main(String[] args) {
		
		// access modifiers: public, protected, default(lack of access modifier), private.

		// Factory factory1 = new Factory();
		
		// factory1.design();
		// factory1.build();
		
		Car car1 = new Car();
		
		car1.design();
		car1.build();
		car1.brand();
		
	}

}


