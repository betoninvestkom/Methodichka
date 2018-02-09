package IF_ELSE;
import java.util.Scanner;
public class Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter value of N:");
		int number = input.nextInt();
		if (number%2==0) {
			System.out.println("Entered number is Even!");
		} else {
			System.out.println("Entered number is Odd!");
		}

	}

}
