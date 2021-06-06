

class Methods{
	
	String animal;
	int value;
	int month;
	
	void run() {
		System.out.println("Running");
		for(int i=0; i<4; i++) {
			System.out.println("My " + animal + " is " + value + " years old.");
		}
	}
	
	int calculateMonthsToBirthday() {
		int monthsLeft = 12 - month;//5 = monthleft = 12-5
			return monthsLeft;
	}
	
	void talk(String text) {
		System.out.println(text);
	
	}
	
	void walk(int speed) {
		System.out.println("Walking " + speed + " km per hour");
	}
	
	void timer(int minutes, double seconds) {
		
		System.out.println("It took " + minutes + "m and " + seconds + "s to get down the hill.");
	}
}




public class returntype{

	public static void main(String[] args) {
		
		Methods name = new Methods();
		name.animal = "Cat";
		name.value = 9;
		name.run();
		name.month = 8;
		int months = name.calculateMonthsToBirthday();
		name.walk(7);
		name.talk("Hi, I am Steven!");
		String hello = "Hello there!";
		name.talk(hello);
		name.timer(9, 3.65);
		
		System.out.println("Months until birthday " + months);
	}
}





/* output ->>

Running
My Cat is 9 years old.
My Cat is 9 years old.
My Cat is 9 years old.
My Cat is 9 years old.
Walking 7 km per hour
Hi, I am Steven!
Hello there!
It took 9m and 3.65s to get down the hill.
Months until birthday 4 */