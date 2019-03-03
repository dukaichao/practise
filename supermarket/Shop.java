package supermarket;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



/*
 	���й���ϵͳ
 	��ɣ�
 		1.��Ʒ���ݵĳ�ʼ��
 		2.�û��Ĳ˵�ѡ��
 		3.����ѡ��ִ�в�ͬ�Ĺ�
 			3.1	Read  	读取
 			3.2	Creat   创建
 			3.3 Update 	更新
 			3.4 Delete	删除
 */
public class Shop {
	public static void main(String[] args) {
		ArrayList<FruitItem> array = new ArrayList<FruitItem>();    //�õ�����
		init(array);
		print_menu();
		System.out.println("请输入你要进行的操作");
		Scanner s = new Scanner(System.in);
		while(true) {
			int n = s.nextInt();
			switch(n) {
				case 1:
					Read(array);
					break;
				case 2:
					creat(array);
					break;
				case 3:
					Update(array);
					break;
				case 4:
					Delete(array);
					break;
				default:
					System.out.println("请重新输入");
			}
			print_menu();
		}
	}
//	初始化
	private static void init(ArrayList<FruitItem> array) {
		array.add(new FruitItem("香蕉", 110, 3.50, 1000));
		array.add(new FruitItem("苹果", 111, 2.99, 1500));
		array.add(new FruitItem("梨", 115, 3.50, 4000));
		array.add(new FruitItem("荔枝",120,4.50,1000));
		array.add(new FruitItem("shi", 112, 0.50, 500));
		array.add(new FruitItem("草莓",119,12.5,1750));
		Read(array);
		System.out.println();
	}
//	1.  Read  	读取
	private static void Read(ArrayList<FruitItem> array) {
		Iterator<FruitItem> it = array.iterator();
		System.out.println("目录为:>");
		while(it.hasNext()) {
			FruitItem f = it.next();
			System.out.println(f.ID+": "+f);
		}
	}
//	2.	Creat   创建
	private static void creat(ArrayList<FruitItem> array) {
		System.out.println("请输入添加物品的个数");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i = 0;i<n;i++) {
			System.out.println("请输入名称:>");
			String name = s.next();
			System.out.println("请输入ID:>");
			int iD = s.nextInt();
			System.out.println("请输入价格:>");
			double price =  s.nextDouble();
			System.out.println("请输入重量:>");
			int number = s.nextInt();
			array.add(new FruitItem(name, iD, price, number));
		}
		
	}
//	3. 	Update  更新
	private static void Update(ArrayList<FruitItem> array) {
		System.out.println("请输入要修改的编号");
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		for(int i = 0;i<array.size();i++) {
			if(array.get(i).ID == n) {
				System.out.println("要修改商品原信息为:"+array.get(i));
				System.out.println("请输入名称:>");
				String name = s.next();
				System.out.println("请输入ID:>");
				int iD = s.nextInt();
				System.out.println("请输入价格:>");
				double price =  s.nextDouble();
				System.out.println("请输入重量:>");
				int number = s.nextInt();
				array.set(i,new FruitItem(name, iD, price, number));
			}
		}
	}
//	4. 	Delete	删除
	private static void Delete(ArrayList<FruitItem> array) {
		System.out.println("请输入要删除的编号");
		Scanner s =new Scanner(System.in);
		int n =s.nextInt();
		for(int i = 0;i<array.size();i++) {
			if(array.get(i).ID == n) {
				array.remove(i);
			}
		}
	}
	//菜单
	private static void print_menu() {
		System.out.println("*********************************************");
		System.out.println("*          欢迎来到duy的水果超市                                         *");
		System.out.println("*                                           *");
		System.out.println("* 1.  	Read  	读取                             				*");
		System.out.println("* 2.	Creat  	创建                                  	    	*");
		System.out.println("* 3. 	Update  更新                                  		    *");
		System.out.println("* 4. 	Delete	删除                                       		    *");
		System.out.println("*                                           *");
		System.out.println("*********************************************");
		
	}
}
