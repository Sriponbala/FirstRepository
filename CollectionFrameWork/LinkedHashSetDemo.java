package CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		
		Set<String> linkedhashset = new LinkedHashSet<>();
		linkedhashset.add("Item1");
        linkedhashset.add("Item3");
        linkedhashset.add("Item2");
        linkedhashset.add("Item5");
        linkedhashset.add("Item6");
        linkedhashset.add("Item6");
        //adding duplicate item 
        linkedhashset.add("Item1");//this will not be stored in the Linkedhashset as per definition of set
        
        //print linkedhashset
        System.out.println(linkedhashset);//order of inserrtion is maintained
	    
        //iterate
        for(String str : linkedhashset) {
        	System.out.print(str + " ");
        }
        System.out.println();
        
        System.out.println("Size of LinkedHashset is : "+linkedhashset.size());
        System.out.println("Check if set is empyty : "+linkedhashset.isEmpty());
        System.out.println("lhset contains item1 : "+linkedhashset.contains("Item1"));
        System.out.println("After removing \"Item1\" : "+linkedhashset.remove("Item1"));
        System.out.println(linkedhashset);
        
        //Iterate using iterator
        System.out.println("Using Iterator");
        Iterator<String> itrs = linkedhashset.iterator();
        while(itrs.hasNext()) {
        	System.out.print(itrs.next()+" ");
        }
        System.out.println();
	   
	}

}
