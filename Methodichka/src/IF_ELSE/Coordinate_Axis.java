package IF_ELSE;
import java.util.*;
public class Coordinate_Axis {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter x:");
		int xAxis = input.nextInt();
		System.out.println("Enter y:");
		int yAxis = input.nextInt();
		
		if(xAxis>0 && yAxis>0) {
			System.out.println("1st Quater");
		}
		else if (xAxis<0 && yAxis>0) {
			System.out.println("2nd Quater");
		}
		else if (xAxis<0 && yAxis<0) {
			System.out.println("3rd Quater");
		}
		else {
			System.out.println("4th Quater");
		}
		

	}

}
