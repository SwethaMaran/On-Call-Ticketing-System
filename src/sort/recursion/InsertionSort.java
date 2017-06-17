package sort.recursion;

public class InsertionSort {

	public static void main(String[] args) {
		int[] arr={6,4,5,2};
		int n=arr.length;
		recursion(arr,n);
	}
	
	static void recursion(int[] arr,int n)
	{
		if(n<=1)
			return;
		recursion(arr,n-1);
		//System.out.println(n);
		int key = arr[n-1];
		System.out.println(key);
		int j = n-2;
		while(j>=0 && arr[j]>key)
		{	
			System.out.println("index : " + j + "  " + arr[j+1]+ "  " + arr[j]);
			arr[j+1]=arr[j];
			j--;
		}
		arr[j+1]=key;
		
	}
	 
	//fun(arr,4)  -> fun(arr,3
	//fun(arr,3)  -> 2

 	
}
