package BasicList;
import java.util.ArrayList;

public class BasicList {

	public static void main(String[] args) {
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			//nums.set(i, (i + 1)*10);
			nums.add((i + 1)*10);
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(nums.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("Size of the list is " + nums.size());
		
		nums.add(5, 200);
		
		for(int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i) + " ");
		}
		System.out.println();
		
		System.out.println("Size of the list is " + nums.size());
		
		System.out.println("Value 200 is located at index " + nums.indexOf(200));

	}

}
