package mypratice;
import cm.Demo2_Student;

/*
 * 需求：使用Java描述一个汽车类，具备属性有名字，颜色，车轮数，还具备跑的行为，如果轮子数等于4，可以正常跑
 * ，少于四个送修理厂修理，修车厂修理后，轮子补回四个，那么可以继续跑
 * 修车厂具备的属性：名字，地址，电话，具备的行为：修车
 */
class Car{
	String name;
	String color;
	int wheel;
	
	public void run() {
		if(wheel == 4) {
			System.out.println(name+wheel+"个轮子完好，可以正常出发");
		}
		else {
			System.out.println("车子换了，拉修车厂修理吧！");
		}
	}
}


class RepairCar{
	String name;
	String phone;
	String address;
	public void repair(Car c) {
		if(c.wheel == 4) {
			System.out.println("车子好着，给小费！");
		}else {
			c.wheel = 4;
			System.out.println("修好了，给钱，1000");
		}
		
	}
	
}
public class Demo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Car c = new Car();
		c.name = "bwm";
		c.color = "黑色";
		c.wheel = 4;
		for(int i = 0; i<100; i++) {
			c.run();
		}
		c.wheel = 3;
		c.run();
		//创建修车厂对象
		RepairCar f = new RepairCar();
		f.name = "杜氏集团之修车厂";
		f.address = "上海虹桥机场对面向右走1000m";
		f.phone = "13992065484";
		f.repair(c);
		c.run();
		//使用匿名对象详情看Demo1类
		RepairCar f1 =new RepairCar();
		f1.repair(new Car());  */
		
	}

}
