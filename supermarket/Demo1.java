package supermarket;

import java.util.Scanner;

class User{
	String name;
	String password;
	public User(String name, String password) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.password = password;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPassword() {
		return password;
	}
	
}
public class Demo1 {
	public static void main(String [] args) {
		print_menu();
		User[] u = new User[10];
		Scanner scanner = new Scanner(System.in);
		while(true) {
			String c = scanner.next();
			if(c.equals("A")) {
				System.out.println("注册");
				String n = scanner.next();
				System.out.println("�������룺");
				String p = scanner.next();
				u[0].setName(n);
				u[0].setPassword(p);
				}
			else if(c.equals("B")) {
					u[0].getName();
					u[0].getPassword();
				}
			else{
				System.exit(0);
			}
			print_menu();
			c = scanner.next();
		}
	}
	public static void print_menu() {
		System.out.println("**********��ѡ����*********");
		System.out.println("*A:ע注册                                         ");
		System.out.println("*B:登录                            ");
		System.out.println("*C:返回                                    ");
		
	}
}
