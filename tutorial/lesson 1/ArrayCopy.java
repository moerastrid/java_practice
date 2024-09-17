public class ArrayCopy {
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
		int [] A = {0, 1, 2, 3, 4};
		int [] B = new int [5];
		System.arraycopy(A, 0, B, 0, 5);
		System.out.print("A: ");
		print_array(A);
		System.out.print("B: ");
		print_array(B);
		System.arraycopy(A, 0, A, 1, 4);
		System.out.print("A: ");
		print_array(A);
		System.out.print("B: ");
		print_array(B);
	}
}
