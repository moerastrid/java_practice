public class ArrayCopyCopy {
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
		int [][] A = new int[4][3];
		int [] B = {1,2,3,4,5,6,7,8,9,10};
		System.arraycopy(B,0,A[0],0,3);
		System.arraycopy(B,1,A[1],0,3);
		System.arraycopy(B,2,A[2],0,3);
		System.arraycopy(B,3,A[3],0,3);

		System.out.println("A: ");
		// print_array(A);
		for(int i = 0; i < A.length; i++) {
			print_array(A[i]);
		}
	}
}
