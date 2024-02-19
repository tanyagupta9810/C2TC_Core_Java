package com.day11.array1D;

public class Array1D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = new int[5];
		byte[] arr2 = new byte[5];
		float[] arr3 = new float[5];
		double[] arr4 = new double[5];
		boolean[] arr5 = new boolean[5];
		
		
		System.out.println(arr1.getClass().getName()); // that function provide the object type 
		System.out.println(arr2.getClass().getName());
		System.out.println(arr3.getClass().getName());
		System.out.println(arr4.getClass().getName());
		System.out.println(arr5.getClass().getName());
		
		int arr[]= {1,2,3,4,5,6};
		System.out.println("Third element of arr is:- "+arr[2]);//as indexing start from 0
	}

}
