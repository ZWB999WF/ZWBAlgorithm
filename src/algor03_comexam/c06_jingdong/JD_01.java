package algor03_comexam.c06_jingdong;

import java.util.Scanner;

/*
 *  题目描述
 *  	给定一个字符串s，当两个相同的s连接时，删除连接处重复的部分，返回连接后的字符串
 *  
 *  测试案例
 *		输入：abcd
 *		输出：abcdabcd		
 *
 * 		输入：heoohe
 *		输出：heooheoohe
 * 
 * 	该代码只能听过40%的测试案例
 */

public class JD_01 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        int len = s.length();
        int left = s.indexOf(s.charAt(len-1));
        int right = len-1;
        while(left >= 0 && left != right){
            if(s.charAt(left--) != s.charAt(right--)) break ;
            
        }
        System.out.println(s.substring(0,right+1) + s) ;
    }
}