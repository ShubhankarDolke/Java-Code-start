import java.util.*;
import java.io.*;


public class slip9
{
public static void main(String arg[]) throws IOException
{
File f=new File("abc.txt");
if(!f.exists())
System.out.println("file not exist");
else
{
Scanner sr=new Scanner(f);
String str;
while(sr.hasNextLine())
{
 str=sr.nextLine();
StringBuffer sb=new StringBuffer(str);
System.out.println(sb.reverse());
}
}
}
}