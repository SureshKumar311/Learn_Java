
public class enumexample {



	public static void main(String[] args) {

		Color color = Color.GREEN;

		switch (color) {
		case BLUE:
			System.out.println("Blue");
			break;
		case GREEN:
			System.out.println("Green");
			break;
		case RED:
			System.out.println("Red");
			break;
		default:
			break;
		}

		System.out.println(Color.RED);
		System.out.println("Enum meaning as a string is: " + Color.RED.name());
		System.out.println(Color.GREEN.getClass());
		System.out.println(Color.GREEN instanceof Enum);
		System.out.println(Color.RED.getMeaning());

		Color color1 = Color.valueOf("RED");
		System.out.println(color1);

	}

}


 enum Color {

	RED("Passion"), GREEN("Health"), BLUE("Calm");

	private String meaning;

	Color(String meaning) {
		this.meaning = meaning;
	}

	public String getMeaning() {
		return meaning;
	}

	public String toString() {
		return "This color's meaning is: " + meaning;
	}

}
