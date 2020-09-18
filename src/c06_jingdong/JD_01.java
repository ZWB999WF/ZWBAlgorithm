package c06_jingdong;

import java.util.Scanner;

/*
 *
 * -----------����-----------
 * a
 * aaa
 * abcd
 * abcdab
 * -----------���-----------
 * aa
 * aaaa
 * abcdabcd
 * abcdabcdab
 * 
 * �ô���ֻ������40%�Ĳ��԰���
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