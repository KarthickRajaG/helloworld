public classRemovereverse{
Public static void main(String[] args){
 String string="abcdef"; 
String reverse = new StringBuffer(string). reverse().toString(); 
System.out.println("\nString before reverse: "+string); 
System.out.println("String after reverse: "+reverse);
strNew=reverse.replaceAll("[aeiouAEIOU]", ""); 
System.out.print("All Vowels Removed Successfully..!!\nNow the String is :\n");
 System.out.print(strNew);
}}
