import java.util.*;
import java.io.*;

class slip13
{
public static void main(String arg[]) throws IOException
{
File infile=new File("abc.txt");
File outfile=new File("xyz.txt");
FileReader fr=new FileReader(infile);
FileWriter fw=new FileWriter(outfile);
int n;
while((n=fr.read())!=-1)
{
if(Character.isDigit(n))
fw.write('*');
else if(Character.isUpperCase(n))
fw.write(Character.toLowerCase(n));
else if(Character.isLowerCase(n))
fw.write(Character.toUpperCase(n));

}
fr.close();
fw.close();
}
}