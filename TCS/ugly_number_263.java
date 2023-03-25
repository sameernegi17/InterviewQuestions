/*

An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.

*/
public class Main
{
    public static boolean isUgly(int n) {
        
        if (n==0) return false;
        for(int i = 2; i <= 5; i++)
        {
            while(n%i == 0)
            {
                n = n/i;
            }
        }
        return n == 1;
    }
	public static void main(String[] args) {
		 System.out.println(isUgly(21));
	}
}
