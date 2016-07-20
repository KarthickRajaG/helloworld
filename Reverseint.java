public class Reverseint
{
  public static void main(String args[])
  {
    int number = 0;
    int reverse = 0;
    int numCopy = 0; 
 
    System.out.println("Enter a number to check if it is a Palindrome");
 
    Scanner in = new Scanner(System.in);
    number = in.nextInt();
    numCopy = number;
 
    while(numCopy > 0)
    {
      int digit = numCopy % 10; 
      numCopy = numCopy / 10;
      reverse = (reverse * 10) + digit;
    }
System.out.println("reverse");
}}
