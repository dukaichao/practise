package cn.itcast.dkc;
//多线程描述火车购票
class Printer{
	private static int index = 1;
	public synchronized void print(int i) {
		while(index%3 == 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(i);
		this.notifyAll();
		index++;
	}
	
	public synchronized void print(char c) {
		while(index%3 != 0) {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(c);
		this.notifyAll();
		index++;
	}
}

class NumberPrint extends Thread{
	private Printer p;
	public NumberPrint(Printer p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}
	
	public void run() {
		for(int i = 1;i<53;i++) {
			p.print(i);
		}
	}
}
class LetterPrint extends Thread{
	private Printer p;
	public LetterPrint(Printer p) {
		// TODO Auto-generated constructor stub
		this.p = p;
	}
	public void run() {
		for(char i = 'A';i<='Z';i++) {
			p.print(i);
		}
	}
}
public class PracticeThread3_2 {
	public static void main(String[] args) {
		Printer p = new Printer();
		NumberPrint np = new NumberPrint(p);
		LetterPrint lp = new LetterPrint(p);
		np.start();
		lp.start();
	}
}
