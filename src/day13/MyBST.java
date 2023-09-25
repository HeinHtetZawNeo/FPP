package day13;

public class MyBST {
	/** The tree root. */
	private BinaryNode root;

	public MyBST() {
		root = null;
	}

	/**
	 * Prints the values in the nodes of the tree in sorted order.
	 */
	public void printTreeInOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTreeInOrder(root);
	}

	private void printTreeInOrder(BinaryNode t) {
		if (t != null) {
			printTreeInOrder(t.left);
			System.out.println(t.element);
			printTreeInOrder(t.right);
		} // An INORDER Traversal
	}
	
	public void printTreePreOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTreePreOrder(root);
	}

	private void printTreePreOrder(BinaryNode t) {
		if (t != null) {
			System.out.println(t.element);
			printTreePreOrder(t.left);
			printTreePreOrder(t.right);
		} // An PreOrder Traversal
	}
	
	public void printTreePostOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTreePostOrder(root);
	}

	private void printTreePostOrder(BinaryNode t) {
		if (t != null) {
			printTreePostOrder(t.left);
			printTreePostOrder(t.right);
			System.out.println(t.element);
		} // An PreOrder Traversal
	}

	public int countnodes() {
		if(root == null)
			return 0;
		else
			return countnodes(root);
	}
	
	private int countnodes(BinaryNode t) {
		if(t != null) {
			return countnodes(t.left) + countnodes(t.right) + 1;
		}else
			return 0;
	}
	
	public boolean allEven() {
		return allEven(root);
	}
	
	private boolean allEven(BinaryNode t) {
		if(t==null) return true;
		if(t.element%2==0)
			return true && allEven(t.left) && allEven(t.right);
		else
			return false;
	}
	
	public int HowManyEven() {
		return HowManyEven(root);
	}
	
	private int HowManyEven(BinaryNode t) {
		if(t==null) return 0;
		if(t.element%2==0)
			return 1 + HowManyEven(t.left) + HowManyEven(t.right);
		else
			return 0+ HowManyEven(t.left) + HowManyEven(t.right);
	}
	
	public int countLeaveNodes() {
		if(root == null)
			return 0;
		else
			return countLeaveNodes(root);
	}
	
	private int countLeaveNodes(BinaryNode t) {
		if(t==null) {
			return 0;
		}
		if(t.left==null && t.right==null) {
			return 1;
		}
		return countLeaveNodes(t.left) + countLeaveNodes(t.right);
	}
	// Assume the data in the Node is an Integer.

	public void insert(Integer x) {
		if (root == null) {
			root = new BinaryNode(x, null, null);
			return;
		}

		BinaryNode n = root;
		boolean inserted = false;

		while (!inserted) {
			if (x.compareTo(n.element) < 0) {
				// space found on the left
				if (n.left == null) {
					n.left = new BinaryNode(x, null, null);
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.left;
				}
			} else if (x.compareTo(n.element) > 0) {
				// space found on the right
				if (n.right == null) {
					n.right = new BinaryNode(x, null, null);
					inserted = true;
				}
				// keep looking for a place to insert (a null)
				else {
					n = n.right;
				}
			}
		}

	}

	private class BinaryNode {

		// Constructors
		@SuppressWarnings("unused")
		BinaryNode(Integer theElement) {
			this(theElement, null, null);
		}

		BinaryNode(Integer element, BinaryNode left, BinaryNode right) {
			this.element = element;
			this.left = left;
			this.right = right;
		}

		private Integer element;// The data in the node
		private BinaryNode left; // Left child
		private BinaryNode right; // Right child
	}

	
}
