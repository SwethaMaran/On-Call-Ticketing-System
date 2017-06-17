package sort.array;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] arr= {6,4,5,2};
		int n=arr.length;
		System.out.println(n);
		int key ;
		for(int i=1 ;i<n ;i++){
			key = arr[i];
			int j=i-1;
			/*while(j>=0 && arr[j]>key)
			{	
				System.out.println("index : " + j + "  " + arr[j+1]+ "  " + arr[j]);
				arr[j+1]=arr[j];
				j--;
			}*/

			System.out.println("index " + j);
			arr[j+1]=key;
			
		}
		for(Integer a : arr) {
			System.out.println(a);
		}

	}

}

