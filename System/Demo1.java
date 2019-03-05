package dkc.System;

import java.util.Properties;

/*
 	System类包含几个有用的类字段和方法。 它不能被实例化。
 	
 	 arraycopy(Object src, int srcPos, Object dest, int destPos, int length) 
 	 	将指定源数组中的数组从指定位置复制到目标数组的指定位置。
 	 src:源数组
 	 srcPos：源数组的小标
 	 dest:新数组
 	 destPos：新数组小标
 	 length：要复制数组元素的个数
 	 自我总结：src.length >= length + srcPos  &&  dest.length >= destPos + length
	
	currentTimeMillis() 返回当前时间（以毫秒为单位）
	
	exit(int status)  终止当前运行的Java虚拟机  如果参数是0表示正常退出，非0表示异常退出
	
	gc()   运行垃圾回收器。

	getenv(String name) 根据环境变量的名字获取环境变量的值。
	
	getProperties() 确定当前的系统属性。
	
	getProperty(key)   根据系统的属性名获取对应的属性值
 */
class Preson{
	String name;
	public Preson(String name) {
		this.name = name;
	}
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println(this.name+"被回收了...");
	}
	
}
public class Demo1 {
	public static void main(String [] args) {
		int []srcArr = {10,12,14,16,18,20};
		int []destArr = new int[5];
		System.arraycopy(srcArr, 3, destArr, 2, 3);
		long l1 = System.currentTimeMillis();
		for(int i = 0;i < destArr.length;i++) {
				System.out.println(destArr[i]);
		}
		long l2 = System.currentTimeMillis();
		System.out.println((l2-l1));
		System.out.println("环境变量："+System.getenv("JAVA_HOME"));
		/*for(int i = 0 ; i < 4 ; i++) {
			new Preson("狗娃"+i);
			System.gc();
		}
		Properties p = System.getProperties();
		p.list(System.out);*/
		String value = System.getProperty("os.name");   //根据系统的属性名获取对应的属性值
		System.out.println("当前系统:"+value);
	}
}
