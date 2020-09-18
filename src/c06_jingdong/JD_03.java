package c06_jingdong;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *  ��Ŀ����
 *  	����һ��Ӣ���ַ������ҳ����п��ܴ��ڵ����(1000-3999)���ַ����к��д�Сд�����֣��ո񣬱�����
 *  
 *  ���԰���
 *  	���룺abc2020 def 1956 end.
 *      �����2020 1956
 *      
 *  	���룺abc202200 def 1956 end.
 *      �����1956
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