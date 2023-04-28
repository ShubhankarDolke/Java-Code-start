import java.lang.*;
import java.io.*;
class student
{
int rollno;
String name;
static int count=0;
student()
    {
       rollno=0;
       name="";
      count++;
      }
student(int rollno,String name)
   {
     this.rollno=rollno;
     this.name=name;
    count++;
    }
 public String toString()
   {
   return rollno+" "+name;
   }

  public static void main(String args[])
    {
   student s1=new student(101,"raj");
   student s2=new student(102,"vijay");
   student s3=new student();
 System.out.println(s1);

 System.out.println(s2);

 System.out.println("count"+count);
     }
}
