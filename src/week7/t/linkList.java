package week7.t;

class Link {
	public int value;
	public Link next;

	public Link(int value) {
		this.value = value;
		this.next = null;
	}

	public void displayLink() {
		System.out.println("{ " + this.value + " }");
	}
}

class LinkList {
	private Link first;

	public LinkList() {
		first = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int value) {
		Link newLink = new Link(value);
		newLink.next = first;
		first = newLink;
	}

	public Link deleteFirst() {
		Link tmp = first;
		first = first.next;
		return tmp;
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

public class linkList {

	public static void main(String[] args) {
		LinkList theList = new LinkList();

		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(88);

		theList.displayList();

		while (!theList.isEmpty()) {
			Link aLink = theList.deleteFirst();
			System.out.print("Deleted ");
			aLink.displayLink();
			System.out.println("");
		}
		theList.displayList();
	}

}
