package sort.array;
public class BinaryString {

	public static void main(String[] args) {
			int k=3;
			int[] arr={0,0,0};
			int total=(int)(Math.pow(2, k)-1);
			for(int f=0;f<=total;f++)
			{
				int i=f;
				int j=k-1;
				int div=0;
				while(i!=1 && f!=0)
				{
					div=i/2;
					arr[j]=i%2;
					i=div;
					j--;
				}
				arr[j]=i;
				for(Integer a : arr)
				{
					System.out.print(a);
				}
				System.out.println(" ");
			}
	}

}
