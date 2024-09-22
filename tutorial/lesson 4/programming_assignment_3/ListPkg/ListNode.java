package ListPkg;

class ListNode {
	private Object	item;
	public ListNode	next;

	public ListNode(Object input) {
		this.item = input;
		this.next = null;
	}

	public Object getItem() {
		return item;
	}

	public void setItem(Object item) {
		this.item = item;
	}
}