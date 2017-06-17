package sort.recursion;

public class BinarySearch {

	public static void main(String[] args) {

		int[] arr= {6,4,5,2,7,3,1};
		int n=arr.length;
		Sort(arr,n);
	}
	
	static void Sort(int[] arr,int n)
	{
		int key ;
		int start=0,end=n-1,ele=8;
		
		for(int i=1 ;i<n ;i++){
			key = arr[i];
			int j=i-1;
			
			while(j>=0 && arr[j]>key)
			{	
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		Search(arr,start,end,ele);
	}

	static void Search(int[] arr,int start,int end,int ele)
	{
		if(start>end) {
			System.out.println("Element not found");
			return;
		}
		int mid= (start+end)/2;
		if(arr[mid] == ele)
		{
			System.out.println("FOund" + mid);
			return;
		}
		else if(arr[mid]>ele){
			end=mid-1;
			Search(arr,start,end,ele);
		}
		else
		{
			start=mid+1;
			Search(arr,start,end,ele);
		}
	}
}
