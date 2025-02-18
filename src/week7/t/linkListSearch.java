package week7.t;

class Link2 {
	public int value;
	public Link2 next;

	public Link2(int value) {
		this.value = value;
		this.next = null;
	}

	public void displayLink() {
		System.out.println("{ " + this.value + " }");
	}
}

class LinkList2 {
	private Link2 first;

	public LinkList2() {
		first = null;
	}

	public boolean isEmpty() {
		return first == null;
	}

	public void insertFirst(int value) {
		Link2 newLink = new Link2(value);
		newLink.next = first;
		first = newLink;
	}

	public void insertSort(int key) {
		Link2 newLink = new Link2(key);
		Link2 previous = null;
		Link2 current = first;

		while (current != null && key > current.value) {
			previous = current;
			current = current.next;
		}
		if (previous == null)
			first = newLink;
		else
			previous.next = newLink;
		newLink.next = current;
	}

	public Link2 deleteFirst() {
		Link2 tmp = first;
		first = first.next;
		return tmp;
	}

	public Link2 find(int key) {
		Link2 current = first;
		while (current.value != key) {
			if (current.next == null) {
				return null;
			} else {
				current = current.next;
			}
		}
		return current;
	}

	public Link2 delete(int key) {
		Link2 current = first;
		Link2 previous = first;
		while (current.value != key) {
			if (current.next == null)
				return null;
			else {
				previous = current;
				current = current.next;
			}
		}
		if (current == first)
			first = first.next;
		else
			previous.next = current.next;
		return current;
	}

	public void displayList() {
		System.out.print("List (first-->last): ");
		Link2 current = first;
		while (current != null) {
			current.displayLink();
			current = current.next;
		}
		System.out.println("");
	}
}

public class linkListSearch {

	public static void main(String[] args) {
		LinkList2 theList = new LinkList2();

		theList.insertFirst(22);
		theList.insertFirst(44);
		theList.insertFirst(66);
		theList.insertFirst(88);

		theList.displayList();

		while (!theList.isEmpty()) {
			Link2 aLink = theList.deleteFirst();
			System.out.print("Deleted ");
			aLink.displayLink();
			System.out.println("");
		}
		theList.displayList();
	}

}
