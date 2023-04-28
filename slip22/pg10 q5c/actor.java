package bollywood;
import java.util.*;
public class actor
{
     String name;
     public void accept()
     {
     Scanner sr=new Scanner(System.in);
     System.out.println("enter actor name");
     name=sr.next();
     }
     public void display() 
     {
     System.out.println("actor name is"+name);
}
}