package sort.recursion;

public class CollatzConjecture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k=12;
		recursion(k);
	}
	static void recursion(int k)
	{
		while(k==1)
			return;
		if(k%2!=0)
		{
			k=k*3 +1;
			System.out.print(k + " ");
			recursion(k);
		}
		else
		{
			k=k/2;
			System.out.print(k+ " ");
			recursion(k);
		}
	}

}
