/**
 * 
 */
package org.escoladeltreball.fifthassignment;

import java.awt.SystemTray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author iaw26509397
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

}

//List<String> list = Arrays.asList("alfa", "charlie", "bravo", "alfa");
//List<String> list2 = new ArrayList<>(list);
////list2.add(null);
////list2.add(null);
//System.out.println(list2);
//System.out.println(list);
//Set<String> set = new HashSet<>(list);
//set.add("charlie");
//set.remove("alfa");
//set.remove("asdfg");
//for (String string : set) {
//	System.out.println(string);
//}
//System.out.println(set);




//Map<Long, String> map = new HashMap<>();
//map.put(626346L, "joan");
//map.put(234567L, "marina");
//map.put(135345L, "tere");
//map.put(342522L, "joan");
//System.out.println(map.get(626346L));
////map.remove(626346L);
//System.out.println(map.get(626346L));
//Set<Long> keys = map.keySet();
//System.out.println(keys);
//Collection c = map.values();
//System.out.println(c);



//Map<Boolean, List<String>> map = new HashMap<>();
//List<String> l1 = Arrays.asList("ana", "joan", "marta");
//List<String> l2 = Arrays.asList("carlos", "montse", "miguel");
//map.put(Boolean.TRUE, l1);
//map.put(Boolean.FALSE, l2);


