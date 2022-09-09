package com.user.prog;
import java.util.Scanner;
class P {
public void add()
{
System.out.println("enter the values");
Scanner sc = new Scanner(System.in);
sc=
String a,b;
a=sc.next();
b=sc.next();
int c,d;
c=Integer.parseInt(a);
d=Integer.parseInt(b);
System.out.println("String is : "+(a+b));
System.out.println("integer is : "+(c+d));
}
public static void main(String[]args)
{
P p = new P();
System.out.println(p.add());
}
}

