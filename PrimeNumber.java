package week1.day1.assignments;

public class PrimeNumber {
	public static void main(String[] args)
	{
		int input=16;
		boolean flag=false;
		for(int i=2;i<=input/2;++i)
		{
			if(input % i==0)
			{
			
				flag=true;
				break;
			}
		}
			if (flag==false)
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
}