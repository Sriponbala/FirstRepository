package CollectionFrameWork;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeset = new java.util.TreeSet<Integer>();
		treeset.add(10);
		treeset.add(11);
		treeset.add(6);
		treeset.add(5);
		treeset.add(4);
		treeset.add(7);
		treeset.add(7);//try to add duplicate items :duplicate values not stored in set
		
		System.out.println(treeset);//order is based on their values so o/p will be [Item1, Item2, Item3, Item4, Item5, Item6]
        System.out.println("Size of treeset is : "+treeset.size());
	    
        //Iterate
       for(Integer iterator  : treeset) {
    	   System.out.print(iterator + ", ");
       }
       System.out.println();
       
       //printing the first element of  the treeset
       System.out.println((treeset).first());//.first() is a method for TreeSet cls and not for Set Interface  
       //printing the last element of  the treeset
       System.out.println((treeset).last());//.last() is a method for TreeSet cls and not for Set Interface  
       
       //isEmpty()
       boolean checkIfEmpty = treeset.isEmpty();
       System.out.println("Check if set is empyty : "+checkIfEmpty);
       
       //contains()
       boolean booleanObject2 = treeset.contains(5);
       System.out.println("treeset contains 5 : "+booleanObject2);
       
       //remove()
       treeset.remove(5);
       treeset.remove(15);//no exception or error is thrown simply this is not considered while manipulating the set.
       System.out.println("After removing 5 : "+treeset );
       
       //removeAll()
    //   treeset.removeAll(treeset);
    //   System.out.println("After removing all elements in treeset: "+treeset);
       
       treeset.add(1);
       System.out.println("treeset : "+treeset);
       
       System.out.println("ceiling() - "+treeset.ceiling(11));
       System.out.println("floor() - "+treeset.floor(11));
       System.out.println("Reverse order of treeset : "+treeset.descendingSet());
       System.out.println("First element : "+treeset.first());
       System.out.println("Last element : "+treeset.last());
       System.out.println("Higher element of 10 : "+treeset.higher(10));
       System.out.println("Lower element of 10 : "+treeset.lower(10));
       System.out.println("pollFirst() - "+treeset.pollFirst());
       System.out.println("pollLast() - "+treeset.pollLast());
       System.out.println("headset  - "+treeset.headSet(7)); // excludes 7
       System.out.println("headset(highendpoint,boolean inclusive) - "+treeset.headSet(7, true)); //includes 7
       System.out.println("treeset : "+treeset);
       System.out.println("subset() : "+treeset.subSet(4 , 6)); // implicitly the starting element is added 
       System.out.println("subset() inclusion or exclusion of start and end elements : "+treeset.subSet(4, false ,6 , true)); //4 is not added but 6 is added
       System.out.println("tailset() : "+treeset.tailSet(6));
       System.out.println("tailset() inclusive of lowerendpoint: "+treeset.tailSet(6, true));
       
       //clear()
       treeset.clear();
       System.out.println("After clearing treeset : "+treeset);
       
       //isEmpty after clear      
       boolean checkIfEmpty1 = treeset.isEmpty();
       System.out.println("Check if set is empty after clearing : "+checkIfEmpty1);
	}

}
