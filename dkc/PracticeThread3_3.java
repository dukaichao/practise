package cn.itcast.dkc;


import java.util.Random;

//多线程描述汽车过站
class CarCross implements Runnable{
	private int NumberCarCross = 0;
	public void run() {
		cross();
	}
	static Object obj = new Object();
	void cross() {
		synchronized(obj) {
			try { 
	            Thread.sleep(5000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }
			NumberCarCross++;
	        System.out.println(Thread.currentThread().getName()+
	        		"通过了山洞，这是第"+NumberCarCross+"个用户");        
		}
	}
	
}
public class PracticeThread3_3 {
	public static void main(String[] args) {
		CarCross cc = new CarCross();
		Random r = new Random();
		Thread th1 = new Thread(cc,"DD");
		Thread th2 = new Thread(cc,"DZ");
		Thread th3 = new Thread(cc,"DA");
		Thread th4 = new Thread(cc,"DS");
		Thread th5 = new Thread(cc,"DX");
		
		th1.start();
		th2.start();
		th3.start();
		th4.start();
		th5.start();
	}
}
