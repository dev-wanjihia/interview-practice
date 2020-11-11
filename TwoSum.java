import java.util.HashMap;
import java.util.Scanner;
import java.util.Arrays;

class TwoSum {
	public int[] twoSum(int[] nums, int target){
		HashMap<Integer, Integer> numberPositions = new HashMap<>();

		for(int i = 0; i < nums.length; i++){
			if(numberPositions.get(target - nums[i]) != null){
				return new int[]{numberPositions.get(target - nums[i]), i};
			}

			numberPositions.put(nums[i], i);
		}

		return null;
	}


	// Driver code
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int inputSize = Integer.parseInt(scanner.nextLine());
		int target = Integer.parseInt(scanner.nextLine());

		int[] numbers = new int[inputSize];
		String[] in = scanner.nextLine().split(" ");

		for(int i=0; i < inputSize; i++){
			numbers[i] = Integer.parseInt(in[i]);
		}

		System.out.println(Arrays.toString(new TwoSum().twoSum(numbers, target)));
	}
}
