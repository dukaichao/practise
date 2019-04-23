package cn.itcast.File;

import java.io.File;
import java.io.IOException;
/*
	File��ķ�����
		File f = new File("a.txt");
		f.createNewFile();  �����ļ�Ϊa.txt
		1.exists()     �ж�file�Ƿ����
		2.delete()   ɾ���ɴ˳���·������ʾ���ļ���Ŀ¼
		3.getPath()    �����ļ���Ŀ¼·��  ����String����
		4.isDirectory() �ж�File�Ƿ���Ŀ¼
		5.isFile()     �ж�File�Ƿ����ļ�
		6.lastModified()   ����File����޸�ʱ��
		7.length()      ����File��С
		8.getName()    �����ļ���
 */
public class Demo1 {
	public static void main(String[] args) throws IOException {
		System.out.println(System.getProperty("User.dir"));
		File f = new File("a.txt");
		f.createNewFile();
		
		File f2 = new File("f:/b.txt");   //��f�̴���b.txt�ĵ�
		f2.createNewFile();
		//f2.delete();          //ɾ��b.txt�ĵ�
		System.out.println(f2);
		File f3 = new File("f://d.txt");
		f3.createNewFile();   //��f�̴���d.txt�ĵ�
		
		System.out.println("File�Ƿ���ڣ�"+f3.exists());
		System.out.println("File�Ƿ����Ŀ¼��"+f.isDirectory());
		System.out.println("�ж�File�Ƿ����ļ�:"+f.isFile());
		
		String str = f3.getPath();   
		System.out.println("�����ļ���Ŀ¼·����"+str);
		String str1 = f3.getName();
		System.out.println("�����ļ�����"+str1);
		long t = f3.lastModified();
		System.out.println("File����޸�ʱ��:"+t);
	}
}
