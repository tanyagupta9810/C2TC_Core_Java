package com.day12.MutidimensionalArray;

public class MutiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//2D-fixed size array
		int[][]arr =new int[4][4];
		int[][]arr2= {{1,2,3},{4,5,6}};
		System.out.println(arr2[1][2]);
		System.out.println(arr2[0][2]);
		
		//2D- variable size array
		int [][]arr3= new int[3][];
		arr3[0]= new int[3];
		arr3[1]=new int[2];
		arr3[2]=new int[1];
		
		int [][]arr4= {{1,2,3},{4,5},{6}};
		//accessing element of arr4
		System.out.println("Elements of arr4 are:- ");
		for(int i=0;i<3;i++)
		{
			int k= arr4[i].length;
			for(int j=0;j<k;j++)
			{
				System.out.print(arr4[i][j]+" ");
			}
			System.out.println();
		}
		
		
		//3D-fixed size array
				int[][][]arr5 =new int[4][4][4];
				int[][][]arr6= {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
				//accessing element of arr6
				System.out.println("\n\nElements of arr6 are:- ");
				for(int i=0;i<2;i++)
				{
			
					for(int j=0;j<2;j++)
					{
						for(int k=0;k<3;k++)
						{
							System.out.print(arr6[i][j][k]+" ");
						}
						
						System.out.println();
					}
					System.out.println();
				}
				//3D- variable size array
				int [][][]arr7= new int[2][][];
				arr7[0]= new int[3][];
				arr7[1]=new int[2][2];
				arr7[0][0]=new int[1];
				arr7[0][1]=new int[2];
				arr7[0][2]=new int[3];
				
				int [][][]arr8= {{{10},{20,30},{40,50,60}},{{70,80},{90,100}}};
				//accessing element of arr8
				System.out.println("\n\nElements of arr8 are:- ");
				for(int i=0;i<2;i++)
				{
					int a= arr8[i].length;
					for(int j=0;j<a;j++)
					{
						int b= arr8[i][j].length;
						for(int k=0;k<b;k++)
						{
							System.out.print(arr8[i][j][k]+" ");
						}
					System.out.println();
					}
					System.out.println();
				}

	}

}
