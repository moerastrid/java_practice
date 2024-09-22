package ListPkg;

public class List {
	private	ListNode	items;
	private	ListNode	first;
	private	ListNode	last;
	public	int			numItems;
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
		if (currentNode == null)
			return false;
		if (currentNode.next == null)
			return false;
		return true;
	}

	// next element
	public Object nextElement() throws NoNextElementException {
		Object selected;

		if (currentNode == null)
		throw new NoNextElementException("current == null");
		
		if (hasMoreElements() == false)
			throw new NoNextElementException("hasmoreElements = false");

		selected = currentNode.getItem();
		currentNode = currentNode.next;
		return (selected);
	}

}
