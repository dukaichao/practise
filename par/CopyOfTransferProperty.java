package mypratice;

public class CopyOfTransferProperty {
	static int i = 47;
	public void call() {
		System.out.println("���������Ҿ��ǲ˱�");
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
		System.out.println("��һ��ʵ����������ñ���i�Ľ���� "+c.i++);
		c.call();
		System.out.println("�ڶ���ʵ����������ñ���i�Ľ���� "+c1.i);
		c1.call();
	}

}
