package standard;
import java.util.*;
public class A_power_8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number:");
		int number = input.nextInt();
		
		int number2 = (int) Math.pow(number, 2);
		int number4 = (int) Math.pow(number2, 2);
		int number8 = (int) Math.pow(number4, 2);
		
		System.out.println("power 8 of a number= "+number8);

	}

}
