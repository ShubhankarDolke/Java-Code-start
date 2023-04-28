import java.util.*;
abstract class shape
{
         abstract void area();
         abstract void volume();
}
class cone extends shape
{
        public void area()
         {
               System.out.println("Area of cone:"+(3.14*10*5));
         }
       public void volume()
           {
              System.out.println("volume of cone:"+(0.33*3.14*10*10*15));
           }
}
class Cylinder extends shape
{
        public void area()
         {
               System.out.println("Area of Cylinder :"+(3.14*10*5));
         }
       public void volume()
           {
              System.out.println("volume of cone:"+(0.33*3.14*10*10*15));
           }
}
class ABC
{
public static void main(String str[])
{
Cylinder c1=new Cylinder();
cone c12=new cone();
c1.area();
c1.volume();
c12.area();
c12.volume();
}
}
