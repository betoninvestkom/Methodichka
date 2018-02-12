package IF_ELSE;
import java.util.Scanner;
public class two_digit_number {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two digit number:");
		int number = input.nextInt();
		int intPart = (int) number/10;
		int fractPart = number % 10;
		if (intPart == fractPart) {
			System.out.println("Numbers equal");
		}
		else {System.out.println("Numbers not equal");}
		System.out.println(intPart+"\n"+fractPart);
	}

}
