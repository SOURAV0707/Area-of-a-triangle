import java.util.*;
class Shilpa
{
public static void main(String args[])
{
Scanner obj=new Scanner(System.in);
System.out.println("enter the first side");
int a=obj.nextInt();
System.out.println("enter the second side");
int b=obj.nextInt();
System.out.println("enter the third side");
int c=obj.nextInt();
float s=(a+b+c)/2;
double r=Math.sqrt(s*(s-a)*(s-b)*(s-c));
System.out.println("area="+r);
}
}