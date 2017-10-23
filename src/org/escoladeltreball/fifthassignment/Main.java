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
import java.util.Set;
import java.util.Map;

/**
 * @author iaw46994355
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
		/// ENUM ///
		WeekEndType type = WeekEndType.valueOf("dissabte"); // Pots trobar el tipus si l'String coincideix. Si no coincideix, dóna error
		System.out.println(type);
		
		/// LISTS ///
		List<String> list = Arrays.asList("alfa","charlie","bravo","alfa"); // No podem afegir un elements a aquesta llista, però sí a list2
		List<String> list2 = new ArrayList<>(list);
//		list2.add(null);
//		list2.add(null);
		Collections.sort(list2); // peta per què hi ha nulls? Com funciona un Collections.sort ben bé? Depèn del Comparable? Es pot fer list.sort();?
		System.out.println(list2);
		System.out.println(list);
		
		/// SETS /// -- No admeten duplicats, lo qual són pràctics per eliminar-los d'una llista
		Set<String> set = new HashSet<>(list); // No es pot instanciar la classe Set
		set.add("charlie");
		set.remove("alfa");
		set.remove("no existeix aquest string dins el set"); // Cap problema
		set.add(null); // No dóna problemes, però no admet duplicats
		for (String string : set) {
			System.out.println(string);
		}
		System.out.println(set);
		
		/// MAPES ///
		Map<Long, String> map = new HashMap<>(); // No admet primitius. No es pot instanciar la classe Map
		map.put(111111L, "albert");
		map.put(222222L, "bernard");
		map.put(333333L, "carles");
		map.put(444444L, "daniel");
		System.out.println(map.get(222222L)); // Buscar una clau que no existeix dóna null
		map.remove(222222L);
		System.out.println(map.get(222222L));
		map.remove(222222L);
		System.out.println(map.get(222222L)); // No dóna error. És una classe resistent
		Set<Long> keys = map.keySet();
		System.out.println(keys);
		Collection<String> c = map.values(); // Diferència entre Collection i Collections?
		System.out.println(c);
		
		
		/// MAPES (2) ///
		Map< Boolean, List<String> > map2 = new HashMap<>();
		List<String> l1 = Arrays.asList("anna","joan","marta");
		List<String> l2 = Arrays.asList("miquel","montse","carlos");
		map2.put(Boolean.TRUE, l1);
		map2.put(Boolean.FALSE, l2);

	}

}
