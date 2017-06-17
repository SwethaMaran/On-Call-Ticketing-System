package sort.recursion;

public class BinaryString {


	public static void main(String[] args) {
		int k=8;
		int[] arr= {0,0,0,0,0,0,0,0};
		int base=2;
		int total=(int) (Math.pow(base,arr.length)-1);
		System.out.println("asdf " + total);
		BinaryString(arr,base, total);		
	}
	static void BinaryString(int[] arr,int base ,int total)
	{	
		if(total == 0)
			return;
		else {
			
			BinaryString(arr, base, total-1);
			loop(total,arr.length);
		}
		
	}
	
	static void loop(int total, int n)
	{
		if(n==0) {
			System.out.println("");
			return ;
		}
		else
		{
			loop(total/2,n-1);
			System.out.print(total % 2);
		}
	}
}
