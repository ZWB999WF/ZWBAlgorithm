package c06_jingdong;

import java.util.Scanner;

/*
 *  题目描述
 *  	给定一个字符串，在其尾部添加字符使其成为回文串，计算最少添加的字符个数
 *  
 *  测试案例
 *  	输入：hello
 *      输出：4，添加后的字符串为 hellolleh
 *      
 *  	输入：abcba
 *      输出：0
 *  
 */	


public class JD_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        int len = s.length();
        char[] ch = s.toCharArray();
        int res = 0;
        for(int i=0;i<len;i++){
	       	if(isPalindrome(ch, i)) break;
	       	res++;
        }
        System.out.println(res);
	}
	
	public static boolean isPalindrome(char[] chars, int start){
		for(int i =start,j=chars.length-1;i<j;i++,j--){
			if(chars[i] != chars[j]) return false;
		}
		return true;
	}

}
