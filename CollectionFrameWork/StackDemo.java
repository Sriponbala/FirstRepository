package CollectionFrameWork;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<>();
        String name = "Sriponbala.K";
        
        for(int i = 0 ; i < name.length() ; i++)
        {
        	stack.push(String.valueOf(name.charAt(i)));
        }
        System.out.println("Name : "+stack.toString());
        
        System.out.println("Initial : "+stack.peek());
        System.out.println("Position of \".\" : " +stack.search("."));
        
        String myName = "";
        for(int i = 0 ; i < name.length() ; i++)
        {
        	stack.pop();
        }
        
	}

}
