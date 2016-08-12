public class Decrypted {
	public static void main(String[] args) {
		Scanner scr=new Scanner(System.in);
		String st1="35";
		String st=scr.nextLine();
		String st2=scr.nextLine();
		String st3=scr.nextLine();
		String st4=scr.nextLine();
		String[] str1={"04","78","101"};
	    for(int i=0;i<str1.length;i++)
	    {
		if(st.equals(str1[i]))
		{
			System.out.println("+");
		}
	}  
	    
	    for(int i=0;i<str1.length;i++)
	    {
	    String str3=st3.substring(1,3);
	    if(str3.equals(str1[i]))
	    {
	    	System.out.println("-");
	    }
	    }
	    for(int i=0;i<str1.length;i++)
	    {
	    String str4=st4.substring(st4.length()-2);
	    if(str4.equals(str1[i]))
	    	{
	    	System.out.println("*");
	    	}}
	    	String str2=st2.substring(st2.length()-2);
	    if(str2.equals(st1))
	    	{
	    	System.out.println("?");
	    	}

	}}
