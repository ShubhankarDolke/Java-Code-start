import java.util.*;
import java.io.*;
class HashProg
{
public static void main(String args[]) throws IOException
{
String str;
Hashtable<String,Integer> Emp = new Hashtable<String,Integer>();
Enumeration<String> names;
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter Number of Records ");
int n=Integer.parseInt(br.readLine());

for (int i=1;i<=n;i++)
{
System.out.println("Enter Name Of "+ i+"Employee ");
str=br.readLine();
System.out.println("Enter Salary Of "+ i+" Employee");
int sal=Integer.parseInt(br.readLine());
Emp.put(str,sal);
}

int maxsal=0;
names = Emp.keys();

while(names.hasMoreElements())
{
str = (String) names.nextElement();
System.out.println(str + ": " + Emp.get(str));

if(maxsal<Emp.get(str))
{
maxsal=Emp.get(str);
}
}
System.out.println(" Maximum Salary OF Employee is  "+maxsal);
}
}