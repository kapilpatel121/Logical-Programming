//Palindrom number
import java.util.*;
class PalindromNumber{
    public static void main(String[] args){
     int n=1223;   
     int rem=0,rev=0,temp=n;
     
    while(n!=0){
        rem=n%10;
        rev =(rev*10)+rem;
        
        n/=10;
    }
    if(temp==rev){
        System.out.println("Given number is Palindrom");
    }else{
         System.out.println("Given number is not Palindrom");
    }
}
}
