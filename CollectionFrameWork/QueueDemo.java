package CollectionFrameWork;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo 
{

	public static void main(String[] args)
	{
		Queue<Integer> queue1, queue2, queue3, queue4;
		queue1 = new PriorityQueue<>();
		
		queue1.add(1);
		queue1.add(2);
		queue1.add(3);
		
		queue2 = new PriorityQueue<>();

		queue2.addAll(queue1);
		
		System.out.println("Queue1 : "+queue1);
		System.out.println("Queue2 : "+queue2);
		
		System.out.println(queue1.offer(5));
		System.out.println("Queue1 : "+queue1);
		
		System.out.println("retaining All from queue2 in 1 ? "+queue1.retainAll(queue2));
		System.out.println("Queue1 : "+queue1);
		System.out.println("retaining All from queue1 in 2 ? "+queue2.retainAll(queue1));
		System.out.println("Queue2 : "+queue2);
		
		System.out.println(queue1.add(4));
		System.out.println("Queue1 : "+queue1);
		
		System.out.println("poll() : "+queue1.poll());//returns the head of queue1
		System.out.println("Queue1 : "+queue1);
		System.out.println("peek() with queue1 : "+queue1.peek());
	
		
		queue3 = new PriorityQueue<>();
		System.out.println("isEmpty with queue3 : "+queue3.isEmpty());
//		System.out.println("remove() removes head of queue : "+queue3.remove()); //NoSuchElementException occurs since queue3 is empty
		System.out.println("poll() : "+queue3.poll());//returns null since queue3 is empty
		System.out.println("peek() with queue1 : "+queue3.peek());// returns null since queue3 is empty
//		System.out.println("element() sees head of queue : "+queue3.element());//NoSuchElementException occurs since queue3 is empty
		
		queue4 = new LinkedList<>();
		queue4.addAll(queue2);
		System.out.println("Queue4 : "+queue4);
		
		System.out.println("remove() removes head of queue : "+queue4.remove());//FIFO
		System.out.println("Queue4 : "+queue4);
		
		System.out.println("remove(obj) removes that obj of queue : "+queue4.remove(2));
		System.out.println("Queue4 : "+queue4);
		
		System.out.println("element() sees head of queue : "+queue4.element());
		System.out.println("Queue4 : "+queue4);
		
		queue1.clear();
		System.out.println("Queue1 : "+queue1);
		
		
		Iterator iterator = queue2.iterator();
		 
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
				
	}

}
