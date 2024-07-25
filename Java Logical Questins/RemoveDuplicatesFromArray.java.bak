class RemoveDuplicatesFromArray 
{
   	public static void main(String[] args) 
	{
		int[] arr= {10,20,30,30,20,20,40,50,40,60};
		int temp,count=0;
		int len=arr.length;

           for(int i=0;i<len-1;i++){
                 for(int j=1;j<len;j++){
                     if(i==j)
                     continue;
                      if(arr[i]==arr[j]){

                          for(int k=j;k<len-1;k++){
							  arr[k]=arr[k+1];
					  }
                         len--;
					  }
				 }
		
	}
	for(int i=0;i<len;i++)
	System.out.print(arr[i]+" ");
	}
}
