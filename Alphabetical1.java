import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Alphabetical1 {
		public static void main(String[] args) {
			Scanner scr=new Scanner(System.in);
			String str=scr.nextLine();
			String s1 = "";
			Pattern p = Pattern.compile("[.]");
			String arr[] = p.split(str);
			for (int i = 0; i < arr.length; i++) {
				s1 = arr[0];
				}
			String st1 = "";
			String a1[] = s1.split(" ");
			Arrays.sort(a1);
			for (int i = 0; i < a1.length; i++) {
				st1 += a1[i];
			}
			
			System.out.println(st1);
		}
