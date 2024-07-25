//checks if two arrays contain the same elements.

class ArraySameElements 
{
		public static void main(String[] args) 
	{
		int[] a= {87,54,23,12,2,69,47,22,10,4};
		int[] b={11,15,44,24,58,52};
         boolean flag=false;
		int alen=a.length,blen=b.length;
		int i,j;

		for( i=0;i<alen;i++){
            for(j=0;j<blen;j++){
				  if(a[i]==b[j]){
					  flag=true;
					  break;
				  }
			}
		}
		if(flag)
		System.out.println("arrays contain  same elements");
		else
			System.out.println("arrays not contain  same elements");
		
	}
}
