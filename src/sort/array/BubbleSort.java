package sort.array;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr={5,1,4,2,8};
		int n=arr.length;
		int j=0;
		while(j<n)
		{
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
			j++;
		}
		
		for(Integer a : arr)			
			System.out.println(a);
	}

}
