package day13;

import org.w3c.dom.Node;

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
		System.out.println();
	}

	private void printTreeInOrder(BinaryNode t) {
		if (t != null) {
			printTreeInOrder(t.left);
			System.out.print(t.element+",");
			printTreeInOrder(t.right);
		} // An INORDER Traversal
	}
	
	public void printTreePreOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTreePreOrder(root);
		System.out.println();
	}

	private void printTreePreOrder(BinaryNode t) {
		if (t != null) {
			System.out.print(t.element+",");
			printTreePreOrder(t.left);
			printTreePreOrder(t.right);
		} // An PreOrder Traversal
	}
	
	public void printTreePostOrder() {
		if (root == null)
			System.out.println("Empty tree");
		else
			printTreePostOrder(root);
		System.out.println();
	}

	private void printTreePostOrder(BinaryNode t) {
		if (t != null) {
			printTreePostOrder(t.left);
			printTreePostOrder(t.right);
			System.out.print(t.element+",");
		} // An PreOrder Traversal
	}

	public Integer getMiddle() {
		if(countnodes()%2==0)
			return null;
		System.out.println("Start Finding mid");
		BinaryNode b= getMiddle(0,root,0);
		if(b!=null)
			return b.element;
		return null;
	}
	
	private BinaryNode getMiddle(int left,BinaryNode t, int right) {
		if(t==null) {
			return null;
		}
		
		System.out.println("Checking "+t.element);
		System.out.println("Left Side "+(left+countnodes(t.left)));
		System.out.println("Right Side "+(right+countnodes(t.right)));
		
		if(left+countnodes(t.left)==right+countnodes(t.right)) {
			System.out.println("found");
			return t;
		}
		if(left+countnodes(t.left)>right+countnodes(t.right)) {
			System.out.println("going left");
			return getMiddle(left,t.left,right+countnodes(t.right)+1);
		}
			
		
		//if(left+countnodes(t.left)<right+countnodes(t.right)) {
			System.out.println("going right");
			return getMiddle(left+countnodes(t.left)+1,t.right,right);
		//}
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
	
	public Integer findMax(BinaryNode t) {
		if(t==null) return null;
		if(t.right == null) return t.element;
		return findMax(t.right);
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
			} else {
				return;
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
