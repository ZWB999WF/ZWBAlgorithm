package algor03_comexam.c07_xiaomi;

import java.util.Scanner;

/*
 *  ����һ���ַ�������������Ǽ�������ַ������ж��ٸ������Ӵ������Ĵ���һ�������ͷ�����һ�����ַ�������

	���в�ͬ��ʼλ�û����λ�õĻ��Ĵ�����ʹ������ͬ���ַ���ɣ�Ҳ�ᱻ��Ϊ�ǲ�ͬ���Ӵ���
	
	�������������������һ���ַ��������Ȳ��ᳬ�� 1000��

	������������������һ���Ǹ������� ���������ַ����ж��ٸ������Ӵ���
	
	���룺abc
	�����3

	���룺aaa
	�����6
 */

public class Main_01 {
	   public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        String  s  = in.next();
	        in.close();
	        int[] dp = new int[s.length()];
	        dp[0] = 1;
	        for(int i=1;i<s.length();i++){
	            String tmp1 = s.substring(0,i);
	            char ch = s.charAt(i);
	            dp[i] = dp[i-1];
	            if(tmp1.indexOf(ch) == -1) dp[i] += 1;
	            else{
	                int index = tmp1.indexOf(ch);
	                for(int j=index;j<=i;j++){
	                    String tmp2 = s.substring(j,i+1);
	                    if(isHuiwen(tmp2)) dp[i]++;
	                }
	            }
	        }
	        System.out.println(dp[s.length()-1]);
	    }


	    public static boolean isHuiwen(String s){
	        int len  = s.length();
	        for(int i=0,j=len-1;i<j;i++,j--){
	            if(s.charAt(i) != s.charAt(j)) return false;
	        }
	        return true;
	    }
}

