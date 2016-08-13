import java.util.Scanner;
import java.util.regex.Pattern;

public class Mailid {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String str="karthi@gmail.com.";
		String s1="";
		String s2="";
		String s3="";
		String str1="com";
		Pattern p = Pattern.compile("[@..]");
		String arr[] = p.split(str);
		for (int i = 0; i < arr.length; i++) {
			s1=arr[0];
			s2=arr[1];
			s3=arr[2];
			}
		if(s1.length()>=3)
		{
			System.out.println("valid :" + str);
		}
		if(s2.length()==4)
		{
			System.out.println("valid :" + str);
		}
		if(s3.equals(str1))
		{
			System.out.println("valid :" + str);
		}
         
        		 
	}
}
