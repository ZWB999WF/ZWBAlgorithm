package c03_meituan;

import java.util.Scanner;

/*
 * ����һ�����󣬰������Խ��ߵķ����ӡ����ֵ
 *    1 2 3
 *    4 5 6
 *    7 8 9
 * �����1 2 4 3 5 7 6 8 9
 * 
 * ����˼·
 * 1.  ����N*N�ľ�����������Խ�����Ԫ������һ�����ɣ��Խ����ϵ�Ԫ�ص���������������֮���ǹ̶���
 * 2.  ����N*N�ľ�����������Խ��ߵĵ�һ��Ԫ�أ�ǡ���Ǿ����һ�к����һ�е�Ԫ��ֵ,���������֮������Ϊ��0,1,2...2*n-1
 * 3.  ʱ�临�Ӷȣ�O(n^3)
 * 
 * ��չ:����б�Խ��ߵķ����ӡ����ֵ
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
	
	// �������Խ��߷����������ֵ
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
	
	// ����б�Խ��߷����������ֵ
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
