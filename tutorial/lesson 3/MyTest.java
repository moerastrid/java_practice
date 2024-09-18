

public class MyTest {
	static private int myDevide(int a, int b) {
		return a / b;
	}
	public static void main(String [] args) {
		System.out.println("Calculating... ");
		int a = 34;
		int b = 14;

		try {
			System.out.println("answer: " + a + " / " + b + " = " + myDevide(a, b) );
		} catch(java.lang.ArithmeticException ex) {
			System.out.println("please don't devide by zero");
		}
	}
}
