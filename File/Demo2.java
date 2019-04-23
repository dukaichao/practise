package cn.itcast.File;

import java.io.File;
import java.io.IOException;

/*
	创建：
		creatNewFile()   在指定位置创建一个空文件夹，成功返回true，如果存在就返回false
		mkdir()          在指定位置创建一个目录，这只会创建最后一个目录，如果上级目录不存在就抛出异常
		mkdirs()         创建多个目录
		renameTo(File dest)   重命名文件
 */
public class Demo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\dd.txt");
		file.createNewFile();
		System.out.println(file.getName());
		
		File file1 = new File("F:\\aa.txt");
		System.out.println(file1.mkdir());
		
//		System.out.println(file.renameTo(file1));
		
	}
}
