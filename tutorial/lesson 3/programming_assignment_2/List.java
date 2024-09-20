/*
Write a new version of the List class that uses a linked list to store the list items,
	rather than using an array, and write a new main function to test your List class. 
	(Your list class should include all of the List methods described in the first assignment: 
	the constructor, AddToEnd, Print, firstElement, nextElement, and hasMoreElements.)

You should implement linked lists by defining a class ListNode that contains two fields: 
	an Object (the item stored in this node of the linked list) and a ListNode (the next item on the linked list). 
	Remember that classes are implemented using pointers,
	so a ListNode really contains a pointer to an Object and a pointer to the next node on the list. 
	Your List class should have ListNode fields instead of a field that is an array of Objects. 
	You should define the ListNode class as a non-public class in the same file as your List class.

You should implement the List class so that the Print operation takes time proportional to the number of items on the list,
	and so that all of the other operations (including AddToEnd!) take constant time
	(i.e., are independent of the number of items already on the list). 
*/ 

class ListNode {
	private Object	item;
	public ListNode	next;

	// constructor
	public ListNode() {
		this(null);
	}

	// constructor
	public ListNode(Object input) {
		this.item = input;
		this.next = null;
		// System.out.println("ListNode created with item : " + this.item);
	}

	// getter
	public Object getItem() {
		return item;
	}

	// setter
	public void setItem(Object item) {
		this.item = item;
	}
}

public class List {
	private	ListNode	items;
	private	ListNode	first;
	private	ListNode	last;
	private	int			numItems;
	public	ListNode	currentNode;

	// constructor
	public List() {
		items = null;
		first = null;
		last = null;
		numItems = 0;
	}

	// add to end
	public void AddToEnd(Object ob) {
		ListNode newNode = new ListNode(ob);

		if (first == null) {
			items = newNode;
			first = items;
			last = items;
		} else {
			last.next = newNode;
			last = last.next;
		}
		numItems++;
	}

	// print
	public void Print() {
		ListNode temp = items;

		System.out.print("[");
		while (temp != null) {
			System.out.print(temp.getItem());
			if (temp.next != null) {
				System.out.print(", ");
			}
			temp = temp.next;
		}
		System.out.print("]");
	}

	// first element
	public void firstElement() {
		currentNode = first;
	}

	// has more elements
	public boolean hasMoreElements() {
		if (currentNode.next == null)
			return false;
		return true;
	}

	// next element
	public Object nextElement() {
		Object selected;

		if (currentNode == null)
			return (null);

		selected = currentNode.getItem();
		currentNode = currentNode.next;
		return (selected);
	}

	// main for testing
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
			String tmp = (String)L.nextElement();
			System.out.print(tmp + " ");
		}
	}
}
