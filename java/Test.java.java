import java.util.Scanner;
class Test
{
public static void main(String args[])
{
int a,b,sum;
System.out.println("Enter frst number");
Scanner sc =new Scanner(System.in);
a=sc.nextInt();
System.out.println("Enter second number");
b=sc.nextInt();
sc.close();
sum = a + b;
System.out.println("Addition is="+ sum);
}
}