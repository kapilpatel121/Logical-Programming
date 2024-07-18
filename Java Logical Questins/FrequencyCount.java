import java.util.*;
class FrequencyCount{
    public static void main(String[] args){
        String str="my name is raja";
        int count=0;
        char[] carr=str.toCharArray();
        Map<Character ,Integer > map=new HashMap();
        for(int i=0;i<carr.length-1;i++){
            if(carr[i]== ' ' || map.containsKey(carr[i])){
                continue;
            }else{
                count=0;
                for(int j=1;j<carr.length;j++){
                    if(carr[i]==carr[j]){
                        count++;
                    }
                }
            }
            map.put(carr[i],count);
        }
        System.out.println(map);
    }
}