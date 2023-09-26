package day13;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		MyBST myBST = new MyBST();
		// 15, 12, 9, 56, 1, 16, 19, 22, 3, 100, 2, 25

		myBST.insert(15);
		myBST.insert(12);
		myBST.insert(9);
		myBST.insert(56);
		myBST.insert(1);
		myBST.insert(16);
		myBST.insert(19);
		myBST.insert(22);
		myBST.insert(3);
		myBST.insert(100);
		myBST.insert(2);
		myBST.insert(25);
		myBST.insert(200);
		myBST.insert(300);
		myBST.insert(7);
		myBST.insert(80);
		myBST.insert(90);
		myBST.insert(100);
		myBST.insert(70);
		myBST.insert(65);
		myBST.insert(60);
		myBST.insert(76);
		
		System.out.println(myBST.countnodes());
		System.out.println(myBST.getMiddle());
		System.out.println("printTreeInOrder");
		myBST.printTreeInOrder();
		System.out.println("printTreePreOrder");
		myBST.printTreePreOrder();
		System.out.println("printTreePostOrder");
		myBST.printTreePostOrder();
//		
		System.out.println("countnodes");
		System.out.println(myBST.countnodes());
		
		System.out.println("countLeaveNodes");
		System.out.println(myBST.countLeaveNodes());
		System.out.println("All Even?");
		System.out.println(myBST.allEven());
		System.out.println("How Many Even");
		System.out.println(myBST.HowManyEven());
		
//		//EXTRA CREDIT
//		TreeMap<Integer, Object> myTreeMap = new TreeMap<Integer, Object>();
//		myTreeMap.put(15, new Object());
//		myTreeMap.put(12, new Object());
//		myTreeMap.put(9, new Object());
//		myTreeMap.put(56, new Object());
//		myTreeMap.put(1, new Object());
//		myTreeMap.put(16, new Object());
//		myTreeMap.put(19, new Object());
//		myTreeMap.put(22, new Object());
//		myTreeMap.put(3, new Object());
//		myTreeMap.put(100, new Object());
//		myTreeMap.put(2, new Object());
//		myTreeMap.put(25, new Object());
//		
//		Set<Entry<Integer, Object>> myTreeSet = myTreeMap.entrySet();
		
		
	}

}
