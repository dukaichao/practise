package cn.itcast.dkc;
//多线程描述火车购票
class Window extends Thread{
	static int ticket = 100;
	public void run() {
		show();
	}
	static Object obj = new Object();
	void show() {
		while(true) {
			synchronized(obj) {
				if(ticket>0) {
					try {
						Thread.sleep(20);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("票数为："+ticket);
					System.out.println(Thread.currentThread().getName()+"售票，票号为："+ticket--);
				}
			}
		}
	}
}
public class PracticeThread3_1_1 {
	public static void main(String[] args) {
		Window w1 = new Window();
		Window w2= new Window();
		Window w3 = new Window();
		Window w4 = new Window();
		Window w5 = new Window();
		
		w1.setName("DZ");
		w2.setName("YY");
		w3.setName("MG");
		w4.setName("ZY");
		w5.setName("ZT");
		
		w1.start();
		w2.start();
		w3.start();
		w4.start();
		w5.start();
	}
}