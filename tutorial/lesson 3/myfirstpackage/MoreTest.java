//  Question 1: Assume that function f might throw exceptions Ex1, Ex2, or Ex3. Complete function g, outlined below, so that:

//     If the call to f causes Ex1 to be thrown, g will catch that exception and print "Ex1 caught".
//     If the call to f causes Ex2 to be thrown, g will catch that exception, print "Ex2 caught", and then will throw an Ex1 exception. 

//         static void g() throws ... {
//             try {
//     	    f();
//     	} catch ( ... ) {
//                 ...
//             } ...
//         }

public class MoreTest {

	static void f() throws Ex1, Ex2, Ex3 {

		Integer mytime = java.time.LocalTime.now().getSecond() ;
		System.out.println("SEcond: " + mytime);

		if ((mytime % 4) == 3) {
			throw new Ex1();
		} else if ((mytime % 4) == 1) {
			throw new Ex2();
		} else if ((mytime % 4) == 2) {
			throw new Ex3();
		} else {
			return;
		}
	}

	static void g() throws Ex1, Ex2, Ex3 {
		try {
			f();
		} catch (Ex1 ex_1) {
			System.out.println("Ex1 caught by g");
		} catch (Ex2 ex_2) {
			System.out.println("Ex2 caught by g");
			throw new Ex1();
		}
	}

	public static void main( String [] args) {
		int result = 0;
		try {
			g();
		} catch (Ex1 ex_1) {
			result = 1;
		} catch (Ex2 ex_2) {
			result = 2;
		} catch (Ex3 ex_3) {
			result = 3;
		} finally {
			System.out.println("Result: " + result);
		}
	}
}

