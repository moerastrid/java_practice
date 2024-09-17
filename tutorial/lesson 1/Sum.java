//  Write a complete Java program that uses a loop to sum the numbers from 1 to 10 and prints the result like this:
// The sum is: xxx
// Note: Use variable declarations, and a for or while loop with the same syntax as in C++.
// Make sure that you are able to compile and execute your program! 

public class Sum {
	public static void main(String [] args) {
		int sum = 0;
		int i = 0;

		while (i < 10) {
			sum += (i + 1);
			// System.out.println("i: " + i);
			// System.out.println("sum: " + sum);
			i++;
		}

		System.out.println("The sum is: " + sum);

		sum = 0;
		for (int j = 1; j <= 10; j++) {
			sum += j;
			// System.out.println("j: " + j);
			// System.out.println("sum: " + sum);
		}

		System.out.println("The sum is: " + sum);
	}
}
