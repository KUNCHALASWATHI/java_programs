import java.util.*;
class employee
{
  String name;
  int joining_year;
  String address;
   void show()
     {
     System.out.println(name);
     System.out.println(joining_year);
    System.out.println(address);
   }
      employee(String n,int i,String a)
  {
    name=n;
    joining_year=i;
    address=a;
  } 
     }
    class employeemain
      {
        public static void main(String args[])
        {
          employee e1=new employee("robert",1994,"64d-vijayawada");
          employee e2=new employee("sam",2004,"68d-guntur");
          employee e3=new employee("john",1999,"23f-vizag");
          e1.show();
          e2.show();
          e3.show();
        }
      }