package cn.itcast.File;

import java.io.File;
import java.io.IOException;

/*
	������
		creatNewFile()   ��ָ��λ�ô���һ�����ļ��У��ɹ�����true��������ھͷ���false
		mkdir()          ��ָ��λ�ô���һ��Ŀ¼����ֻ�ᴴ�����һ��Ŀ¼������ϼ�Ŀ¼�����ھ��׳��쳣
		mkdirs()         �������Ŀ¼
		renameTo(File dest)   �������ļ�
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
