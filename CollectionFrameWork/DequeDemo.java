package CollectionFrameWork;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;


public class DequeDemo
{

	public static void main(String[] args) 
	{
		
         Deque<Integer> deque = new ArrayDeque<>();
         deque.addFirst(1);
         deque.addLast(5);
         deque.add(2);//append to the queue
         System.out.println("Deque : "+deque);
         
         System.out.println(deque.getFirst());
         System.out.println(deque.getLast());
         System.out.println(deque.offerFirst(0));
         System.out.println(deque.offerLast(0));
         System.out.println("Deque : "+deque);
         
         System.out.println(deque.removeFirstOccurrence(0));
         System.out.println("Deque : "+deque);
         
         deque.add(0);
         System.out.println("Deque : "+deque);
         
         System.out.println(deque.removeLastOccurrence(0));
         System.out.println("Deque : "+deque);
         
         //descending iterator
         Iterator descendingIterator = deque.descendingIterator();	 
         while (descendingIterator.hasNext()) {
             System.out.print(descendingIterator.next() + " ");
         }
         System.out.println();
         
         //ascending iterator
         Iterator ascendingIterator = deque.iterator();
         while (ascendingIterator.hasNext()) {
             System.out.print(ascendingIterator.next() + " ");
         }
         System.out.println();
         
         System.out.println(deque.peekFirst());
         System.out.println(deque.peekLast());
         System.out.println(deque.peek());
         
         System.out.println(deque.pop());//same as removeFirst
         System.out.println("Deque : "+deque);
         
         System.out.println(deque.removeLast());
         System.out.println("Deque : "+deque);
         
	}

}
