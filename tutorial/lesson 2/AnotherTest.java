// class Example1 {
//     static void Swap(Integer j, Integer k) {
//         int tmp = k.intValue();
//         k = new Integer(j.intValue());
//         j = new Integer(tmp);
//     }

// 	public static void main(String[] args) {
//         Integer n = new Integer(5), m = new Integer(6);
//         Swap(n, m);
//         System.out.println("n = " + n + "; m = " + m);
//     }
// }


// class Example2 {
// 	static String Reverse(String S) {
// 		String newS = "";
// 		char c = S[0];
// 		while (c) {
// 			newS = c + newS;
// 			c++;
// 		}
// 		return newS;
// 	}

// 	public static void main(String[] args) {
// 		String Str = "hello";
// 		System.out.println("S: " + Str);
// 		this.Reverse(Str);
// 		System.out.println("S: " + Str);
// 	}
// }




// question 1: 
// er zijn nieuwe ints in de method gezet maar de originele waarden veranderen niet, j en k waardes zelf zijn niet aangepast buiten de method

// question 2: 
// je kunt een string niet zien als een chararray in Java, dus string[0] werkt niet, je moet .charAt gebruiken.
// while(c) snapt hij niet. Er is ook geen index? 


class Solution {
	static String Reverse(String S) {
		String newS = "";

		for (int i = 0; i < S.length(); i++) {
			newS = S.charAt(i) + newS;
		}
		return newS;
	}

	public static void main(String[] args) {
		String Str = "hello";
		System.out.println("S: " + Str);
		Str = Reverse(Str);
		System.out.println("S: " + Str);
	}
}
