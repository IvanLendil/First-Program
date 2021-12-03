package week9.day2.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;


public class LearnMap {
	
	/**
	 * 
	 * Map - interface
	 * 
	 * 
	 * An object that maps keys to values. A map cannot contain duplicate keys; 
	 * each key can map to at most one value.
	 * 
	 * 
	 * 
	 * The Map interface provides three collection views, which allow a map's contents to be viewed
	 * as a 1) set of keys, 2) collection of values, or 3) set of key-value mappings. 
	 * The order of a map is defined as the order depends on implementation
	 * 
	 *  Some map implementations, like the 
	 *  TreeMap class, make specific guarantees as to their order by key
	 *  HashMap class, do not guarantee any order
	 *  LinkedHashMap - maintains the order
	 *  
	 *  Methods:
	 *  
	 *  1) get(key) 
	 *  2) containsKey(key)
	 *  3) entrySet()
	 *  4) put(key, value)
	 *  5) size
	 *  6) remove(key)
	 *  7) clear
	 *  8) isEmpty
	 * 
	 * Other key observations of HashMap, LinkedHasMap)
	 *  # non-synchronized (not thread-safe)
	 *  # null values allowed (ofcourse 1 key)
	 * 
	 */	
	
	
	
	public static void main(String[] args) {
		
		// You can't use primitive types as generic arguments in Java
		Map<Integer, String>  members = new HashMap<Integer, String>();
		//Map<Integer, String>  members = new TreeMap<Integer, String>();
		
		// TreeMap: "is sorted according to the natural ordering of its keys"
		// HashMap: "makes no guarantees as to the order of the map"
		// LinkedHashMap: "with predictable iteration order [...] 
		// which is normally the order in which keys were inserted into the map (insertion-order)."
		
		// Add members to the map (note the order)
		members.put(5,"Ivan");
		members.put(2,"Gopi");
		members.put(4,"Lendil");
		members.put(6,"Harry");
		members.put(3,"Madhan");
		members.put(1,"Mani");
	//	members.put(null,null);		
		members.put(7,"kandan");
		members.put(7,"MadanIvanGopi");
		
		// Now get the count
		System.out.println("The total members are"
				+ " :"+members.size());
		
		// find the value of 7
		System.out.println("The value of 7 is :"+members.get(7));
		
		// Print the name of all members -- you will notice the order in the map maintained
		for (Entry<Integer, String> member : members.entrySet()) {
			
			System.out.println("The key is: "+member.getKey()+""
					+ " and value is: "+member.getValue()); 			
		}
		
		// contains
		System.out.println("Is key:5 is available in the "
				+ "set :"+members.containsKey(5));
		
		// remove
		members.remove(5);
		
		// contains
		System.out.println("Is key:5 is available in"
				+ " the set after removal :"+members.containsKey(5));
		
		// clear
		members.clear();
		
		// check if it empty
		System.out.println("The set is empty "
				+ ":"+members.isEmpty());
		
		
		
		
	}

}
