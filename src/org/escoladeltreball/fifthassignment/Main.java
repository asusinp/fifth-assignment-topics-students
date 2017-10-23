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
 * @author iaw46490689
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
		// Registres
		System.out.println("Llistes:");
		List<String> list = Arrays.asList("alfa","charlie","bravo","alfa");
		List<String> list2 = new ArrayList<>(list);
//		list2.add(null);		
//		list2.add(null);
		System.out.println(list);
		System.out.println(list2);
		Collections.sort(list2);
		System.out.println(list2);
		
		
		
		// Sets
		System.out.println("\n\nSets:");
		Set<String> set = new HashSet<>(list);
		System.out.println(set);
		set.add("alfa");
		set.remove("charlie");
		set.remove("dadsda");
		set.add(null);
		System.out.println(set);
		for (String string : set) {
			System.out.println(string);
		}
		
		
		
		// Mapes
		System.out.println("\n\nMapes:");
		// No admite tipos primitivos
		Map<Long, String> map = new HashMap<>();
		map.put(625321L, "pepe");
		map.put(356423L, "paco");
		map.put(452348L, "pepa");
		map.put(897343L, "paco");
		System.out.println(map.get(625321L));
		System.out.println(map.get(888888L));
		map.remove(625321L);
		System.out.println(map.get(625321L));
		Set<Long> keys = map.keySet();
		System.out.println(keys);
		Collection<String> c = map.values();
		System.out.println(c);
		
		
		// Mes mapes
		System.out.println("\n\nMes mapes:");
		Map<Boolean, List<String>> map2 = new HashMap<>();
		List<String> l1 = Arrays.asList("ana","joan","marta");
		List<String> l2 = Arrays.asList("montse","carlos","miquel");
		map2.put(Boolean.TRUE, l1);
		map2.put(Boolean.FALSE, l2);
		System.out.println(map2);
		
		
		System.out.println("\n\nEnum:");
		WeekEndType type = WeekEndType.valueOf("dissabte");
		System.out.println(type);
	}

}
