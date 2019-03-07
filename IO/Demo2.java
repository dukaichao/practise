package cn.itcast.IO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//
public class Demo2 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		String str = "fio";   //可以写汉字，并且已经写入文档，但是汉字不能输出来，文本里面有
		try {
			//如果是true，表示内容会追加到文件末尾；false表示重写整个文件内容
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
