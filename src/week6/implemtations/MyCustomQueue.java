package week6.implemtations;

class MyQueueCustom {
	private int maxSize = 0;
	private int vec[];
	private int front;
	private int size;

	public MyQueueCustom(int newSize) {
		maxSize = newSize;
		vec = new int[maxSize];
		front = 0;
		size = -1;
	}

	public void add(int value) {
		size++;
		vec[size] = value;
	}

	public int remove() {
		int tmp = vec[front];
		front++;
		return tmp;
	}

	public int peek() {
		return vec[front];
	}

}

public class MyCustomQueue {

	public static void main(String[] args) {

		MyQueueCustom queue = new MyQueueCustom(10);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		queue.add(5);
		queue.remove();
		queue.remove();
		queue.remove();
		queue.remove();

		System.out.println(queue.peek());

	}
}
