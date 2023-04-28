
import java.util.*;
import java.io.*;

public class slip12
{
public static void main(String arg[]) throws IOException
{
String fpath;
String str=arg[0];
File f=new File(str);
if(!f.exists())
System.out.println("file not found");
else
if(f.isFile())
{
	System.out.println("path="+f.getPath());
	System.out.println("size="+f.length());
}
fpath=f.getPath();
if((fpath.endsWith("txt")) && (f.exists()) )
{
	f.delete();
	System.out.println("deleted successfully");
}
}
}