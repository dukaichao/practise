package cn.itcast.dkc;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//多线程描述
class SubThread extends Thread{
	public void run() {
		if(Thread.currentThread().getName().equals("线程一")) {
			for(int i = 0;i<50;i++) {
				show();
			}
		}
		else {
			for(int i = 0;i<100;i++) {
				show();
			}
		}
	}
	static Object obj = new Object();
	private Lock lock = new ReentrantLock();
	void show() {
		/*synchronized(obj) {
			System.out.println(Thread.currentThread().getName()+"正在执行");
		}*/
		lock.lock();
		System.out.println(Thread.currentThread().getName()+"正在执行");
		lock.unlock();
	}
}
public class PracticeThread3_4 {
	public static void main(String[] args) {
		SubThread st1 = new SubThread();
		SubThread st2 = new SubThread();
		
		st1.setName("线程一");
		st2.setName("线程二");
		
		st1.setPriority(10);
		st2.setPriority(5);
		
		st1.start();
		st2.start();
	}
}
