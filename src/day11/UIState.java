package day11;

import java.util.LinkedList;

public class UIState {
	private LinkedList<Character> listA;
	private LinkedList<Character> listB;
	private LinkedList<Character> listC;
	
	public UIState() {
		this.listA = new LinkedList<Character>();
		this.listB = new LinkedList<Character>();
		this.listC = new LinkedList<Character>();
	}

	public LinkedList<Character> getListA() {
		return listA;
	}

	public void setListA(LinkedList<Character> listA) {
		this.listA = listA;
	}

	public LinkedList<Character> getListB() {
		return listB;
	}

	public void setListB(LinkedList<Character> listB) {
		this.listB = listB;
	}

	public LinkedList<Character> getListC() {
		return listC;
	}

	public void setListC(LinkedList<Character> listC) {
		this.listC = listC;
	}
	
	
}
