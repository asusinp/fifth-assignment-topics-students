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
 * @author iaw39442165
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
		
		
		
		// ------ Testing Sets and Lists ------
		
//		List<String> list = Arrays.asList("alfa", "charlie", "bravo", "alfa");
//		List<String> list2 = new ArrayList<>(list);
//		list2.add(null);
//		list2.add(null);
//		Collections.sort(list2);
//		System.out.println(list2);
//		System.out.println(list);
//		Set<String> set = new HashSet<>(list);
//		set.add("charlie");
//		set.remove("delta");
//		set.add(null);
//		for (String string: set) {
//			System.out.println(string);
//		}
//		System.out.println(set);
		
		
		
		// ---- Testing Maps ------	
		
//		Map<Long, String> map = new HashMap<>();
//		map.put(6754235L, "Ricard");
//		map.put(6755235L, "Alex");
//		map.put(6754635L, "Carlos");
//		map.put(6754275L, "Toni");
//		map.put(6754238L, "Melina");
//		System.out.println(map.get(6754235L));
//		Set<Long> keys = map.keySet();
//		System.out.println(keys);
//		Collection<String> c = map.values();
//		System.out.println(c);
//		Map<Boolean, List<String>> map2 = new HashMap<>();
//		List<String> l1 = Arrays.asList("ana","joan","angela");
//		List<String> l2 = Arrays.asList("pep","victor","montse");
//		map2.put(Boolean.TRUE, l1);
//		map2.put(Boolean.FALSE, l2);
		
	}

}
