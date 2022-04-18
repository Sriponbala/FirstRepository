package CollectionFrameWork;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Book
{
      String book_name , id ;
      Book(String book_name, String id)
      {
    	  this.book_name = book_name;
    	  this.id = id;
      }
      
}

public class MapDemo {

	public static void hashMap()
	{
		HashMap<String, Integer> hashmap = new HashMap<>();
		hashmap.put("Apple", 2);
		hashmap.put("Orange",3);
		hashmap.put("Banana", 1);
		hashmap.put("Mango", 2);
		hashmap.put(null, null);
		System.out.println(hashmap);
		
		//iterate
		System.out.println("\nKey - Value :");
		for(Map.Entry<String, Integer> map : hashmap.entrySet())
		{
			System.out.println("   "+map.getKey()+" - "+map.getValue());
		}
		// Using keySet()
		System.out.println("\nKey set :");                
		for(String key : hashmap.keySet())
		{
			System.out.println("   "+key);
		}
        // get()
        System.out.println("\nget() -  "+hashmap.get("Apple"));	
        // replace(K,V)
        System.out.println("returns the previous value associated with Apple : "+hashmap.replace("Apple", 5)+"\n"); 
        System.out.println(hashmap);
        
	}
	
	public static void main(String[] args) {
		
		 HashMap<Integer,Book> hashmap1 = new HashMap<>();
		 
		 //creating books
		 Book book1 = new Book("Biology","B1");
		 Book book2 = new Book("Maths","M1");
		 
		 //adding books in hashmap
		 hashmap1.put(1, book1);
		 hashmap1.put(2, book2);
		 
		 for(Map.Entry<Integer, Book> map : hashmap1.entrySet())
		 {
			 System.out.println(map.getKey()+") Details :");
			 System.out.println(map.getValue().book_name+" , "+map.getValue().id+"\n");
		 }
		
		 System.out.println();
	     hashMap();

	}

}
