package IF_ELSE;
import java.util.Scanner;
public class Max_of_two_numbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first number:");
		int firstNumber = input.nextInt();
		System.out.println("Enter second number:");
		int secondNumber = input.nextInt();
		if (firstNumber>secondNumber) {
			System.out.println("First is MAX");
		} else if(firstNumber == secondNumber){
			System.out.println("Entered numbers value is equal");
		}
		else {
			System.out.println("Second is MAX");
		}

	}

}
