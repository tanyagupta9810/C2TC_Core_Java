package com.practice1;

public class Pattern {
	void rightHalfPyramid(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void squareFillPattern(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	void zeroOneTriangle(int n) {
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=i;j++)
			{
				if((j+i)%2==0)
					System.out.print("1");
				else
					System.out.print("0");
			}
			System.out.println();
		}
	}
	void hollowHourglassPattern(int n)
    {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                if(j==i||j==n||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (j = i; j <= n; j++) {
                if(j==i||j==n||i==1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
	
}
