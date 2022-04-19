package CollectionFrameWork;

import java.util.*;

public class QuizResults{
    public static void main(String args[])
    {
    	
    	Scanner scan = new Scanner(System.in);
    	
    	String name , id = "" ;
    	int score ;
    	
    	HashMap<String,String> studentDetails = new HashMap<>();
        HashMap<String,Integer> map = new HashMap<>();
    	
    	for(int i = 0 ; i < 3 ; i++)
    	{
    		System.out.println("Id : ");//enter the ID number 
    	    
    		id = scan.nextLine();
    		
    		System.out.println("Name : ");//enter the name
    		name = scan.nextLine();
    		
    		studentDetails.put(id,name);// add id and name in map
    		
    		System.out.println("Score : ");//enter the score
    		score = scan.nextInt();
    		scan.nextLine();
    		
    		map.put(id, score);//add id and score in map
    	}
    	System.out.println("studentDetails map :"+studentDetails);
    	System.out.println("map : "+map);
    	 
        //add the scores in treeset so that sorting can be done implicitly
        TreeSet<Integer> tree = new TreeSet<>();
        for(String str : map.keySet())
        {
             tree.add(map.get(str));
        }
        System.out.println("Map :"+map);
        System.out.println("Tree :"+tree);
        
        System.out.println("Highest score : "+tree.last()); //the last value of treeset is the highest score
        
        //iterate through the map and find the Id numbers who have secured the top score  and their name from studentDetails hashmap
        for(Map.Entry<String,Integer> entry : map.entrySet())
        {
            if(entry.getValue()==tree.last())
            {
                System.out.println("Participant name : "+studentDetails.get(entry.getKey())+" ID : "+entry.getKey()+" has obtained the score of "+entry.getValue());
            }
        }
        
    }
}