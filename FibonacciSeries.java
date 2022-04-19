package week1.day1.assignments;

public class FibonacciSeries {
public static void main(String[] args)
{
int range=8;int a=0;int b=1;
System.out.println(a);
for( int i=0;i<range;i++)
{
	int sum=a+b;
	a=b;
	b=sum;
	System.out.println(sum);
}}
}