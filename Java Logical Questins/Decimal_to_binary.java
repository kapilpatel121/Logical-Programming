//Decimal to binary
import java.util.*;
class Decimal_to_binary{
    public static void main(String[] args){
        int num=5;
        
        List<Integer> list=new ArrayList<>();
          while(num!=0){
            list.add(num%2);
            num/=2;
          }
        
        System.out.println(list);
    }
}