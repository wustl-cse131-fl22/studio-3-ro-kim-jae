package studio3;

import java.util.Scanner;

public class SieveOfEratosthenes {


		void sieveOfEratosthenes(int n)
		{
			
		boolean prime[] = new boolean[n + 1];
		for (int i = 0; i <= n; i++)
		prime[i] = true;
		
			
		}
		
		public static void main(String args[])
		{
			Scanner scan = new Scanner(System.in);	
			 int n = scan.nextInt();
			System.out.print("Prime numbers ");
			System.out.println("smaller than or equal to " + n);
			
		}
	}


