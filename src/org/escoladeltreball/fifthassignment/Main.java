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
 * @author iaw26068632
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
		
		WeekEndType type = WeekEndType.valueOf("dissabte");
		System.out.println(type);
		
		DeviceManagerImpl dev = new DeviceManagerImpl("devices");
		
//		System.out.println(dev.getDevices());
		
		System.out.println(dev.getMapByType());
		
		System.out.println("PRUEBA");
		dev.findCheapestDeviceOfEachType();
		
		
		///////////////////////////////////////////////7
		
		// /*
		// * Un mapa es similar a un diccionario, puede asociar parejas
		// * no funciona con primitivos, solo con clases
		// * tampoco se instancia ( new map<>() ) se realiza con hashMap
		// */
		//
		// Map<Long, String> map = new HashMap<>();
		//
		// // añadir se utiliza el put
		//
		// map.put(625346L, "pepe");
		// map.put(625345L, "martina");
		// map.put(625344L, "tere");
		// map.put(625343L, "joan");
		//
		//
		// System.out.println(map.get(625342L)); // Si no existe, retorna null
		//
		// map.remove(625344L);
		//
		// System.out.println(map.get(625344L));
		//
		// map.remove(625344L); // No da exceptions al eliminar dos veces
		//
		// Set<Long> keys = map.keySet(); // no puede ser duplicado
		// System.out.println(keys);
		//
		// map.put(625348L, "pepe");
		//
		// Collection<String> c = map.values(); // Si que puede ser duplicado ej: dos
		// joans
		//
		// System.out.println(c);
		
	}

	
//	Map<Boolean, List<String>> map = new HashMap<>();
//	List<String> l1 = Arrays.asList("ana","joan","marta");
//	List<String> l2 = Arrays.asList("miquel","montse","carlos");
//	
//	map.put(Boolean.TRUE, l1);
//	map.put(Boolean.FALSE, l2);
	
	
	//
	// /*
	// * Un mapa es similar a un diccionario, puede asociar parejas
	// * no funciona con primitivos, solo con clases
	// * tampoco se instancia ( new map<>() ) se realiza con hashMap
	// */
	//
	// Map<Long, String> map = new HashMap<>();
	//
	// // añadir se utiliza el put
	//
	// map.put(625346L, "pepe");
	// map.put(625345L, "martina");
	// map.put(625344L, "tere");
	// map.put(625343L, "joan");
	//
	//
	// System.out.println(map.get(625342L)); // Si no existe, retorna null
	//
	// map.remove(625344L);
	//
	// System.out.println(map.get(625344L));
	//
	// map.remove(625344L); // No da exceptions al eliminar dos veces
	//
	// Set<Long> keys = map.keySet(); // no puede ser duplicado
	// System.out.println(keys);
	//
	// map.put(625348L, "pepe");
	//
	// Collection<String> c = map.values(); // Si que puede ser duplicado ej: dos
	// joans
	//
	// System.out.println(c);
	
	

	//// SETS
	// // Listas pueden tener duplicados
	// List<String> list = Arrays.asList("alfa", "charlie", "bravo", "alfa");
	// System.out.println(list);
	//
	// // Pasar arg null
	// List<String> list2 = new ArrayList<>(list);
	// System.out.println(list2);
	// // list2.add(null);
	// // list2.add(null);
	// System.out.println(list2);
	//
	// // Ordenar lista si hay NULL falla
	//
	// Collections.sort(list2);
	// System.out.println(list2);
	//
	// // Set no acepta duplicados
	// Set<String> set = new HashSet<>(list);
	// set.add("charlie");
	// System.out.println(set);
	//
	// // Recorrer un set
	// for(String string: set) {
	// System.out.println(string);
	// }
	//
	// set.remove("alfa");
	// set.remove("afdgfgr");
	// set.add(null);
	// System.out.println(set);

}
