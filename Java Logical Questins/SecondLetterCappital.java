
import java.util.*;
class SecondLetterCappital{
    public static void main(String[] args){
        String str="my name is raja";
        int count=0;
        char[] carr=str.toCharArray();
        String[] words=str.split("\\s+");
        
        StringBuilder result =new StringBuilder();
        
        for( String word :words){
            if(word.length()>1){
                result.append(word.substring(0,1))
                .append(Character.toUpperCase(word.charAt(1)))
                .append(word.substring(2));
            }
            else {
            result.append(word);
           }
           result.append(" ");
        }
        
        System.out.println(result);
    }
}
