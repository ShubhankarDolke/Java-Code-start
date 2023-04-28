package bollywood;
import java.util.*;
public class movie
{
     String name;
     public void accept()
     {
     Scanner sr=new Scanner(System.in);
     System.out.println("enter movie name");
     name=sr.next();
     }
     public void display() 
     {
     System.out.println("movie name is"+name);
}
}