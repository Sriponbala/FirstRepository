package CollectionFrameWork;

import java.util.Scanner;
import java.util.Vector;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;


class TypesOfLists {
	
	public void arrayListDemo(ArrayList<Integer> arraylist) 
	{
		System.out.println("-----------------------ArrayList and its methods-------------------------");
		System.out.println("The elements of ArrayList1 are : "+arraylist);
		if(arraylist.contains(2))
		{
			System.out.println("contains()  -  Element '2' is present in ArrayList");
		}
		ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
		arraylist2.add(1); 
		arraylist2.add(2);
		arraylist2.add(3);
		String value = arraylist.equals(arraylist2) ? "Both arraylists are equal" : "Both arraylists are not equal";
		System.out.println("The index of last occurrence of an element is found using lastIndexOf() - "+arraylist.lastIndexOf(1));
		System.out.println("subList()  -  "+arraylist.subList(0, 0).toString()); //empty sublist
		System.out.println("equals()  -  "+value);
		System.out.println("isEmpty()  -  "+arraylist.isEmpty());
		System.out.println("size()  -  "+arraylist.size());
		System.out.println("toString()  -  "+arraylist.toString());
		arraylist.remove(0);
		System.out.println("arraylist1 after changes -   "+arraylist);
		System.out.println("remove()  -  "+arraylist.remove(0));
		System.out.println("retainAll()  -  "+arraylist.retainAll(arraylist2));
		System.out.println(arraylist.toString());
		System.out.println("removeAll(Collection c)  returns true if elements are removed  -  "+arraylist.removeAll(arraylist2));
		arraylist2.clear();
		System.out.println("arraylist2 clear()  -  "+arraylist2);
        ArrayList<Boolean> arraylist3 = new ArrayList<>();
        arraylist3.add(0, true);
        arraylist3.add(true);
        arraylist3.add(false);
        arraylist3.set(0, false);
        System.out.println(arraylist3);
        System.out.println("get() - "+arraylist3.get(0));
    	System.out.println("-------------------------------------------------------------------------");
	}
	
	public void linkedListDemo(List<String> linkedlist)
	{
		System.out.println("-----------------------LinkedList and its methods-------------------------");
		System.out.println("The elements of LinkedList1 are : "+linkedlist);
		if(linkedlist.contains("2"))
		{
			System.out.println("contains()  -  Element '2' is present in LinkedList");
		}
		LinkedList<String> linkedlist2 = new LinkedList<String>();
		linkedlist2.add("Hi"); 
		linkedlist2.add("Sri");
		linkedlist2.add("!");
		linkedlist2.addFirst("First node");
		linkedlist2.addLast("Last node");
		linkedlist2.add(3, "index3");
		System.out.println(linkedlist2);
		linkedlist2.offer(null);
		linkedlist2.offerFirst(null);
		linkedlist2.offerLast("OfferLast");
		System.out.println(linkedlist2);
		System.out.println("peek() - "+linkedlist2.peek());
		System.out.println("peekFirst() - "+linkedlist2.peekFirst());
		System.out.println("peekLast() - "+linkedlist2.peekLast());
		linkedlist2.poll();
		System.out.println(linkedlist2);
		linkedlist2.pollFirst();
		System.out.println(linkedlist2);
		linkedlist2.pollLast();
		linkedlist2.set(2, null); // Changing the value at index 2 from "!" to null
		System.out.println(linkedlist2);
		System.out.println("pop()  -  "+linkedlist2.pop());
		System.out.println("get() element at index 1 of linkedlist2 - "+linkedlist2.get(1));
		System.out.println("getFirst() element from linkedlist2 - "+linkedlist2.getFirst());
		System.out.println("getLast() element from linkedlist2 - "+linkedlist2.getLast());
		String value = linkedlist.equals(linkedlist2) ? "Both linkedlists are equal" : "Both linkedlists are not equal";
		System.out.println("equals()  -  "+value);
		System.out.println("isEmpty()  -  "+linkedlist.isEmpty());
		System.out.println("size()  -  "+linkedlist.size());
		System.out.println("toString()  -  "+linkedlist.toString());
		linkedlist.remove(0);
		System.out.println("remove(index)  -  "+linkedlist);
		System.out.println("removeAll(Collection c)  returns true if elements are removed  -  "+linkedlist.removeAll(linkedlist2));
		System.out.println("LinkedList1 after changes -   "+linkedlist);
		linkedlist2.clear();
		System.out.println("Linkedlist2 clear()  -  "+linkedlist2);
		System.out.println("-------------------------------------------------------------------------");
	}
	
	public void vectorDemo(Vector<Float> vector1)
	{
		System.out.println("-----------------------Vector and its methods-------------------------");
		System.out.println("Vector1  -  "+vector1);
		vector1.add(10f);
		vector1.add(vector1.size()-1,100f);
		System.out.println("Vector1  -  "+vector1);
		Vector<Float> vector2 = new Vector<>();
		vector2.add(1f);
		vector2.add(2f);
		vector2.addElement(1000f);
		vector2.addAll(vector1);
		System.out.println("Vector2  -  "+vector2);
		vector2.addAll(2,vector1);
		System.out.println("Vector2  -  "+vector2);
		System.out.println("current capacity() of vector1 - "+vector1.capacity());
		System.out.println("vector1 contains 1f ? "+vector1.contains(1f));
		System.out.println("vector1 containsAll() vector2 ? "+vector1.containsAll(vector2));
		Float array[] = new Float[vector2.size()];
		vector2.copyInto(array);
		System.out.println(Arrays.toString(array));
		Collections.sort(vector2);
		System.out.println("vector2 after sorting : "+vector2);
		System.out.println("elementAt() - "+vector2.elementAt(0));
		System.out.println("get() - "+vector2.get(0));
		System.out.println("vector2 : "+vector2);
		vector2.insertElementAt(0f, 1); //insertElementAt(Float obj , int index)
		vector2.add(50f);
		System.out.println("vector2 : "+vector2);
		System.out.println("Last element of vector2 is "+vector2.lastElement());
		System.out.println("sublist from vector2 is "+vector2.subList(0, 2));
		vector2.setSize(4);
		System.out.println("vector2 : "+vector2);
		vector1.set(0,  1f);
		vector1.setElementAt(2f, 1);
		System.out.println("Vector1 : "+vector1);
	    System.out.println(vector1.removeAll(vector2));
	    System.out.println("-------------------------------------------------------------------------");
	}
		
}
public class Lists {

	public static void main(String[] args) {
	   
	   int i , element;
	   String value;
	   float vector1_element;
//	   Float element = new Float();
       Scanner scan = new Scanner(System.in);
       TypesOfLists listtypes = new TypesOfLists();
   
       // ARRAYLIST
       System.out.println("Enter the 3 arraylist elements : ");
       ArrayList<Integer> arraylist = new ArrayList<>();
       for(i = 0 ; i < 3 ; i++)
       {
    	   element = scan.nextInt();
    	   arraylist.add(element);
       } 
       arraylist.add(0,24);
       arraylist.add(2, null);
       arraylist.add(arraylist.size(), 50);
       System.out.println(arraylist);
       listtypes.arrayListDemo(arraylist);
      
       // LINKEDLIST
       scan.nextLine();
       System.out.println("Enter the 3 linkedlist elements : ");
       LinkedList<String> linkedlist = new LinkedList<>();
       for(i = 0 ; i < 3 ; i++)
       {
    	   value = scan.nextLine();
    	   linkedlist.add(value);
       }
       listtypes.linkedListDemo(linkedlist);
     
       // VECTOR 
       Vector<Float> vector1 = new Vector<>();
       System.out.println("Enter the 3 vector1 elements : ");
       for(i = 0 ; i < 3 ; i++)
       {
    	   vector1_element = scan.nextFloat();
    	   vector1.add(vector1_element);
       }
       listtypes.vectorDemo(vector1);
    }

}
