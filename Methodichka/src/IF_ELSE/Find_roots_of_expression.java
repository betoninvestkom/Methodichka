package IF_ELSE;
import java.util.Scanner;
public class Find_roots_of_expression {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a:");
		float a = input.nextFloat();
		System.out.println("Enter b:");
		float b = input.nextFloat();
		System.out.println("Enter c:");
		float c = input.nextFloat();
		
		float Discriminat = (b*b)-4*a*c;
		if (Discriminat > 0) {
			float root1 = ((-b)+ (int) Math.sqrt(Discriminat))/(2*a);
			float root2 = ((-b)- ((int) Math.sqrt(Discriminat)))/(2*a);
			System.out.println("root1="+root1+" "+"root2="+root2);
		} else if(Discriminat==0){
			float root = -b/(2*a);
			System.out.println("root="+root);
		}
		else {
			System.out.println("No roots");
		}

	}

}
