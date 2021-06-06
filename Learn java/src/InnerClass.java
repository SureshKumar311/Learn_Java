
public class InnerClass {



	public static void main(String[] args) {

		Machine machine = new Machine(12);

		machine.run();

		Machine.Tire tire = new Machine.Tire();
		tire.repair();

	}

}


 class Machine {

	private int id;

	class ArtificialIntelligence {

		public void activate() {  

			System.out.println("Machine " + id + " is activated.");
		}
	}

	static class Tire {
		public void repair() {

			System.out.println("Tires are repaired.");
		}

	}

	public Machine(int id) {
		this.id = id;
	}

	public void run() {

		System.out.println("Run machine" + " " + id);

		ArtificialIntelligence ai = new ArtificialIntelligence();
		ai.activate();

		final String type = "Electric";

		class Test {

			public void example() {

				System.out.println("ID is " + id);
				System.out.println("Type is " + type);
			}
		}

		Test test = new Test();
		test.example();

	}

}
