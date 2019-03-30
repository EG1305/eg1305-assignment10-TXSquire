package Lottery;
import java.util.Scanner;

public class Lottery {

	public static void main(String[] args) {
		
		int[] guess = new int[5];
		getValues(guess);
		
		System.out.println("The lottery numbers are: ");
		int[] random = new int[5];
		for (int i = 0; i < 5; i++) {
			random[i] = (int) (Math.random() * 10);
			System.out.print(random[i] + " ");
		}
		System.out.println();
		
		compareNumbers(guess, random);

	}
	
	public static int[] getValues(int[] guess) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter a series of 5 numbers.");
		for (int i = 0; i < 5; ++i) {
			System.out.print("Enter number " + (i + 1) + ": ");
			guess[i] = input.nextInt();
		}
		input.close();

		return guess;
	}
	
	public static void compareNumbers(int[] guess, int[] random) {
		int match = 0;
		int[] matchingNum = new int[5];
		
		
		for (int i = 0; i < 5; ++i) {
			if(guess[i] == random[i]) {
				match++;
				matchingNum[i] = 1;
			}
		}
		
		System.out.println("You matched " + match + " numbers");
		System.out.println("The matching numbers are: ");
		for (int i = 0; i < 5; ++i) {
			if(matchingNum[i] == 1)
				System.out.print(guess[i] + " ");
		}

	}

}
