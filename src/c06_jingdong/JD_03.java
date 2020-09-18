package c06_jingdong;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  题目描述
 *  	给定一段英文字符串，找出其中可能存在的年份(1000-3999)。字符串中含有大小写，数字，空格，标点符号
 *  
 *  测试案例
 *  	输入：abc2020 def 1956 end.
 *      输出：2020 1956
 *      
 *  	输入：abc202200 def 1956 end.
 *      输出：1956
 *  
 */		


public class JD_03{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		ArrayList<Integer> years = search(s);
		for(int year : years){
			if(year>=1000 && year<=3999) System.out.print(year + " ");
		}
	}
	
	public static ArrayList<Integer> search(String s){
		ArrayList<Integer> res = new ArrayList<Integer>();
		for(int i=0;i<s.length();){
			String tmp = "";
			int j=i;
			while(j<s.length()){
				if('0' <= s.charAt(j)&& '9'>= s.charAt(j)) {
					tmp += String.valueOf(s.charAt(j));
					j++;
				}
				else {
					j++;
					break;
				}
			}
			if(!tmp.equals("")) res.add(Integer.valueOf(tmp));
			i=j;
		}
		return res;
	}
}