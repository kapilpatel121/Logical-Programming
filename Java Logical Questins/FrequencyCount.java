//checks if two arrays contain the same elements.
import java.util.*;
class FrequencyCount{
   public static void main(String[] args) 
	{

	String str1 = "abcdABCDabcd";
	char[] arr=str1.toCharArray();
	int len=arr.length;
	int count=0;
	char c;
	Map<Character,Integer> map=new HashMap<>();
	
	for(int i=0;i<len;i++){
	    count=0;
	    c=arr[i];
	    if(c==' ' || map.containsKey(c))
	    continue;
	    else{
	        
	        for(int j=0;j<len;j++){
	            if(c==str1.charAt(j))
	            count++;
	        }
	    }
	    map.put(c,count);
	}
System.out.println(map);
    }
}