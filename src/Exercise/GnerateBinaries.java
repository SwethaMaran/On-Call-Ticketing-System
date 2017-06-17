package Exercise;

import java.util.Scanner;

public class GnerateBinaries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		int q=0;
		System.out.println("Generate binaries for " + i);
		
		CreateBinary(i);
	}
	static void CreateBinary(int i)
	{
		if(i==0)
			return;
		else
		{
		   
			CreateBinary(i/2);
			System.out.print(i%2 + " ");
		}
	}

}
