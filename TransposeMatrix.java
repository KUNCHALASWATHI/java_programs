/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows: 3
  Enter number of columns: 3
  Elements  [1,1] : 2
  Elements  [1,2] : 3
  Elements  [1,3] : 4
  Elements  [2,1] : 1
  Elements  [2,2] : 2
  Elements  [2,3] : 3
  Elements  [3,1] : 4
  Elements  [3,2] : 5
  Elements  [3,3] : 6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/

import java.util.Scanner;

public class TransposeMatrix {

//Define the main method
  public static void main(String args[])
  {
    int i,j;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter total rows");
    int row = sc.nextInt();
    System.out.println("enter total columns");
    int columns = sc.nextInt();
    int array[][]=new int [row][columns];
    for(i=0;i<row;i++)
      {
        for(j=0;j<columns;j++)
          {
           System.out.println("elements;["+(i+1)+","+(j+1)+"]");
          array[i][j]=sc.nextInt();
          System.out.print(" ");
          }
      }
    System.out.println("the above matrix transpose is ");
    for(i=0;i<columns;i++)
      {
        for(j=0;j<row;j++)
          {
            System.out.print(array[j][i]+" ");
            
          }
        System.out.println(" ");
      }
  }

}