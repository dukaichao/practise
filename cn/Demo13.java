package cn;

public class Demo13 {
	public static void main(String[] args) {
		Object obj = new String("大杜帝国第一代君主：Mr.Du");
		//obj.charAt(0);  无法调用，编译器认为obj是Object类型，而不是String类型
		/*   编写程序时，如果想调用运行时类型方法，只能进行强制类型转换。
		  不然通不过编译器的检查  */
		String str = (String) obj;
		System.out.println(str.charAt(2));
		System.out.println(str == obj);
		if(obj instanceof String)
			System.out.println("true");
		else
			System.out.println("false");
		}
}
