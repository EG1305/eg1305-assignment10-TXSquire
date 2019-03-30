package Distinct;
import java.util.Scanner;

public class Distinct {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] nums = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.print("Enter integer " + (i + 1) + ": ");
			nums[i] = input.nextInt();
		}
		
		System.out.println("Distinct numbers are:");
		
		for(int i = 0; i < 10; i++) {
			for(int j = (i + 1); j < 10; j++) {
				if(nums[i] == nums[j])
					nums[i] = -1;
			}
		}
		
		for(int k = 0; k < 10; k++) {
			if(nums[k] != -1)
				System.out.print(nums[k] + " ");
		}

		input.close();
	}

}
