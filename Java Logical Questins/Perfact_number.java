class Perfact_number 
{
		int num=28;
		int sum=1;
		for(int i=2;i<num;i++){
           if(num%i==0){
			   sum=sum+i;
		   }
		}
        System.out.println(sum==num?"perfect":"Not perfect");
	}
}
