import java.util.Scanner;
class palindram
  {
    public static void main(String args[])
    {
      int n,a,rev = 0;
      Scanner sc =new Scanner (System.in);
      System.out.println("enter the palindramno N:");
     int N = sc.nextInt();
      System.out.println("palindram number from 1-100");
      for(int i=1;i<=N;i++)
        {
          n=i;
          while (n>0)
            {
              a= n % 10;
              rev =rev*10+ a;
              n=n/10;
            }
          if(rev==i)
          {
            System.out.print(i + " ");
          }
          rev = 0;
        }
            }
        }
      
      