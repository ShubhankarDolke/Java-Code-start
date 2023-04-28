class employee
{
int eno;
String ename;
float esal,da,gs,tax,pf,ns,ded;
employee(int a,String b,float c)
{
eno=a;
ename=b;
esal=c;
}
public float getsalary()
{
da=esal*0.10f;
gs=esal+da;
tax=esal*0.10f;
pf=esal*0.10f;
ded=tax+pf;
ns=gs-ded;
return(ns);
}
void display()
{
System.out.println(eno);
System.out.println(ename);
System.out.println(esal);
}
}
class manager extends employee
{
float mns,ta,hra;
manager(int a,String b,float c,float d,float e)
{
super(a,b,c);
ta=d;
hra=e;
}
public float getsalary()
{
float f1=super.getsalary();
mns=f1+hra+ta;
return mns;
}
public static void main(String s[])
{
manager m1=new manager(1,"mustafa",20000f,1000f,5000f);
m1.display();
System.out.println("net salary of manager"+m1.getsalary());
}
}