package mypratice;

public class CopyOfTransferProperty {
	static int i = 47;
	public void call() {
		System.out.println("啦啦啦，我就是菜逼");
		for(int i = 0;i<3;i++) {
			System.out.print(i+" ");
			if(i == 2)
				System.out.println("\n");
		}
	}
	public static void main(String [] args) {
		CopyOfTransferProperty c = new CopyOfTransferProperty();
		CopyOfTransferProperty c1 = new CopyOfTransferProperty();
		
		System.out.println(CopyOfTransferProperty.i);
		c1.i = 60;
		System.out.println(CopyOfTransferProperty.i); 
		System.out.println("第一个实例化对象调用变量i的结果： "+c.i++);
		c.call();
		System.out.println("第二个实例化对象调用变量i的结果： "+c1.i);
		c1.call();
	}

}
