package standard;
import java.util.*;
public class Area_of_Circle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter radius:");
		float radius = input.nextFloat();
		
		float Area = (float) Math.PI*(radius*radius);	
		System.out.println("Area = "+Area);
	}

}
