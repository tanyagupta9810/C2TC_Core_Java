package com.assignment;

import java.util.Scanner;

public class Zig_Zag {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int n=0;
        System.out.println("Enter the string :- ");
        String s=sc.next();
        System.out.println("Enter the number of rows :- ");
        n=sc.nextInt();
        String a[]= new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]="";
        }
        int d,f=0;
        for(int i=0;i<s.length();i++)
        {
            f=i%(2*n-2);
            d=Math.min(f,2*n-2-f);
            a[d]=a[d]+s.charAt(i);
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]);
        }
            
        }

}
