package Exercise;

import java.util.Arrays;

public class PermutaationOfString {

	public static void main(String[] args) {
		final int[] arr={1,2};
		//int[] qrr;
		for(int i=0;i<arr.length;i++)
		{
			int key=arr[i];
			for(int j=0;j<arr.length;j++)
			{
				int[] qrr =  Arrays.copyOf(arr, arr.length);
				int temp=qrr[j];
				qrr[j]=key;
				qrr[i]=temp;
				
				
				for(int k=i+1;k<arr.length;k++)
				{
					
					int[] srr=Arrays.copyOf(qrr,qrr.length);
					int key1=qrr[i+1];
					int temp1=srr[k];
					srr[k]=key1;
					srr[i+1]=temp1;
					for(Integer u : srr)
					{
						System.out.print(u + " ");
					}
					System.out.println(" ");
				}
			}
			System.out.println(" ");
		}
	}

}
