package week7.c;

import java.util.*;

class NodeTree {
	public int data;
	public NodeTree right;
	public NodeTree left;

	public NodeTree(int data) {
		this.data = data;
		this.right = null;
		this.left = null;
	}
}

class BinaryTree {
	public NodeTree root;

	public BinaryTree() {
		this.root = null;
	}

	public NodeTree getRoot() {
		return root;
	}

	public void addNode(int data) {
		NodeTree newNode = new NodeTree(data);

		if (this.root == null) {
			this.root = newNode;
		} else {
			NodeTree current = root;
			while (current != null) {
				if (current.data > data) {
					if (current.left == null) {
						current.left = newNode;
						break;
					}
					current = current.left;
				} else {
					if (current.right == null) {
						current.right = newNode;
						break;
					}
					current = current.right;
				}
			}
		}
	}

	public void delete(int key) {
		if (root == null) {
			System.out.println("Tree has 0 nodes");
			return;
		}

		NodeTree p = root;
		NodeTree p1 = null;

		while (p != null && p.data != key) {
			p1 = p;

			if (p.data > key) {
				p = p.left;
			} else {
				p = p.right;
			}
		}

		if (p == null) {
			System.out.println("Key does not exist");
			return;
		}

		if (p.left == null && p.right == null) {

			if (p.data > p1.data) {
				p1.right = null;
			} else {
				p1.left = null;
			}

		} else if (p.left != null && p.right == null) {

			if (p1.data > p.left.data) {
				p1.left = p.left;
			} else {
				p1.right = p.left;
			}

		} else if (p.right != null && p.left == null) {

			if (p1.data > p.right.data) {
				p1.right = p.right;
			} else {
				p1.right = p.right;
			}

		} else if (p.right != null && p.left != null) {
			NodeTree s = p.right;
			NodeTree s1 = null;

			if (s.left != null) {

				while (s.left != null) {
					s1 = s;
					s = s.left;
				}

				if (s1 != null)
					s1.left = null; // to break the link

				if (s.right != null) {
					s1.left = s.right;
				}

				s.right = p.right;
			}

			s.left = p.left;

			if (p1 != null) {
				if (p1.data > s.data) {
					p1.left = s;
				} else {
					p1.right = s;
				}
			} else {
				root = s;
			}
		}

	}

	public int countNodes(NodeTree root) {
		if (root == null)
			return 0;

		return countNodes(root.left) + 1 + countNodes(root.right);
	}

	public void preOrder(NodeTree root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " | ");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrder(NodeTree root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + " | ");
		inOrder(root.right);
	}

	public void postOrder(NodeTree root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + " | ");
	}

	public void levelOrderPrint(NodeTree root) {
		Queue<NodeTree> q = new LinkedList<>();

		if (root == null) {
			return;
		}

		q.add(root);
		NodeTree temp = q.peek();
		while (q.size() > 0) {
			System.out.print(temp.data + " | ");
			if (temp.left != null)
				q.add(temp.left);

			if (temp.right != null)
				q.add(temp.right);

			q.remove();
			temp = q.peek();
		}
	}

	public int height(NodeTree root) {
		if (root == null)
			return 0;
		else {
			int lheight = height(root.left);
			int rheight = height(root.right);

			if (lheight > rheight)
				return (lheight + 1);
			else
				return (rheight + 1);
		}
	}
}

public class BinarySearchTree {

	public static void main(String[] args) {
		int[] nodes = { 13, 4, 9, 6, 23, 27, 21, 22, 15, 3, 2, 7 };

		BinaryTree bst = new BinaryTree();
		for (int i = 0; i < nodes.length; i++) {
			bst.addNode(nodes[i]);
		}
		System.out.println("Pre Order");
		bst.preOrder(bst.getRoot());

		System.out.println();
		System.out.println("In Order");
		bst.inOrder(bst.getRoot());

		System.out.println();
		System.out.println("Post Order");
		bst.postOrder(bst.getRoot());

	}

}
