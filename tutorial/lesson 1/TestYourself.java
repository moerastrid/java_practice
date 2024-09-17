//  Assume the following declarations have been made:

//     int x = 20, y = 10;

// What is printed when each of the following statements is executed?

//     System.out.println(x + y);
//     System.out.println(x + y + "!");
//     System.out.println("printing: " + x + y);
//     System.out.println("printing: " + x * y);

public class TestYourself {
	public static void main(String [] args) {
		int x = 20;
		int y = 10;

		System.out.println(x + y);			// predict: 30
		System.out.println(x + y + "!");	// predict: 30!
		System.out.println("printing: " + x + y);	// predict: 2010
		System.out.println("printing: " + x * y);	// predict: 200
	}
}

/*
outcome: 
bash-5.2$ java TestYourself
30
30!
printing: 2010
printing: 200
 */