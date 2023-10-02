package test;

import java.util.HashSet;
import java.util.Map.Entry;

public class MyLinkedList {
	Node Head;
	//Node Tail;
	
	public static void main(String[] args) {
		MyLinkedList mylist = new MyLinkedList();
//		fillMyList(mylist);
//		System.out.println(mylist.size());
//		System.out.println("Remove First");
//		while(mylist.size()>0) {
//			System.out.print(mylist.removeFirst().myValue);			
//		}
//		fillMyList(mylist);
//		System.out.println("\nRemove Last");
//		while(mylist.size()>0) {
//			System.out.print(mylist.removeLast().myValue);			
//		}
		
		HashSet<Integer> mySet = new HashSet<Integer>();
		mySet.add(3);
		mySet.add(3);
		mySet.add(3);
		
		for(Integer t:mySet) {
			System.out.println(t);
		}
	}
	public static MyLinkedList fillMyList(MyLinkedList list) {
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		return list;
	}
	public MyLinkedList() {
	}
	
	public Node get(int index) {
		if(index >= size()) {
			return null;
		}
		Node temp = Head;
		int count =0;
		while(temp.next!=null && count!=index) {
			count++;
			temp = temp.next;
		}
		if(count == index)
			return temp;
		return null;
	}
	
	public void add(Integer val) {
		if(Head == null) {
			Head = new Node(val, null);
			return;
		}
		
		Node myPointer = Head;
		
		while(myPointer.next!=null) {
			myPointer = myPointer.next;
		}
		//myPointer.next == null
		myPointer.next = new Node(val, null);
		
		//or
		/*Node temp  = new Node(val, null);
		if(Head == null || Tail == null) {
			Head = temp;
			Tail = temp;
		}else {
			Tail.next = temp;
			Tail = Tail.next;
		}*/
	}
	
	public Node remove(int index) {
		if(Head == null) {
			return null;
		}
		Node firstPointer = Head;
		
		if(index == 0){
			Node temp = Head;
			Head = null;
			return temp;
		}

		if(Head.next == null) {
			return null;
		}
		//index > 0 //head.next has data
		int count = 1;
		Node secondPointer = Head.next;
		
		while(count < index && secondPointer.next != null) {
			count++;
			firstPointer = secondPointer;
			secondPointer = secondPointer.next;
		}
		//count >= index
		if(count >= index) {
			firstPointer.next = secondPointer.next;
			return secondPointer;
		}
		return null;
	}
	
	public Node removeFirst() {
		if(Head == null) {
			return null;
		}
		Node temp = Head;
		Head = Head.next;
		return temp;
	}
	
	public Node removeLast() {
		if(Head == null) {
			return null;
		}
		Node firstPointer = Head;
		
		if(Head.next == null){
			Node temp = Head;
			Head = null;
			return temp;
		}
		Node secondPointer = Head.next;
		
		while(secondPointer.next != null) {
			firstPointer = secondPointer;
			secondPointer = secondPointer.next;
		}
		firstPointer.next =null;
		return secondPointer;
	}
	
	public int size() {
		if(Head == null) return 0;
		Node temp = Head;
		int count =1;
		while(temp.next!=null) {
			count++;
			temp = temp.next;
		}
		return count;
	}
	
	class Node{
		Integer myValue;
		Node next;
		
		public Node(Integer val,Node next) {
			this.myValue = val;
			this.next = next;
		}
	}
}
