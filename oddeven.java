import java.io.*;
import java.util.*;
class swap1{
public static void main(String args[])
{
int n1,n2,temp=0; 
Scanner in=new Scanner(System.in);
n1=in.nextInt();
Scanner s=new Scanner(System.in);
n2=s.nextInt();
System.out.println("before swapping");
System.out.println(+n1);
System.out.println(+n2);
swap(n1,n2);
}
private static void swap(int n1,int n2){
n1=n1+n2;
n2=n1-n2;
n1=n2-n1;
System.out.println("after swapping");
System.out.println(+n1);
System.out.println(+n2);
}}
