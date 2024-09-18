class Test {
	static int x;
	int k;

	// constructor with 2 args
	public Test( int n, int m ) {
		x = n;
		k = m;
	}

	public static void main(String[] args) {
		Test t1 = new Test(10, 20);
		Test t2 = new Test(30, 40);
		System.out.print(t1.x + " ");
		System.out.print(t1.k + " ");
		System.out.print(t2.x + " ");
		System.out.println(t2.k);
	}
}

// question 1: B
// question 2: D

// after testing : question 2 has runtime error.
// Error: Could not find or load main class Test.class
// Caused by: java.lang.ClassNotFoundException: Test.class
// after testing some more: was compiling wrong oops (javac Test.class instead of javac Test)