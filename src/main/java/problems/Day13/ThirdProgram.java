package problems.Day13;/* Count of Identical pairs */

import java.util.*; 

public class ThirdProgram { 

	public static void main(String[] args) { 
		ThirdProgram third = new ThirdProgram();
		int arrayOfElements[] = { 1,1,2,2,4,5,1}; 
		System.out.println(third.countIdenticalPairs(arrayOfElements,arrayOfElements.length)); 
	}
	
	public int countIdenticalPairs(int arrayOfElements[], int lengthOfArray) { 
		int countOfPairs=0; 
		HashMap<Integer,Integer> map = new HashMap<>(); 
		
		for(int i = 0; i < lengthOfArray; i++) {
			if (map.containsKey(arrayOfElements[i])) 
				map.put(arrayOfElements[i],map.get(arrayOfElements[i]) + 1); 
			else
				map.put(arrayOfElements[i], 1); 
		} 
		
		for(Map.Entry<Integer,Integer> it : map.entrySet()) { 
			int mapVal = it.getValue(); 
			countOfPairs += (mapVal * (mapVal - 1)) / 2; 
		} 
		
		return countOfPairs; 
	}
}
