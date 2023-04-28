import java.util.*;
class slip28
{
   public static void main(String args[])
{
    ArrayList<String>Emp=new ArrayList<String>();
   Emp.add("sneha");
    Emp.add("Raj");
   Emp.add("Rahul");
    Emp.add("Ashish");
 System.out.println("before sorting:");
    for(int i=0;i<4;i++)
   {
    System.out.println(Emp.get(i));
  }
   Collections.sort(Emp);
   System.out.println("After sorting:");
  for(int i=0;i<4;i++)
{
  System.out.println(Emp.get(i));
  }
}
}
