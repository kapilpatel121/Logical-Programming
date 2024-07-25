import java.util.Random;
class RandomizeArrayValues 
{
	public static void main(String[] args) 
	{

		int[] a= {87,54,23,12,2,69,47,22,10,4};
		Random r =new Random();
		int rnum,temp;
		int len=a.length;
		for(int i=0;i<len;i++){
		    
            rnum=r.nextInt(10);
		    if(rnum<len){
		     temp=a[i];
			 a[i]=a[rnum];
             a[rnum]=temp;
		    }
		} 
		for(int item: a)
    System.out.print(item+"  ");
    }
}
