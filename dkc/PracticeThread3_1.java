package cn.itcast.dkc;
//���߳������𳵹�Ʊ
class Windows implements Runnable{
	int ticket = 100;
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
					System.out.println("Ʊ��Ϊ��"+ticket);
					System.out.println(Thread.currentThread().getName()+"��Ʊ��Ʊ��Ϊ��"+ticket--);
				}
			}
		}
	}
}
public class PracticeThread3_1 {
	public static void main(String[] args) {
		Windows w = new Windows();
		Thread th1 = new Thread(w,"DZ");
		Thread th2 = new Thread(w,"ZY");
		Thread th3 = new Thread(w,"ZT");
		Thread th4 = new Thread(w,"MG");
		Thread th5 = new Thread(w,"YY");
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
	}
}
