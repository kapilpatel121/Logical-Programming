//Reverse an Array
import java.util.*;
class ReverseArr{
    public static void main(String[] args){
     int[] arr = {10,20,30,40,50,60,70,80,90,100};
        int len=arr.length;
         int temp;
         for(int i=0;i<len/2;i++){
             temp=arr[i];
             arr[i]=arr[len-1-i];
             arr[len-1-i]=temp;
         }
         for(int num:arr)
     System.out.print(num+"  ");
    } 
}