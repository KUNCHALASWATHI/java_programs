/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.Scanner;
public class ArraySum {
  public static void main(String args[])
  {
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    int a[]=new int[10];
    System.out.println("enter no of 10 elements");
    for(int i=0;i<10;i++)
    a[i]=sc.nextInt();
    for(int i=0;i<10;i++)
      {
        sum=sum+a[i];  
      }
    System.out.println("sum="+sum);
    
  
    
    
    
  }

//Define the main method

//Declare the variables and initialize

//Take input from user

//Check user input values using for loop and add all values
 
//Print the result

}
