//Armstrong number
import java.util.*;
class ArmstrongNumber{
    public static void main(String[] args){
     int n=371;   
      int digCount=0,rem=0;
      int temp=n,ans=0;
      
      while(n!=0){
          digCount++;
          n/=10;
      }
      n=temp;
      for(int i=0;i<digCount;i++){
          rem=n%10;
          ans+=Math.pow(rem,digCount);
          n/=10;
      }
      if(ans==temp){
          System.out.println(" Armstrong");
      }else{
          System.out.println(" Not Armstrong");  
      }
}
}
