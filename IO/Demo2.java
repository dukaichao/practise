package cn.itcast.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//
public class Demo2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String str = "fio";   //����д���֣������Ѿ�д���ĵ������Ǻ��ֲ�����������ı�������
		try {
			//�����true����ʾ���ݻ�׷�ӵ��ļ�ĩβ��false��ʾ��д�����ļ�����
			fos = new FileOutputStream("D:\\a.txt",true);
			fos.write(str.getBytes());
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(fos != null) {
					fos.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		FileInputStream fis = null;
		StringBuilder sb = null;
		try {
			fis = new FileInputStream("D:\\a.txt");
			sb = new StringBuilder();
			int temp = 0;
			while((temp = fis.read())!=-1) {
				
				sb.append((char)temp);
			}
			System.out.println(sb);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
