package week7.c;

class Person {
	public String name;
	public String lastName;
	
	public Person (String name, String lastName) {
		this.name = name;
		this.lastName = lastName;
	}
}

class Node {
	public Person value;
	public Node next;
	public Node last;

	public Node(Person value) {
		this.value = value;
		this.next = null;
		this.last = null;
	}

	public void showNode() {
		System.out.println("{ Name = " + value.name  + " Last Name" + value.lastName+ " }");
	}
}

class LinkList {
	private Node first;

	public LinkList() {
		this.first = null;
	}

	public boolean isEmpty() {
		return this.first == null;
	}

	public void insert(Person value) {
		Node newNode = new Node(value);
		if (!isEmpty()) {
			first.last = newNode;						
		}
		newNode.next = first;
		first = newNode;
	}

	public Node deleteFirst() {
		Node tmp = first;
		first = first.next;
		return tmp;
	}
	
	public Node delete(String name) {
		Node current = first;
		Node previus = first;
		while(!current.value.name.equals(name)) {
			if (current.next == null) {
				return null;
			} else {
				previus = current;
				current = current.next;
			}
		}
		
		if (current == first) {
			first = first.next;
		} else {
			previus.next = current.next;
		}
		return current;

	}
	
	public Node find(Person key) {
		Node current = first;
		while(current.next != null) {
			if (current.value.name == key.name) {
				return current;
			}
			current = current.next;
		}
		return null;
	}

	public void showList() {
		Node current = first;
		while (current != null) {
			current.showNode();
			current = current.next;
		}
		System.out.println();

	}
}

public class SimpleList {

	public static void main(String[] args) {
		LinkList linkList = new LinkList();
		linkList.insert(new Person("Juan1", "Lopez1"));
		linkList.insert(new Person("Juan2", "Lopez2"));
		linkList.insert(new Person("Juan3", "Lopez3"));
		linkList.insert(new Person("Juan4", "Lopez4"));
		linkList.showList();

		System.out.println("Delete");
		/*Node tmp = linkList.deleteFirst();
		//tmp.showNode();
		linkList.showList();
		linkList.deleteFirst();
		linkList.deleteFirst();
		linkList.showList();*/
		/*
		System.out.println("Delete");
		Node tmp2 = linkList.deleteFirst();
		System.out.println(tmp2.value);

		System.out.println("Delete");
		Node tmp3 = linkList.deleteFirst();
		System.out.println(tmp3.value);*/
		
		/*System.out.println("Find");
		Node aux = linkList.find(200);
		if (aux != null) {
			System.out.println(aux.last.value);			
		}
		
		linkList.showList();*/
		
		System.out.println("Delete Juan2");
		linkList.delete("Juan2");
		linkList.showList();

		System.out.println("Delete Juan1");
		linkList.delete("Juan1");
		linkList.showList();
		
		System.out.println("Delete Juan4");
		linkList.delete("Juan4");
		linkList.showList();

		System.out.println("Delete Juan3");
		linkList.delete("Juan3");
		linkList.showList();
	}
}
