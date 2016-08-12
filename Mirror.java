public class Mirror {
	public static void main(String[] args) {
		
     String reverse="";
     String reverse1="";
     String reverse2="";
     String reverse3="";
     String str1="ISPALINILAPSI";
     String str2="karthi";
     String str3="madam";
     String str4="2A3MEAS";
     int length=str1.length();
     int length1=str2.length();
     int length2=str3.length();
     int length3=str4.length();
     for(int i=length-1;i>=0;i--)
     {
    	 reverse=reverse+str1.charAt(i);
    	 if(str1.equals(reverse))
    	 {
    		 System.out.println("Palindrome:" + str1);
    	 }}
    	
         for(int j=length1-1;j>=0;j--)
         {
        	 reverse1=reverse1+str2.charAt(j);
    	 if(!str2.equals(reverse1))
    	 {
    		 System.out.println("not Palindrome:" + str2);
    	 }
     }
        
         for(int k=length2-1;k>=0;k--)
         {
        	 reverse2=reverse2+str3.charAt(k);
        	 if(str3.equals(reverse2))
        	 {
        		 System.out.println("mirrored palindrome:" + str3);
        	 }
        	 }
         for(int l=length3-1;l>=0;l--)
         reverse3=reverse3+str4.charAt(l);
         String str5=str4.substring(0,1);
         String str6=reverse.substring(0,1);
         if(str5.equals("2")||str6.equals("s"))
         {
        	 System.out.println("Mirriored String :" +str4);
         }

}}
