import java.io.*;
import java.util.*;
class Slip29
{
   public static void main(String args[]) throws IOException
   {
    int n;
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("enter no of students data to be stored:");
n=Integer.parseInt(br.readLine());
 LinkedList studentsLists=new LinkedList();
 String str=new String("");
   for(int i=1;i<=n;i++)
{
  System.out.println("enter Students name" + i +":");
   str=br.readLine();
   studentsLists.addLast(str);
}
System.out.println("printing Students data using iterator:");
Iterator myIt=studentsLists.iterator();
 while(myIt.hasNext())
System.out.println(myIt.next());
  System.out.println("printing Strings using list iterator:");
 ListIterator myIt1=studentsLists.listIterator();
 while(myIt.hasNext())
  System.out.println(myIt1.next());
}
}