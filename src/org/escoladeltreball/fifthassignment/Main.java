package org.escoladeltreball.fifthassignment;


public class Main {
	private enum WeekEndType {
		dissabte,diumenge;
	}

	public static void main(String[] args) throws Exception {
		WeekEndType type = WeekEndType.valueOf("dissabte");
		System.out.println(type);
		
		DeviceManagerImpl manager = new DeviceManagerImpl("devices");
		
		System.out.println(manager.getMapByType());
		
		System.out.println(manager.getSortedList(new DevicePriceComparator()));

		System.out.println(manager.findCheapestDeviceOfEachType());
	}

}



//List<String> list = Arrays.asList("alpha","charlie","bravo","alpha");
//List<String> list2 = new ArrayList<>(list);
//list2.add(null);
//list2.add(null);
//Collections.sort(list2);
//System.out.println(list);
//System.out.println(list2);
//// No podemos tener elementos repetidos.
//Set<String> set = new HashSet<>(list);
//set.add("charlie");
//System.out.println(set);
//System.out.println(set.size());
//set.remove("alpha");
//for (String string : set) {
//	System.out.println(string);
//}







//Map<Long, String> map = new HashMap<>();
//map.put(625346L, "lacerda");
//map.put(986487L, "filipa");
//map.put(789541L, "alecai");
//map.put(965487L, "lacerda");
//System.out.println(map.get(625346L));
////map.remove(625346L);
//System.out.println(map.get(625346L));
//// Las keys no pueden estar duplicadas.
//Set<Long> keys = map.keySet();
//System.out.println(keys);
//// Los valores asociados a clases pueden ser duplicados.
//Collection<String> c = map.values();
//System.out.println(c);



//Map<Boolean, List<String>> map2 = new HashMap<>();
//List<String> l1 = Arrays.asList("ana","joan","marta");
//List<String> l2 = Arrays.asList("carlos","montse","miquel");
//map2.put(Boolean.TRUE, l1);
//map2.put(Boolean.FALSE, l2);