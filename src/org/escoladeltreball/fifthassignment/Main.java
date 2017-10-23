/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author iaw39397876
 *
 */
public class Main {

	private enum WeekEndType {
		dissabte, diumenge;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WeekEndType type = WeekEndType.valueOf("dissabte");
		System.out.println(type);
	}
	
//-----------------------------SET------------------------------------------------------
	
//	List<String> list = Arrays.asList("alfa", "charlie", "bravo", "alfa");
//	List<String> list2 = new ArrayList<>(list);
//	list2.add(null);
//	list2.add(null);
//	Collections.sort(list2);
//	System.out.println(list2);
//	System.out.println(list);
//	Set<String> set = new HashSet<>(list);
//	set.add("charlie");
//	set.add("null");
//	set.remove("alfa");
//	set.remove("dasfas");
//	for (String string : set) {
//		System.out.println(string);
//	}
//	System.out.println(set);
	
//------------------------MAPS-------------------------------------------------------------
	
//	Map<Long, String> map = new HashMap<>();
//	map.put(23L, "draymond");
//	map.put(30L, "stephen");
//	map.put(35L, "kevin");
//	map.put(11L, "klay");
//	Set<Long> keys = map.keySet(); //NO pot tenir valors duplicats
//	System.out.println(keys);
//	Collection<String> c = map.values(); //Pot tenir valors duplicats
//	System.out.println(c);
	
//-----------------------------------------------------------------------
	
//	Map<Boolean, List<String>> map = new HashMap<>();
//	List<String> l1 = Arrays.asList("Derrick", "Dwayne", "Lebron");
//	List<String> l2 = Arrays.asList("Gordon", "Kyrie", "Jaylen");
//	map.put(Boolean.TRUE, l1);
//	map.put(Boolean.FALSE, l2);
}
