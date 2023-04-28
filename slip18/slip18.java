import java.util.*;
import java.io.*;

class slip18
{
public static void main(String arg[]) throws IOException
{
File f=new File("abc.txt");
if(!f.exists())
System.out.println("file not exist");
else
{
FileReader fr=new FileReader(f);
int n,ch=0,line=1,word=0;
while((n=fr.read())!=-1)
{
if(n=='\n')
{
word++;
line++;
}
else if(n==' ')
word++;
else
ch++;
}
System.out.println("word="+word+"  Character="+ch+"   line="+line);
fr.close();
}
}
}