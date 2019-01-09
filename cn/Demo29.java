package cn;

public class Demo29 {
	public static void main(String[] args) {
		String s1 = "Du Kai chao ";
		String s2 = "du kai chao ";
		System.out.println("1:"+s1.charAt(1));         //返回字符串第二个字符
		System.out.println("2:"+s2.length());			//返回字符串时s2的长度
		System.out.println("3:"+s1.equals(s2));			//s1,s2字符串内容是否完全相等
		System.out.println("4:"+s1.equalsIgnoreCase(s2));//忽落大小写。s1,s2字符串内容是否完全相等
		System.out.println("5:"+s1.indexOf("Du"));   //字符串中查找是否有Du这个字符串，没有返回-1，找到返回其索引
		System.out.println("6:"+s1.startsWith("Mr.du"));     //字符串是否已括号里字符串开始
		System.out.println("7:"+s1.toLowerCase());    //返回一个字符串，将原来大写全部改为小写
		System.out.println("8:"+s1.toUpperCase());	//返回一个字符串，将原来小写全部改为大写
		System.out.println("9:"+s1.substring(0,10));   //返回一个字符串，从索引0到索引2
		System.out.println("10:"+s1.substring(0));    //返回字符串索引从2开始到结尾的字符
		System.out.println("11:"+s1.trim());     //返回一个字符串，该串删除原来字符串的开头和结尾空格
	}

}
