import java.lang.*;
import java.io.*;
class X
{
     public static void main(String[] args) throws IOException
  {
    if(args.length==0)
   {
    System.out.println("please pass commandline parameter");
    System.exit(0);
     }
      int a=0,b=0,sum,cnt,n,j;
      int[]prime=new int[args.length];
       int[]perfect=new int[args.length];
    for(int i=0;i<args.length;i++)
     {
        sum=0;
      n=Integer.parseInt(args[i]);
      for(j=1;j<=(n/2);j++);
       {
        if(n%j==0)
       {
        sum=sum+j;
        }
      }
      if(sum==n)
        {
          perfect[a++]=n;
         }
       cnt=0;
      for(j=1;j<=n;j++)
      {  
         if(n%j==0)
        cnt++;
          }
        if(cnt==2)
        prime[b++]=n;
       }
      System.out.println("prime nos:");
      for(int i=0;i<b;i++)
       {
      System.out.println(prime[i]);
       }
      System.out.println("perfect nos:");
      for(int i=0;i<a;i++)
      {
      System.out.println(perfect[i]);
      }
    }
  }
   
      