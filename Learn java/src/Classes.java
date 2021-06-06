class Methodsclasses{
	
	String animal;
	int value;
	
	void run() {
		System.out.println("Running");
		for(int i=0; i<4; i++) {
			System.out.println("My " + animal + " is " + value + " years old.");
		}
	}
}

public class Classes {

	public static void main(String[] args) {
		
		Methodsclasses name = new Methodsclasses();
		name.animal = "Cat";
		name.value = 9;
		name.run();
		
	}
}