package c06_jingdong;

import java.util.Scanner;

/*
 *  ��Ŀ����
 *  	����һ���ַ���������β������ַ�ʹ���Ϊ���Ĵ�������������ӵ��ַ�����
 *  
 *  ���԰���
 *  	���룺hello
 *      �����4����Ӻ���ַ���Ϊ hellolleh
 *      
 *  	���룺abcba
 *      �����0
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
