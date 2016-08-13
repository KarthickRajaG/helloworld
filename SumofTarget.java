import java.util.Scanner;

public class SumofTarget {
	public static void main(String[] args) {
		int sum=0;
		Scanner scr=new Scanner(System.in);
		int t=scr.nextInt();
		int[] m={6,7,8,9,10};
		for(int i=0;i<m.length;i++)
		{
		sum=sum+m[i];	
		}
		if(sum==t)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
