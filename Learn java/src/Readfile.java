import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Readfile {

	public static void main(String[] args) throws FileNotFoundException {

		String myFile = "C:\\Users\\ASUS\\Desktop\\teat.txt";

		File file = new File(myFile);

		Scanner text = new Scanner(file);
 
//		String value = text.next() ;
		
//		System.out.println("Value is: " + value);

		while (text.hasNextLine()) {

			String line = text.nextLine();

			System.out.println(line);

		}

		text.close();

	}

}
