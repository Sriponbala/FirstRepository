package CollectionFrameWork;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//Set<String> hashObj = new HashSet<>(); : creating obj of a class and referring it to the reference var of type interface 
		HashSet<String> hashset = new HashSet<>();
        hashset.add("Item1");
        hashset.add("Item2");
        hashset.add("Item3");
        hashset.add("Item4");
        hashset.add("Item5");
        hashset.add("Item6");
        //adding duplicate items to hashset
        hashset.add("Item1");//this will not be stored in the hashset since duplicates are not allowed
        
        System.out.println(hashset);//order of insertion is not sure in hashset
        
        //iterate
        for(String str : hashset) {
        	System.out.print(str + " ");
        }
        System.out.println();
        
        //Manipulations on hashsets
        HashSet<String> new_set = new HashSet<>();
        System.out.println(new_set);//o/p : [] - empty set
        new_set.add("Item3");
        new_set.add("Item7");
      
        HashSet<String> union = new HashSet<>(hashset);//copy all items of hashset set to this union set
        System.out.println("Set 1 : "+union);
        System.out.println("Set 2 : "+new_set);
        
        ////union on hashset
        union.addAll(new_set);
        System.out.println("Union operation on set 1 and 2 : "+union);
        
        //intersection on hashset
        HashSet<String> intersection = new HashSet<>(hashset);//copy all items of hashset set to this intersection set
        intersection.retainAll(new_set);
        System.out.println("Intersection operation on set 1 and 2 : "+intersection);
	
        //difference operation on hashset
        HashSet<String> difference = new HashSet<>(hashset);//copy all items of hashset set to this difference set
	    difference.removeAll(new_set);
	    System.out.println("Difference operation on hashset : "+difference);

	    Set<Integer> set1 = new HashSet<>();
	    set1.add(1);
	    set1.add(2);
	    set1.add(3);
	    set1.add(4);
	    set1.add(5);
	    System.out.println("Set1 : "+set1);
	    
	    Set<Integer> set2 = new HashSet<Integer>();
	    set2.add(1);
	    set2.add(2);
	    System.out.println("Set2 : "+set2);
	    
	    //contains function
	    boolean object = set1.contains(4);
	    System.out.println("Set1 contains 4 : "+object);
	    
	    //containsAll function
	    boolean newObject = set1.containsAll(set2);
	    System.out.println("Set1 containsAll elements of set2 : "+newObject);
	    
	    //clear function
	    set2.clear();
	    System.out.println("After clearing set2 : "+set2);
	}

}
