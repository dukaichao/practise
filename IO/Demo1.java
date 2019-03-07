package cn.itcast.IO;

import java.io.FileInputStream;

public class Demo1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\a.txt");
			StringBuilder sb = new StringBuilder();
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
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
