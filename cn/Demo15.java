package cn;

public class Demo15 {
	public static void main(String[] args) {
		Object obj = new String("��ŵ۹���һ��������Mr.Du");
		Object obj1 = new StringBuffer("��ŵ۹���һ��������Mr.Du");
		if(obj instanceof String) {
			String str = (String) obj;
			System.out.println(str.charAt(2));
			System.out.println(str == obj);
		}else if(obj instanceof StringBuffer){
			StringBuffer Sb = (StringBuffer) obj;
			System.out.println(Sb.charAt(3));
		}
	}
}
