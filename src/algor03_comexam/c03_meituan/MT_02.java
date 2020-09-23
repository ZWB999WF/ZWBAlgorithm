package algor03_comexam.c03_meituan;

import java.util.Scanner;

/*
 * 	Author：ZWB
 *	Date：     2020-9-18
 * 
 *  题目描述
 *  	给定一个字符串，你的任务是计算这个字符串中有多少个回文子串（回文串是一个正读和反读都一样的字符串）。
 *  	具有不同开始位置或结束位置的回文串，即使是由相同的字符组成，也会被计为是不同的子串。
 *  
 *  测试案例
 *  	输入：abc
 *  	输出：3
 *  
 * 		输入：aaa
 *      输出：6
 *  	
 */

public class MT_02 {
	   public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        String  s  = in.nextLine();
	        in.close();
	        int[] dp = new int[s.length()];
//	        dp[0] = 1;
//	        for(int i=1;i<s.length();i++){
//	            String tmp1 = s.substring(0,i);
//	            char ch = s.charAt(i);
//	            dp[i] = dp[i-1];
//	            if(tmp1.indexOf(ch) == -1) dp[i] += 1;
//	            else{
//	                int index = tmp1.indexOf(ch);
//	                for(int j=index;j<=i;j++){
//	                    String tmp2 = s.substring(j,i+1);
//	                    if(isPalindrome(tmp2)) dp[i]++;
//	                }
//	            }
//	        }
	        System.out.println(s);
	    }
	   
	    public static boolean isPalindrome(String s){
	        int len  = s.length();
	        for(int i=0,j=len-1;i<j;i++,j--){
	            if(s.charAt(i) != s.charAt(j)) return false;
	        }
	        return true;
	    }
}