package cn.dkc_1123;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		//�洢@ǰ����ַ���
		List<String> l1 = new ArrayList<String>();
		//�洢@������ַ���
		List<String> l2 = new ArrayList<String>();
		System.out.println("�������ʼ���ַ�����С:>");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] str = new String[n];
		for(int i = 0;i<str.length;i++)
			str[i] = s.next();
		//j��l2���ϵ��±�
		int j = 0;
		for(int i = 0;i<str.length;i++) {
			//�ҳ�@���±�
			int m = str[i].indexOf("@");
			//s1��ʾ@ǰ����ַ���
			String s1 = str[i].substring(0, m);
			//s2��ʾ@ǰ����ַ���
			String s2 = str[i].substring(m+1, str[i].length());
			//�ҳ�+���±�
			int q = s1.indexOf("+");
			//û��+
			if(q == -1) {
				String[] ss = s1.split("\\.");
				String st = "";
				for(int k = 0;k<ss.length;k++) {
					st += ss[k];
				}
				l1.add(st);
			}
			else {
				String ss1 = s1.substring(0, q);
				String[] ss = ss1.split("\\.");
				String st = "";
				for(int k = 0;k<ss.length;k++) {
					st += ss[k];
				}
				l1.add(st);
			}
			if(!l2.contains(s2)) {
				l2.add(s2);
				String aw = l1.get(i)+"@"+l2.get(j);
				l.add(aw);
				j++;
			}
			
		}
		System.out.println("��Ч��ַΪ: "+l.size());
		
	}
}
