package week1.day1.assignments;

public class ConvertNegative {
	public static void main(String[] args) {
		int a = -40;
		if (a < 0 && a != 0) {
			System.out.println("The number is negative ");
			a = a * -1;
			System.out.println("The number -" + a + " is conveted to " + a);
		} else
		{
			System.out.println("The number is positive" + a);
	}

}
}
