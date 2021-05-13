package array;

import java.util.Iterator;

import sun.security.util.Length;
import sun.tools.jar.resources.jar;

public class TestArray2 {

	public static void main(String[] args) {
		
		//int[][]x=new int[5][4];
		int [][]x= { {1,2,3},{4,5}};
		//x[0][1]=20;
		//x[1][1]=40;
		
		System.out.println(x[1][1]);
		System.out.println("有幾排?="+x.length);//有幾排
		System.out.println("第一排有幾個="+x[0].length);
		//i代表第幾排,j代表第幾個
		for (int i=0;i<x.length;i++) {
			for (int j = 0; j<x[i].length;j++) {
				//System.out.println("i="+i +"j="+j);
				System.out.println(x[i][j]);
				
			}
		}
		System.out.println("========================");
		for(int[] a  :  x  ) {
			//x[0] 是123是陣列所以寫int[]
			for(int b  :  a) {
				System.out.println(b);
			}
			
			
		}
		
		
		
		
		
		
	}

}
