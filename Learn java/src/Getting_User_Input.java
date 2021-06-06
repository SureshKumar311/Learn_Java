

import java.util.Scanner;
public class Getting_User_Input{

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a value: ");
		
		var ex_next = input.next();
		var ex_line = input.nextLine();
		var ex_int = input.nextInt();
		var ex_double = input.nextDouble();
		var ex_bool = input.nextBoolean();

		System.out.println("Your number is: " + ex_next + "\n" + ex_line + "\n"  + ex_int + "\n"  + ex_double + "\n" + ex_bool + "\n"   );
		input.close();
	}
}


// user

// suresh
// 10
// 10.2
// true

// output :
// Your number is: suresh

// 10
// 10.2
// true