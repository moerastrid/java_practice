// Write a Java function called NonZeros, using the header given below. NonZeros should create and return an array of integers containing all of the non-zero values in its parameter A, in the same order that they occur in A.

// public static int[] NonZeros( int [] A )

// Write a complete Java program that includes a main function as well as the NonZeros function. 
// The main function should test NonZeros by creating several arrays, and calling NonZeros with each array. 
// It should print the array it passes to NonZeros as well as the returned array. 
// So for example, when you run your program, your output might look like this (if your NonZeros function is implemented correctly):

// passing [0,1,2,3,2] got back [1,2,3,2]
// passing [0,0] got back []
// passing [22,0,-5,0,126] got back [22,-5,126]
// passing [1,0] got back [1]

public class third_test {
	private static void print_array(int [] A) {
		System.out.print("[");

		if (A == null)
			System.out.print("null");
		else {
			for (int i = 0; i < A.length; i++) {
				if (i != 0)
					System.out.print(", ");
				System.out.print(A[i]);
			}
		}
		System.out.print("]\n");
	}

	public static void main(String [] args) {
		int [] test_one = {1, 2, 0, 4, 0, 3};
		
		System.out.print("\ntest_one array: ");
		print_array(test_one);

		System.out.print("result: ");
		print_array(NonZeros(test_one));

		int [] test_two = {0, 0, 0};
		
		System.out.print("\ntest_two array: ");
		print_array(test_two);

		System.out.print("result: ");
		print_array(NonZeros(test_two));

		int [] test_three = {};
		
		System.out.print("\ntest_three array: ");
		print_array(test_three);

		System.out.print("result: ");
		print_array(NonZeros(test_three));

		int [] test_four = {1, 0, 0, 0, 0, 0, 0, 0, 0};
		
		System.out.print("\ntest_four array: ");
		print_array(test_four);

		System.out.print("result: ");
		print_array(NonZeros(test_four));

		int [] test_five = null;
		
		System.out.print("\ntest_five array: ");
		print_array(test_five);

		System.out.print("result: ");
		print_array(NonZeros(test_five));

		System.out.print("\n");
	}

	private static int count_zeroes(int [] A) {
		int count = 0;

		for (int i = 0; i < A.length; i++){
			if (A[i] != 0)
				count++;
		}
		return (count);
	}

	public static int[] NonZeros( int [] A ) {
		if (A == null)
			return (null);
		int count = count_zeroes(A);
		int [] result;
		result = new int [count];

		int i = 0;
		int skip = 0;
		while (i < count) {
			// System.out.println("i: " + i + ", skip: " + skip);
			if (A[i + skip] == 0) {
				skip++;
			} else {
				result[i] = A[i + skip];
				i++;
			}
		}
		return (result);
	};
}