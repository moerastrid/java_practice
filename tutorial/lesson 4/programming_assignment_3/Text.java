import ListPkg.List;
import ListPkg.NoNextElementException;

public class Text {
	public static void main(String [] args) {
		System.out.println("Start test 1");

		List testList = new List();
		Integer myint = 456;
		Object [] testinput = {"hello", "test", null, 123, myint, "string"};
		// String [] testinput = {"appel", "peer", null, "taart", "banaan", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "", "", "", "aardbei"};
		for (int i = 0; i < testinput.length; i++) {
			testList.AddToEnd(testinput[i]);
		}
		testList.Print();
		System.out.println("\nnumItems: "+ testList.numItems);

		System.out.println("\nStart test 2");
		List L = new List();
		for (int i = 0; i < args.length; i++) {
			L.AddToEnd(args[i]);
		}
		L.Print();
		System.out.println("\nnumItems: "+ L.numItems);

		L.firstElement();
		while (L.hasMoreElements()) {
			try {
				String tmp = (String)L.nextElement();
				System.out.print(tmp + " ");
			} catch (NoNextElementException ex) {
				System.out.print(ex + "?!?!?!");
			}
		}

		try {
			System.out.println("Bad statement about to be made: ");
			L.nextElement();
		} catch (NoNextElementException ex) {
			System.out.println("My exception: " + ex);
		}
	}
}
