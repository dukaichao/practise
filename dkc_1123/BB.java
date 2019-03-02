package cn.dkc_1123;
class Super {
	public Super getLenght() { 
		return this;
	}
}

class Sub extends Super {
	public void getLenght(String s) { 
		
	}
}
public class BB extends Thread implements Runnable{ 
	/*public static void main(String args[]){ 
		String str=new String("good"); 
		char[] ch={'a','b','c'}; 
		//BB ex=new BB(); 
		change(str,ch); 
		System.out.print(str+" and "); 
		System.out.print(ch); 
	} 
	public static void change(String str,char ch[]){ 
		str="test ok"; 
		ch[0]='g'; 
	}*/
	/*public void run(){ 
		System.out.println("this is run()"); 
		} 
	public static void main(String[] args) {
		Thread t=new Thread(new BB()); 
		t.start();
	}*/
	/*public static void main(String[] args) {
		int[] arr = new int[10];
		System.out.println(arr[1]);
	}*/
	/*public void run() {
		ping();
	}
	int arr[]=new int[10];*/
	public void a() {
		this.c();
	}
	public void b() {
		this.a();
	}
	public static void c() {
		new BB().a();
	}
	public static void main(String[] args) {
		/*char c = 'a';
		switch(c) {
		case 'a':
			System.out.println("a");
		default:
			System.out.println("default");
		}*/
		/*char c='a';
		char b = 97;
		char d=new Character('a');
		System.out.println(Math.random());*/
		//int n[]={0,1,2,3,4}; int sum=0;
		/*try { 
			 for(int i=1;i<6;i++) sum=sum+n[i];
			 System.out.println("sum="+sum); 
		}catch(ArrayIndexOutOfBoundsException e) { 
			System.out.println("数组越界"); 
		}finally{
			System.out.println("程序结束");
		}*/
		/*Thread th = new Thread() {
			public void run() {
				ping();
			}
		};
		th.start();
		System.out.println("ping");*/
		/*char c = 'a';
		int i = 130;
		float f=i;
		byte b=(byte)i;
		System.out.println(c+","+i+","+f+","+b);*/
		
	}
	public static void ping() {
		System.out.println("pong");
	}
} 

