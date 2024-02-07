package studio3;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("What do you want n to be?");

		int n = in.nextInt();
		int []array= new int [n+1];
		for (n=2; n<array.length; n++)
		{
			array [n]=n;
		}
		for (int p=2; p<array.length; p++)
		{
			for (int w = 2*p; w<array.length; w=w+p)
			{
				array[w]= 0;
				
			}
			
		}
		for(int x = 2; x<array.length; x++)
		{
			if (array[x]>0)
				System.out.println(x);
		}
}
}