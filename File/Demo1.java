package cn.itcast.File;

import java.io.File;
import java.io.IOException;
/*
	File类的方法：
		File f = new File("a.txt");
		f.createNewFile();  创建文件为a.txt
		1.exists()     判断file是否存在
		2.delete()   删除由此抽象路径名表示的文件或目录
		3.getPath()    返回文件的目录路径  返回String类型
		4.isDirectory() 判断File是否是目录
		5.isFile()     判断File是否是文件
		6.lastModified()   返回File最后修改时间
		7.length()      返回File大小
		8.getName()    返回文件名
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("User.dir"));
		File f = new File("a.txt");
		f.createNewFile();
		
		File f2 = new File("f:/b.txt");   //在f盘创建b.txt文档
		f2.createNewFile();
		//f2.delete();          //删除b.txt文档
		System.out.println(f2);
		File f3 = new File("f://d.txt");
		f3.createNewFile();   //在f盘创建d.txt文档
		
		System.out.println("File是否存在："+f3.exists());
		System.out.println("File是否存在目录："+f.isDirectory());
		System.out.println("判断File是否是文件:"+f.isFile());
		
		String str = f3.getPath();   
		System.out.println("返回文件的目录路径："+str);
		String str1 = f3.getName();
		System.out.println("返回文件名："+str1);
		long t = f3.lastModified();
		System.out.println("File最后修改时间:"+t);
	}
}
