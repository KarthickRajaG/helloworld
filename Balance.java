import java.util.Scanner;

public class Balance {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String str1=scr.nextLine();
		String[] str2={"a","b","c","d","e","f","g","h","i","j","k","l","m"};
		String[] str3={"n","o","p","q","r","s","t","u","v","W","x","y","z"};
		String str4="";
		String str5="";
		String str6="";
		String str7="";
		int length=str1.length();
		if(!((length%2)==0))
		{
			System.out.println("not balanced : " + str1);
		}
		if(length%2==0)
		{
			for(int i=0;i<str2.length;i++)
			{
		 str4=str1.substring(0,1);
		 str5=str1.substring(1,2);
		 str6=str1.substring(length-1);
		 str7=str1.substring(length-2,length-1);
		 if(str4.equals(str3[i])||str5.equals(str2[i])&&str6.equals(str3[i])||str7.equals(str2[i]))
		 {
         System.out.println("Balanced");
		}
		 
			
		}}
	}}

