package c06_jingdong;

import java.util.Scanner;

/*
 *
 * -----------输入-----------
 * a
 * aaa
 * abcd
 * abcdab
 * -----------输出-----------
 * aa
 * aaaa
 * abcdabcd
 * abcdabcdab
 * 
 * 该代码只能听过40%的测试案例
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