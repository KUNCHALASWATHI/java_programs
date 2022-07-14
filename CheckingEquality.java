/*  JFM1T2_AssignmentPrograms2:

    Write a program to perform the below actions and print the result. Check if the below numbers are equal or not.
    1. 30 and 20
    2. 20 and 20
    3. 20 and 30
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    30
    Enter second number: 
    20
    
    Expected Output:
    30 and 20 is not equal
     
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

public  class CheckingEquality {


//main method
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter first number: ");
  int a=sc.nextInt();
  System.out.println("Enter second number: ");
  int b=sc.nextInt();
  if(a==b)
  System.out.println("both are equal");
  else
  System.out.println("both are not equal");
  System.out.println("Enter first number: ");
  int i=sc.nextInt();
  System.out.println("Enter second number: ");
  int j=sc.nextInt();
  if(i==j)
  System.out.println("both are equal");
  else
  System.out.println("both are not equal");
  System.out.println("Enter first number: ");
  int l=sc.nextInt();
  System.out.println("Enter second number: ");
  int m=sc.nextInt();
  if(l==m)
  System.out.println("both are equal");
  else
  System.out.println("both are not equal");
}
}