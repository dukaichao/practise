package cn.dkc_1123;

import javax.management.RuntimeErrorException;

interface d{
	int count = 20;
}
public  class AA implements d{
	private static int count;
	public static void main (String[] args) throws Exception{
		/*try {
			System.out.print("a");
			throw new  RuntimeException();
		}catch(Exception s){
			System.out.print("c");
		}finally {
			System.out.print("d");
		}
		System.out.print("e");*/
		/*Integer i = new Integer(3);
		int t = 3;
		System.out.println(i == t);*/
		
		/*System.out.println(++count);*/
		/*try {
			throw new RuntimeException();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("哈哈");
		}
		System.out.println("菜鸡锋");*/
		System.out.println(new AA().f());
	}
	public int c(char ch,int i,double d) {
		return ch*(int)d;
	}
	public int f() {
		int x = 1;
		try {
			return x++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}finally {
			++x;
		}
		return x;
	}
}
