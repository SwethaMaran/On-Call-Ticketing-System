package sort.array;


public class BinarySearch {
	public static void main(String[] args) {
		
		int[] arr= {6,4,5,2,7,3,1};
		int n=arr.length;
		Sort(arr,n);
		int ele=7;
		Search(arr,ele);
		
	}
	
	static void Sort(int[] arr,int n)
	{
		int key ;
		
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
	}
	
	static void Search(int[] arr,int ele)
	{
		int start=0,end=arr.length-1,mid=end/2;
		while(start<=end)
		{
			if(arr[mid] == ele) {
				System.out.println("I caught you");
				break;
			}
			else if(arr[mid]<ele)
			{
				start=mid+1;
				mid=(end+start)/2;
			}
			else 
			{
				end=mid-1;
				mid=(end+start)/2;
			}
		}
		
		
		
	}

}
