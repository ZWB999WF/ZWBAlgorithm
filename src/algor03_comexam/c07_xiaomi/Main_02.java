package algor03_comexam.c07_xiaomi;

import java.util.Scanner;

public class Main_02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int  n  = in.nextInt();
        in.close();
        for(int i=1;i<=n;i++){
        	for(int j=0;j<=i;j++){
        		System.out.print(Fibonacc(j) + " ");
        	}
        	for(int k=i-1;k>=1;k--){
    			System.out.print(Fibonacc(k) + " ");
    			
    		}
    		System.out.println();
        }
       
    }

	public static int Fibonacc(int m){
		if(m <= 2)  return 1;
		int num1 =1;
		int num2 =1;
		int val = 0;
		for(int i=3;i<=m;i++){
			val  = num1 + num2;
			num1 = num2;
			num2 = val;
		}
		return val;
	}

}
