package finalExamPreparation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.random.RandomGenerator.ArbitrarilyJumpableGenerator;
import java.util.*;

public class MyTest {
	int temp;

	public static void main(String[] args) {
		LinkedList<Integer> doublyLinkedList = new LinkedList<Integer>();
		
		HashMap< Integer, Integer> myhashmap = new HashMap<Integer, Integer>();
		
		myhashmap.put(1, 1);
		myhashmap.put(1, 2);
		myhashmap.put(1, 3);
		
//		System.out.println(myhashmap.get(1));
//		System.out.println(myhashmap.get(2));
//		System.out.println(myhashmap.size());
//		
//		Hashtable<Integer, Integer> myhashtable = new Hashtable<Integer, Integer>();
//		myhashtable.put(1, 1);
//		System.out.println(myhashtable.size());
		
		doublyLinkedList.add(1);
		doublyLinkedList.add(2);
		doublyLinkedList.add(3);
		doublyLinkedList.add(2);
		doublyLinkedList.add(1);
		
		Iterator<Integer> myIterator = doublyLinkedList.descendingIterator();
		Iterator<Integer> myIterator2 = doublyLinkedList.iterator();
		
		while(myIterator.hasNext() && myIterator2.hasNext()) {
			System.out.println(myIterator.next().equals(myIterator2.next()));
		}
//		
//		List<Integer> arr1 = new ArrayList<Integer>();
//		int[] temp1 = arr1.toArray();
//		
		
	}
	

}
