import java.util.Scanner;

public class String1 {
	public static void main(String args[])
	{
		Scanner scr=new Scanner(System.in);
		String s1="a";
		int n1=scr.nextInt();
		String s2="b";
		int n2=scr.nextInt();
		String s3=" ";
		String s4=" ";
		for(int i=0;i<n1;i++)
		{
			s3=s3+s1;
		}
		for(int j=0;j<n2;j++)
		{
			s4=s4+s2;
		}
		System.out.println(s3+s4);
	}

}
