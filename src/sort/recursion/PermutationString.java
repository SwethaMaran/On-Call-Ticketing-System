package sort.recursion;

public class PermutationString {

	public static void main(String[] args) {
			int[] arr={1,2,3};
			int[] count={1,1,1};
			int level=0;
			int[] result ={0,0,0};
			permute(arr,count,result,level);	
	}
	
	static void permute(int[] arr,int[] count,int[] result,int level)
	{
		if(level==arr.length)
		{
			for(Integer a :arr)
			{
				System.out.print(a);
			}
			System.out.println(" ");
			return;
			
		}
		for(int i=0;i<arr.length;i++)
		{
			if(count[i]==0)
				continue;
		
			result[level]=arr[i];
			count[i]--;
			permute(arr,count,result,level+1);
			count[i]++;
		
		}	
	}
}
	
	
	
	
	
	
	
	








/*static void Permute(int[] arr, int i,int l)
	{
		if( i == l) {
			for(int a : arr) {
				System.out.print(a + " " );
			}
			System.out.println("");
		}
		else{
			
			Permute(arr, i+1, l);
			swap(arr,i,l);
			Permute(arr, i+1, l);
		}
	}
	static void swap(int[] arr,int i, int l)
	{
		int temp=arr[i];
		arr[i]=arr[l];
		arr[l]=temp;
	}
*/

