package ojbk;

import java.util.Arrays;

public class Demo4 {
	public static void main(String[] args) {
		Object []a1 = {"Mr.Du","man",20,"2018-8-3"};
		Object []a2 = {"Mrs.Zheng","woman",21,"2018-8-1"};
		Object []a3 = {"Mr.Jing","woman",19,"2018-8-4"};
		Object []a4 = {"Mr.Liu","woman",21,"2018-8-2"};
		Object[][] emps = new Object[4][];
		emps[0] = a1;
		emps[1] = a2;
		emps[2] = a3;
		emps[3] = a4;
		System.out.println(Arrays.toString(emps[0]));
		}
	
}
