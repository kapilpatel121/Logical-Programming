// sum of array elements 

class   S_Largest_ele_array {
    public static void main(String[] args) 
	{
		int[] a= {87,54,23,12,2,69,47,22,10,4};
		
		int higest=0,sHigest=0;
		for( int item:a){
             if(item > higest){
                 sHigest=higest;
                  higest=item;
			 }
			 else if(item>sHigest){
                  sHigest=item;
			 }
		}
			
		System.out.println("Second largest  ele is : "+sHigest);
	}
}
