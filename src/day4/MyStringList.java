package day4;

public class MyStringList {

	private String[] strArray;
	private int size;

	public MyStringList() {
		strArray = new String[2];
		size = 0;
	}

	// adds s to the end of the underlying array
	public void add(String s) {
		if (strArray.length == size)
			resize();

		strArray[size] = s;

		size++;
	}

	// retrieves the String at the ith position in the underlying array
	public String get(int i) {
		return (i < size - 1) ? strArray[i] : "";
	}

	// returns true if String s is found in the array, false otherwise
	public boolean find(String s) {
		for (String temp : this.strArray) {
			if (temp.equals(s))
				return true;
		}

		return false;
	}

	// removes first occurrence of String s if it is found in the underlying array
	// if found, returns true; if not found returns false
	public boolean remove(String s) {
		boolean found = false;
		for (int i = 0; i < strArray.length; i++) {
			if (!found && strArray[i].equals(s)) {
				found = true;
				continue;
			}
			if (found) {
				// move front
				strArray[i - 1] = strArray[i];
			}
		}
		if (found) {
			this.size--;
		}
		return found;
	}

	/*
	 * returns a String representation of the underlying array here is a typical
	 * output: [Bob, Steve, Susan, Mark, Dave]
	 */
	public String toString() {
		String result = "[";
		for (String s : strArray) {
			if (s != null) {
				if (s != strArray[0])
					result += ", " + s + " ";
				else
					result += " " + s + " ";
			}
		}
		result += "]";
		return result;
	}

	/*
	 * returns the next open position in the underlying array – this is precisely
	 * the number of Strings that have been added minus the number of String that
	 * have been removed.
	 */
	public int size() {
		return this.size;
	}

	public void resize() {
		System.out.println("Resizing...");
		String[] tempAry = new String[strArray.length * 2];
		System.arraycopy(strArray, 0, tempAry, 0, strArray.length);
		strArray = tempAry;
	}

	public static void main(String[] args) {
		MyStringList l = new MyStringList();
		l.add("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Steve");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Susan");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.add("Dave");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Mark");
		System.out.println("The list of size " + l.size() + " is " + l);
		l.remove("Bob");
		System.out.println("The list of size " + l.size() + " is " + l);

	}

}
