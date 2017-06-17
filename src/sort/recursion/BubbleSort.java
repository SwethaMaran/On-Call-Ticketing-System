package sort.recursion;

public class BubbleSort {
	public static void main(String[] args) {
			
		int arr[]={5,1,4,2,8};
		int n=arr.length;
		Sort(arr,n);	
	}
	static void Sort(int[] arr, int n)
	{
		if(n==1)
			return;
		Sort(arr,n-1);
		for(int i=0;i<n;i++)
		{
			if(i!=n-1)
			{
				if(arr[i]>arr[i+1])
				{
					int temp=arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
				}
				else 
					continue;
			}
			
		}
		for(Integer a : arr)			
			System.out.print(a);
		System.out.println("");
	}
}


