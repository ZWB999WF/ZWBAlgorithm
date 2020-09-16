package c03_meituan;

import java.util.Scanner;

/*
 * 给定一个矩阵，按照主对角线的方向打印矩阵值
 *    1 2 3
 *    4 5 6
 *    7 8 9
 * 输出：1 2 4 3 5 7 6 8 9
 * 
 * 解题思路
 * 1.  对于N*N的矩阵，其各条主对角线上元素满足一个规律：对角线上的元素的行坐标与纵坐标之和是固定的
 * 2.  对于N*N的矩阵，其各条主对角线的第一个元素，恰好是矩阵第一行和最后一列的元素值,其横纵坐标之和依次为：0,1,2...2*n-1
 * 3.  时间复杂度：O(n^3)
 * 
 * 扩展:按照斜对角线的方向打印矩阵值
 */


public class Main_01 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] input = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				input[i][j] = in.nextInt();
			}
		}
		maindiag(input);
	}
	
	// 按照主对角线方向输出矩阵值
	public static void maindiag(int[][] data){
		int n = data.length;
		for(int k = 0;k <= 2 * (n - 1); k ++)  
	    {  
	        for(int i = 0;i < n;i ++)  
	        {  
	            for(int j = 0;j < n;j ++)  
	            {                 
	                if(k == i + j)  
	                {  
	                    System.out.print(data[i][j]);
	                }  
	            }  
	            
	        }  
	        System.out.println();
	    }
	}
	
	// 按照斜对角线方向输出矩阵值
	public static void diagline(int[][] data){
		int n = data.length;
		for(int k = n-1;k >=0; k--)  
	    {  
	        for(int i = 0;i < n;i ++)  
	        {  
	            for(int j = 0;j < n;j ++)  
	            {                 
	                if(k == i + j)  
	                {  
	                    System.out.print(data[i][j]);
	                }  
	            }  
	            
	        }  
	        System.out.println();
	    }
		
	}
}
