import java.util.Scanner.*;
public class duplicate
{
  public static void main(String args[])
  {
    String string="this Is Swathi From kondapalli Iam swathi";
    int count;
  string=string.toUpperCase();
    
    String s1[]=string.split(" ");
    System.out.println("duplicate word in a string: ");
       for(int i=0;i<s1.length;i++)
      {
        count=1;
        for(int j=i+1;j<s1.length;j++)
          {
            if(s1[i].equals(s1[j]))
            {
              count++;
              s1[j]="0";
            }
          }
        if(count>1 && s1[i]!="0")
        {
    System.out.println(s1[i]);
      }
    }
  }
}
  
  
  
  