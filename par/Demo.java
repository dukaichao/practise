package mypratice;
import cm.Demo2_Student;

/*
 * ����ʹ��Java����һ�������࣬�߱����������֣���ɫ�������������߱��ܵ���Ϊ���������������4������������
 * �������ĸ������������޳�����������Ӳ����ĸ�����ô���Լ�����
 * �޳����߱������ԣ����֣���ַ���绰���߱�����Ϊ���޳�
 */
class Car{
	String name;
	String color;
	int wheel;
	
	public void run() {
		if(wheel == 4) {
			System.out.println(name+wheel+"��������ã�������������");
		}
		else {
			System.out.println("���ӻ��ˣ����޳�������ɣ�");
		}
	}
}


class RepairCar{
	String name;
	String phone;
	String address;
	public void repair(Car c) {
		if(c.wheel == 4) {
			System.out.println("���Ӻ��ţ���С�ѣ�");
		}else {
			c.wheel = 4;
			System.out.println("�޺��ˣ���Ǯ��1000");
		}
		
	}
	
}
public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Car c = new Car();
		c.name = "bwm";
		c.color = "��ɫ";
		c.wheel = 4;
		for(int i = 0; i<100; i++) {
			c.run();
		}
		c.wheel = 3;
		c.run();
		//�����޳�������
		RepairCar f = new RepairCar();
		f.name = "���ϼ���֮�޳���";
		f.address = "�Ϻ����Ż�������������1000m";
		f.phone = "13992065484";
		f.repair(c);
		c.run();
		//ʹ�������������鿴Demo1��
		RepairCar f1 =new RepairCar();
		f1.repair(new Car());  */
		
	}

}
