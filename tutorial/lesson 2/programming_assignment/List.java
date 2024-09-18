class List {
	private static final int	INIT_LEN = 4;
	private Object []			items;
	private int					numItems = 0;
	public int					currentObject;

	public List() {
		items = new Object [INIT_LEN];
	}

	private void doubleSize() {
		Object [] tempItems;
		int current = items.length;

		if (current == 0) {
			tempItems = new Object [1];
		} else {
			tempItems = new Object [current * 2];
		}
		for (int i = 0; i < current; i++) {
			tempItems[i] = items[i];
		}
		items = tempItems;
	}

	public void AddToEnd(Object ob) {
		if (numItems == items.length)
			doubleSize();
		items[numItems] = ob;
		numItems++;
	}

	public void firstElement() {
		currentObject = 0;
	}

	public boolean hasMoreElements() {
		if (currentObject >= numItems)
			return false;
		return true;
	} 

	public Object nextElement() {
		Object selected;

		if (hasMoreElements()) {
			selected = items[currentObject];
		} else {
			selected = null;
		}
		currentObject++;
		return (selected);
	}

	public void Print()
	{
		System.out.print("[");
		for (int i = 0; i < numItems; i++) {
			System.out.print(items[i].toString());
			if (i != numItems - 1)
				System.out.print(", ");
		}
		System.out.print("]");
	}
	
	public static void main(String[] args) {
		List testList = new List();
		String [] testinput = {"appel", "peer", "taart", "banaan", "1", "2", "3", "4", "5", "", "", "", "aardbei"};
		for (int i = 0; i < testinput.length; i++) {
			testList.AddToEnd(testinput[i]);
		}
		testList.Print();
		System.out.println('\n');

		List L = new List();
		for (int i = 0; i < args.length; i++) {
			L.AddToEnd(args[i]);
		}
		L.Print();
		System.out.println('\n');
	
		L.firstElement();
		while (L.hasMoreElements()) {
			String tmp = (String)L.nextElement();
			System.out.print(tmp);
			System.out.println("\t INFO " + L.currentObject + ":\t[" + (String)L.items[L.currentObject - 1] + "],\tmore: " + L.hasMoreElements());
		}
	}
}
