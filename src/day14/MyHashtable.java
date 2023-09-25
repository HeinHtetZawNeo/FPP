package day14;

import java.util.Iterator;
import java.util.LinkedList;

public class MyHashtable {
	private static final int INITIAL_SIZE;
	
	static {
		INITIAL_SIZE=19;
	}
	
	private int tableSize;
	
	private LinkedList<Entry>[] table; 
	
	public MyHashtable(){
		this(INITIAL_SIZE);
	}
	
	public MyHashtable(int tableSize) {
		this.tableSize = tableSize;
		this.table = new LinkedList[tableSize];
	}// an array of LinkedList objects.
	
	public Object get(Object key){
		//null key not allowed
		if(key==null) return null;
		//get the "big" integer corresponding to the object
		int hashcode = key.hashCode();
		
		//compress down to a table slot
		int hash = hashM(hashcode);
		
		//now look for the desired Entry
		Entry e = null;


    //First we should make sure that table[hash]
    //is Not null.  If it is null, then the 
    //Entry is Not there.      (JL).

		Iterator<Entry> it = table[hash].iterator();
		while(it.hasNext()){
			e = (Entry)it.next();
			if(e.key.equals(key)) {
				return e.value;
			}
		}
		return null; // Not found. 
		 
	}

	public void put(Object key, Object value){
		//disallow null keys
		if(key==null) return;

		if(get(key)!=null)
			System.out.println("Key is already exisited");
		//get the "big" integer corresponding to the object
		//assumes key is not null
		int hashcode = key.hashCode();
		
		//compress down to a table slot
		int hash = hashM(hashcode);
		
		//put the value and the key into an Entry object
		//which will be placed in the table in the
		//slot ( namely, hash)



		//allows a null value
		Entry e = new Entry(key,value);
		
		// now place it in the table
		if(table[hash] == null){
			table[hash] = new LinkedList();
		}
		//this allows duplicate keys
		table[hash].add(e);
	}

	public int count() {
		int count = 0;
		
		for(LinkedList<Entry> e: table) {
			if(e!=null) {
				count += e.size();
			}
		}
		
		return count;
	}
	
	public int getEmptyArrayCells() {
		int count =0;
		for(LinkedList<Entry> e: table) {
			if(e==null) count++;
		}
		return count;
	}
	
	public int getlongestLinkedListChain() {
		
		LinkedList<Entry> longestLinkedList=null;
		for(LinkedList<Entry> e: table) {
			if(e!=null) {
				if(longestLinkedList==null) 
					longestLinkedList=e;
				else if(longestLinkedList.size()<e.size()) {
					longestLinkedList = e;
				}
			}
		}
		
		return longestLinkedList.size();
	}
	
	public String toString(){
		String n = System.getProperty("line.separator");//a new line
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < table.length;++i){
			if(table[i] != null){
				Iterator<Entry> it = table[i].iterator();//For the
                           //LinkedList at table[i]

				Entry next = null;
				while(it.hasNext()){
					next = (Entry)it.next();
					sb.append(next);
				}
			}
		}
		return sb.toString();
	}
	
	private int hashM(int bigNum) {
		return Math.abs(bigNum) % tableSize;
	}
	
	private class Entry{
		private Object key;
		private Object value;
		
		Entry(Object key, Object value){
			this.key = key;
			this.value = value;
		}
		public String toString(){
			return key.toString()+"->"+value.toString()+"\n";
		}
		
	}

}