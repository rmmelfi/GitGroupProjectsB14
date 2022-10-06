package GitProjects;

public class GroupProject1Task10 {

	public static void main(String[] args) {

		int[] numbers = { 5, 100, 40, 5, 20 };
		int largestNumber = numbers[0];
		int secondLargest = numbers[0];

		for (int i = 0; i < numbers.length; i++) {

			if (numbers[i] > largestNumber) {
				secondLargest = largestNumber;
				largestNumber = numbers[i];

			} else if (numbers[i] > secondLargest) {
				secondLargest = numbers[i];

			}
		}

		System.out.println("The second largest number is " + secondLargest);

	}
}
