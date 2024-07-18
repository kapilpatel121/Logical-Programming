import java.util.*;

class Program01 
{
	public static void main(String[] args) 
	{
		System.out.println(findSub(10));
	}

	public static List<Integer> findBinary(int num){
		List<Integer> list = new ArrayList<>();
		while(num > 0){
			list.add(num % 2);
			num = num / 2;
		}
		Collections.reverse(list); // Reverse to get the correct order
		return list;
	}

	public static int findSub(int num){

		List<Integer> binary=findBinary(num);
         int sum=0;
		for(int i=0;i<binary.size();i++){
			sum+=binary.get(i);
		 } 
		 int ans=num-sum;
		 return ans;
	}

}
