package algor03_comexam.c04_huawei;

import java.util.Scanner;

public class HW_01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
		int i=0;
		int j=1;
		int end=0;
		while (j<s.length()){
		    while (j<s.length()&&s.charAt(i)!=s.charAt(j)){
		        j+=1;
		    }
		    end=j;
		    while (j<s.length()&&s.charAt(i)==s.charAt(j)){
		        j+=1;
		        i+=1;
		        if (i==end){
		            i=0;
		        }
		    }
		    if (j!=s.length()){
		        i=0;
		        j=end+1;

		    }
		}
		for(int k=0;k<end;k++){
			System.out.print(s.charAt(k));
		}
	}	
}
