package day11;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		LinkedList<Character> listA = new LinkedList<Character>();
		LinkedList<Character> listB = new LinkedList<Character>();
		LinkedList<Character> listC = new LinkedList<Character>();
		LinkedList<Character> firstList = null;
		LinkedList<Character> secondList = null;
		Scanner sc = new Scanner(System.in);
		String result = "";
		int index = 0;
		int input = 0;
		while(true){
			System.out.println("\n####################################");
			System.out.println("R. Read A String");
			System.out.println("C. Concatenate");
			System.out.println("W. Write");
			System.out.println("EQ. Equal?");
			System.out.println("I. Insert");
			System.out.println("S. Search");
			System.out.println("D. Delete");
			System.out.println("Sub. SubString");
			System.out.println("E. exit");
			System.out.print("Enter Command : ");
			result = sc.nextLine();
			
			switch (result) {
			case "r":
			case "R":
				//Read A String
				System.out.println("Enter String Name :");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					Readstring(listA);
					break;
				case "B":
				case "b":
					Readstring(listB);
					break;
				case "C":
				case "c":
					Readstring(listC);
					break;
				}
				break;
			case "c":
			case "C":
				//Concatenate
				firstList = null;
				secondList = null;
				System.out.println("Enter First List Name :");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					firstList = listA;
					break;
				case "B":
				case "b":
					firstList = listB;
					break;
				case "C":
				case "c":
					firstList = listC;
					break;
				}
				System.out.println("Enter Second List Name :");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					secondList = listA;
					break;
				case "B":
				case "b":
					secondList = listB;
					break;
				case "C":
				case "c":
					secondList = listC;
					break;
				}
				if(firstList!= null && secondList != null) {
					Concatenate(firstList, secondList);
				}
				break;
			case "W":
			case "w":
				//Write A String
				System.out.println("Enter String Name :");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					Writestring(listA);
					break;
				case "B":
				case "b":
					Writestring(listB);
					break;
				case "C":
				case "c":
					Writestring(listC);
					break;
				}
				break;
			case "EQ":
			case "eq":
			case "Eq":
			case "eQ":
				firstList = null;
				secondList = null;
				System.out.println("Enter First List Name :");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					firstList = listA;
					break;
				case "B":
				case "b":
					firstList = listB;
					break;
				case "C":
				case "c":
					firstList = listC;
					break;
				}
				System.out.println("Enter Second List Name :");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					secondList = listA;
					break;
				case "B":
				case "b":
					secondList = listB;
					break;
				case "C":
				case "c":
					secondList = listC;
					break;
				}
				if(firstList!= null && secondList != null)
					if(Equal(firstList, secondList))
						System.out.println("They are equal");
					else
						System.out.println("They are NOT equal");
				break;
			case "I":
			case "i":
				firstList = null;
				secondList = null;
				System.out.println("Enter First List Name :");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					firstList = listA;
					break;
				case "B":
				case "b":
					firstList = listB;
					break;
				case "C":
				case "c":
					firstList = listC;
					break;
				}
				System.out.println("Enter Second List Name :");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					secondList = listA;
					break;
				case "B":
				case "b":
					secondList = listB;
					break;
				case "C":
				case "c":
					secondList = listC;
					break;
				}
				System.out.println("Enter Start Index :");
				index = Integer.parseInt(sc.nextLine());
				if(firstList!= null && secondList != null && index >=0) {
					Insert(firstList, secondList, index);
				}
				break;
			case "S":
			case "s":
				firstList = null;
				secondList = null;
				System.out.println("Enter Search String :");
				result = sc.nextLine();
				System.out.println("Enter List Name to Search:");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					firstList = listA;
					break;
				case "B":
				case "b":
					firstList = listB;
					break;
				case "C":
				case "c":
					firstList = listC;
					break;
				}
				System.out.println("Enter Search Index :");
				index = Integer.parseInt(sc.nextLine());
				if(firstList!=null) {
					int searchResult = Search(result, firstList, index);
					
					if(searchResult<0)
						System.out.println("String NOT FOUND");
					else
						System.out.println("String is found from this index :"+searchResult);
				}
				break;
			case "D":
			case "d":
				firstList = null;
				secondList = null;
				System.out.println("Enter Delete String List :");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					firstList = listA;
					break;
				case "B":
				case "b":
					firstList = listB;
					break;
				case "C":
				case "c":
					firstList = listC;
					break;
				}
				System.out.println("Enter Start Index :");
				index = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Length :");
				input = Integer.parseInt(sc.nextLine());
				if(firstList!=null) {
					Delete(firstList, index, input);
				}
				break;
			case "Sub":
			case "sub":
			case "SUB":
				firstList = null;
				secondList = null;
				System.out.println("Enter First List Name :");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					firstList = listA;
					break;
				case "B":
				case "b":
					firstList = listB;
					break;
				case "C":
				case "c":
					firstList = listC;
					break;
				}
				System.out.println("Enter Second List Name :");
				result = sc.nextLine();
				switch(result) {
				case "A":
				case "a":
					secondList = listA;
					break;
				case "B":
				case "b":
					secondList = listB;
					break;
				case "C":
				case "c":
					secondList = listC;
					break;
				}
				System.out.println("Enter Start Index :");
				index = Integer.parseInt(sc.nextLine());
				System.out.println("Enter Length :");
				input = Integer.parseInt(sc.nextLine());
				if(firstList!= null && secondList != null) {
					SubString(firstList, secondList, index, input);
				}
				break;
			case "E":
			case "e":
				//exit
				return;
			}
		}
		
		//Test Area
/*		LinkedList<Character> clist = new LinkedList<Character>();
		clist.add('B');
		clist.add('C');
		clist.add('A');
		clist.add('A');
		clist.add('A');
		clist.add('B');
		clist.add('C');
		
		System.out.println(Search("BC", clist, 0));*/
	}

	private static void Readstring(LinkedList<Character> list) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Text :");
		String input = sc.nextLine();
		char[] cList = input.toCharArray();
		Clear(list);
		for(char c:cList) {
			list.add(c);
		}
	}
	
	private static void Writestring(LinkedList<Character> list) {
		Iterator<Character> myIterator = list.iterator();
		while(myIterator.hasNext()) {
			System.out.print(myIterator.next());
		}
		
		System.out.println();
	}
	
	private static void Clear(LinkedList<Character> list) {
		list.clear();
	}
	
	private static int Len(LinkedList<Character> list) {
		int count =0;
		Iterator<Character> myIterator = list.iterator();
		while(myIterator.hasNext()) { //5
			
			count++;
			myIterator.next();
		}
		return count;
	}
	
	public static boolean Equal(LinkedList<Character> listA,LinkedList<Character> listB) {
		
		if(Len(listA) != Len(listB)) return false;
		
		Iterator<Character> myIteratorA = listA.iterator();
		Iterator<Character> myIteratorB = listB.iterator();
		
		
		while(myIteratorA.hasNext() && myIteratorB.hasNext()) {
			if(!myIteratorA.next().equals(myIteratorB.next())) return false;
		}
		return true;
	}

	private static void Concatenate(LinkedList<Character> toList,LinkedList<Character> fromList) {
		System.out.println("from");
		for(Character c:fromList) {
			toList.add(c);
		}
	}

	private static void Insert(LinkedList<Character> toList,LinkedList<Character> fromList,int start) {
		if(start>=Len(toList)) {
			Concatenate(toList, fromList);
		}else {
			for(Character c: fromList) {
				toList.add(start++, c);
			}
			
		}
	}

	private static int Search(String searchString,LinkedList<Character> toList,int start) {
		if(start>Len(toList)) return -1;
		if(start+searchString.length()>Len(toList)) return -1;
		
		char[] charList = searchString.toCharArray();
		int foundIndex = -1;
		boolean found = false;
		
		for(int i=start;i<toList.size();i++) {
			if(toList.get(i).equals(charList[0])) {
				found=true;
				foundIndex = i;
			}
			if(found) {
				for(int j=0;j<charList.length;j++) {
					if(i+j<toList.size()) {
						if(toList.get(i+j)!=charList[j]) {
							found = false;
							break;
						}
						if(j==charList.length-1)
							return foundIndex;
					}else {
						found = false;
						foundIndex = -1;
					}
				}
			}
		}
		return foundIndex;
	}
	
	private static void Delete(LinkedList<Character> target,int startIndex,int span) {
		if(startIndex+span >Len(target)) return;
		
		for(int i=0;i<span;i++){
			target.remove(startIndex);
		}
	}

	private static void SubString(LinkedList<Character> target,LinkedList<Character> list2,int startIndex,int span) {
		Clear(target);
		
		if(startIndex+span > list2.size()) return;
		
		for(int i=0;i<span;i++) {
			target.add(list2.get(startIndex+i));
		}
	}
}
