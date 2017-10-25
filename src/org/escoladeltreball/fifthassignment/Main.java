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
 * @author iaw47941842
 *
 */
public class Main {
	
	private enum WeekEndType {
		dissabte, diumenge;
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		System.out.println("********** Proves ************");
		System.out.println();
		
		DeviceManagerImpl manager = new DeviceManagerImpl("devices");
		
		System.out.println(manager.getMapByType());
		
		
		
		
		System.out.println();
		System.out.println("********** Enum ************");
		System.out.println();
		WeekEndType type = WeekEndType.valueOf("dissabte");
		System.out.println(type);
		System.out.println();
		
		System.out.println("********** Set ************");
		System.out.println();
		List<String> list = Arrays.asList("alfa","charlie","bravo","alfa");
		//list.add(null);
		List<String> list2 = new ArrayList<>(list);
		//list2.add(null);
		//list2.add(null);
		Collections.sort(list2);
		System.out.println(list2);
		System.out.println(list);
		Set<String> set = new HashSet<>(list);
		set.add("charlie");
		// conjunt bona manera per eliminar duplicat
		// podem sabe el seu tamany, si esta buit.
		// com el podem recorrer
		for (String string : set) {
			System.out.println(string);			
		}
		// eliminar element
		set.remove("alfa");
		set.remove("asdfg"); // no fa res
		set.add(null); // només es veura un si hi han duplicats
		
		System.out.println(set);
		
		System.out.println();
		System.out.println("********** Map ************");
		System.out.println();
		
		Map<Long, String> map = new HashMap<>();
		
		// afegir put a diferencia dels collections i set
		map.put(225346L, "joan");
		map.put(925346L, "marina");
		map.put(215346L, "tere");
		map.put(925346L, "joan");
		System.out.println(map.get(925346L)); // l'ultim
		System.out.println(map.get(6253464L)); // null si no existeix
		map.remove(225346L); // eliminar
		System.out.println(map.get(625346L));
		map.put(625346L, "joan");
		Set<Long> keys = map.keySet(); // podem haveri duplicats
		System.out.println(keys);
		Collection<String> c = map.values();
		System.out.println(c);
		
		
		Map<Boolean, List<String>> map2 = new HashMap<>();
		List<String> l1 = Arrays.asList("ana", "joan", "marta");
		List<String> l2 = Arrays.asList("miquel", "montse", "carlos");
		map2.put(Boolean.TRUE, l1);
		map2.put(Boolean.FALSE, l2);
		
		
		
	}

}
