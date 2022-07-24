import java.util.Scanner;
class count
  {
    public static void main(String args[])
    {
      //String str="hello swathi"
      String str;
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the string");
          str=sc.nextLine();
      
                   int count =1;
      
              for(int i=0;i<str.length()-1;i++)
      {
         if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' '))
          {
          count++;
        }
      }
      System.out.println("number of words in a string:" + count);
    }
}
