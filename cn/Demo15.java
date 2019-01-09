package cn;

public class Demo15 {
	public static void main(String[] args) {
		Object obj = new String("大杜帝国第一代君主：Mr.Du");
		Object obj1 = new StringBuffer("大杜帝国第一代君主：Mr.Du");
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
