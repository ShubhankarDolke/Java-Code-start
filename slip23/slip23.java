import java.util.*;
class Cricket
{
String name;
int totalruns,tno,ip,pcode;
float avg;

void accept()
{
Scanner sr=new Scanner(System.in);
System.out.println("enter name,TotalRuns,Tno,Ip,pcode:");
name=sr.next();
totalruns=sr.nextInt();
tno=sr.nextInt();
ip=sr.nextInt();
pcode=sr.nextInt();
}

static void average(Cricket p[],int n)
{
for(int i=0;i<n;i++)
{
p[i].avg=p[i].totalruns/p[i].ip;
System.out.println("Player name" +p[i].name);
System.out.println("Player average" +p[i].avg);
}
}

void average()
{
	avg=totalruns/ip;
	System.out.println("Player average" +avg);
}

public static void main(String args[])
{
int n;
Scanner sr=new Scanner(System.in);
System.out.println("enter no of object u want");
n=sr.nextInt();
Cricket p[]=new Cricket[n];
for(int i=0;i<n;i++)
{
p[i]=new Cricket();
p[i].accept();
}
System.out.println("average runs of all players:");
Cricket.average(p,n);

System.out.println("enter player code");
int pid=sr.nextInt();
for(int i=0;i<n;i++)
{
	if(p[i].pcode==pid)
	{
		System.out.println("Single player avg");
		p[i].average();
	}
}
}
}


