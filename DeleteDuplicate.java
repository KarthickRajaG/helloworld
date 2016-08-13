import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class DeleteDuplicate {
	 public static void main(String args[]){  
		 Scanner scr=new Scanner(System.in);
		    String s="";
		    String s1="";
		    String s2="";
		    String s3="";
		    String s4="";
		    String s5="";
		    String s6="";
		    String s7="";
		   HashSet<String> al=new HashSet<String>();  
		   al.add(s=scr.nextLine());  
		   al.add(s1=scr.nextLine());  
		   al.add(s2=scr.nextLine());  
		   al.add(s3=scr.nextLine());
		   al.add(s4=scr.nextLine());  
		   al.add(s5=scr.nextLine());  
		   al.add(s6=scr.nextLine());  
		   al.add(s7=scr.nextLine());  
		   Iterator<String> itr=al.iterator();  
		   while(itr.hasNext()){  
		    System.out.println(itr.next());  
		   }  
		  }  
		 }  
