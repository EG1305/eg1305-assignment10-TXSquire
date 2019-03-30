package Rectangle;
import java.util.Scanner;

public class TestRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of rectangles to be created: ");
		int amount = input.nextInt();
		
		Rectangle[] rectangle = new Rectangle[amount];
		
		double len_var;
		double wid_var;
		
		Rectangle c;
		
		for(int i = 0; i <amount; i++) {
		
			
			System.out.println("Enter the length of the " + (i + 1) + " rectangle");
			len_var = input.nextDouble();

			System.out.println("Enter the width of the " + (i + 1) + "rectangle");
			wid_var = input.nextDouble();
			
			c = new Rectangle(len_var, wid_var);
			
			rectangle[i] = c;
		}


		for(int i = 0; i <amount; i++) {

			System.out.printf("Rectangle %d: The area of the rectangle is %.4f ", (i + 1), rectangle[i].getArea());
			System.out.printf("The perimeter of the rectangle is %.2f\n", rectangle[i].getPerimeter());
		}
		
		input.close();
	}

}
