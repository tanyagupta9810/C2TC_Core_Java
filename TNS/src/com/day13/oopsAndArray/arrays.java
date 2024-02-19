package com.day13.oopsAndArray;

import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {45,65,85,47,25,13,5,2,46,38};
		
		// Displaying array using method of arrays class
		System.out.println("Original Array:- \n"+Arrays.toString(arr));
		
		// sorting array using arrays-class method
		Arrays.sort(arr);
		System.out.println("After sorting Array:- \n"+Arrays.toString(arr));
		
		// performing binary search
		int x= Arrays.binarySearch(arr, 13);
		System.out.println("\nIndex of element 13 in array arr is:- \n"+x);
		
		// comparing 2 arrays
		int arr2[]={45,65,85,47,25,13,5,2,46,38};
		System.out.println("\nFirst Array:- \n"+Arrays.toString(arr));
		System.out.println("Second Array:- \n"+Arrays.toString(arr2));
		System.out.println("\nComparing array 1 and 2:- \n"+ Arrays.compare(arr, arr2));
		
		//copying array
		int arr3[]= Arrays.copyOf(arr2, arr2.length);
		System.out.println("\nCopied Array:- "+Arrays.toString(arr3));
		
		Arrays.sort(arr2);
		System.out.println("\nFirst Array:- \n"+Arrays.toString(arr));
		System.out.println("Second Array:- \n"+Arrays.toString(arr2));
		System.out.println("Third Array:- \n"+Arrays.toString(arr3));
		System.out.println("\nComparing array 1 and 2:- \n"+ Arrays.compare(arr, arr2));
		// equals method
		
		System.out.println("Is array 1 and 2 are equal:- \n"+ Arrays.equals(arr, arr2));
		System.out.println("Is array 1 and 3 are equal:- \n"+ Arrays.equals(arr, arr3));
	}

}
