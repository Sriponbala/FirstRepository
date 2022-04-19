package CollectionFrameWork;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class TreeMap_LinkedHashMapDemo {

	public static void main(String[] args) {
		
		System.out.println("TreeMap  : ");
		TreeMap<Integer,String> treemap = new TreeMap<>();
        treemap.put(1,"Sri");
        treemap.put(3, null);
        treemap.put(0,"Bala");
        treemap.put(2,"Sri");
        System.out.println(treemap);//maintains ascending order
        
        treemap.put(3, "Ram");// overrides the value of key 2
        System.out.println(treemap);
        
        for(Integer key : treemap.keySet())
        {
        	System.out.println("Key : "+key+"  value : "+treemap.get(key)+"   ceilingEntry() : "+treemap.ceilingEntry(key)+"  ceilingKey() : "+treemap.ceilingKey(key));
        }
        
        System.out.println("size() : "+treemap.size());
        System.out.println(treemap.containsKey(0));;
        System.out.println(treemap.containsValue("Bala"));
        System.out.println(treemap.containsValue(null));
        System.out.println(treemap.descendingKeySet());
        System.out.println(treemap.descendingMap());
        System.out.println(treemap.firstEntry());
        System.out.println(treemap.firstKey());
        System.out.println(treemap.floorEntry(3));
        System.out.println(treemap.floorKey(0));
        System.out.println(treemap.getOrDefault(0, null));
        System.out.println(treemap.hashCode());
        System.out.println(treemap.headMap(1));
        System.out.println("headMap() : t"+treemap.headMap(1, true));
        System.out.println(treemap.headMap(1, true));
        System.out.println(treemap.higherEntry(1));
        System.out.println(treemap.higherKey(1));
        System.out.println(treemap.isEmpty());
        System.out.println(treemap.lastEntry());
        System.out.println(treemap.lastKey());
        System.out.println(treemap.lowerEntry(2));
        System.out.println(treemap.lowerKey(2));
        System.out.println(treemap.navigableKeySet());
        System.out.println(treemap.replace(0, null)+" "+treemap);
        System.out.println(treemap.putIfAbsent(0, "Bala"));
        System.out.println(treemap.putIfAbsent(5, "Bala"));
        System.out.println(treemap);
        System.out.println(treemap.pollFirstEntry());
        System.out.println(treemap);
        System.out.println(treemap.pollLastEntry());
        System.out.println(treemap);
        System.out.println(treemap.subMap(1, 2));
        System.out.println(treemap.subMap(1, true, 2, true));
        System.out.println(treemap);
        System.out.println(treemap.tailMap(1));
        System.out.println(treemap.tailMap(2, true));
        System.out.println();
        
        
        System.out.println("LinkedHashMap  : ");
        LinkedHashMap<Integer,Integer> linkedhashmap = new LinkedHashMap<>();
		linkedhashmap.put(1,1);
		linkedhashmap.put(2, 2);
		System.out.println(linkedhashmap.values());
        
	}

}
