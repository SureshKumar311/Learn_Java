
//Exampple 1

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;

//public class Exception {
//
//	public static void main(String[] args) throws FileNotFoundException {
//
//		File file = new File("example.txt");
//		
//		Scanner readFile = new Scanner(file);
//		
//	}
//
//}


//Exampple 2

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class  Exception {
//
//	public static void main(String[] args) {
//		
//		File file = new File("example.txt");
//
//		try {
//		Scanner readFile = new Scanner(file);
//		
//		// The following lines will not be executed if an exception is thrown
//		System.out.println("Hello there11");
//
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found: " + file.toString());
//		}
//		
//		// You can continue with your code here
//		System.out.println("Hello there");
//	}
//
//}



//Exampple 3

//import java.io.File;
//import java.io.FileNotFoundException;
//import java.util.Scanner;
//
//public class Exception  {
//
//	public static void main(String[] args) {
//
//		try {
//			read();
//		} catch (FileNotFoundException e) {
//			System.out.println("File not found"  + e.toString()); // Make this message more specific
//		}
//
//	}
//
//	public static void read() throws FileNotFoundException {
//
//		File file = new File("example.txt");
//
//		Scanner readFile = new Scanner(file);
//
//	}
//
//}


//Exampple 4
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Exceptions  {

	public static void main(String[] args) {

		MultipleExceptions me = new MultipleExceptions();

//		try {
//			me.start();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ParseException e) {
//				System.out.println("Incorrect format");
//		}

//		try {
//			me.start();
//		} catch (IOException | ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		try {
			me.start();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			me.example();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}



 class MultipleExceptions {

	public void start() throws IOException, ParseException {

		// throw new IOException();

		throw new ParseException("Error at line 10", 2);

	}

	public void example() throws IOException, FileNotFoundException {

	}
}

