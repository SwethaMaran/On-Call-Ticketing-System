package sort.array;

public class CollatzConjecture {

	public static void main(String[] args) {
		int k=12;
		while(k!=1)
		{
			if(k%2==0)
			{
				k=k/2;
			}
			else
				k=k*3 +1;
			System.out.print(k+" ");
		}
	}

}
