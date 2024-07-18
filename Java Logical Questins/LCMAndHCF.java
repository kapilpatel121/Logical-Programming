public class LCMAndHCF
{
	public static void main(String[] args) {
		
		int a=24;
		int b =6;
		int ans=-0;
		for(int i=2; i<a;i++){
		    if(a%i==0 && b%i==0){
		        ans=i;
		    }
		}
		System.out.println("HCF "+ans);
			System.out.println("lcm "+(a*b)/ans);
	}
}