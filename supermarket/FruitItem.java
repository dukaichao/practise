package supermarket;

import java.io.Serializable;


public class FruitItem implements Serializable{
	//名称
	String name;
	//编号
	int ID;
	//价格
	double price;
	//数量
	int number;
	public FruitItem(String name, int iD, double price, int number) {
		this.name = name;
		ID = iD;
		this.price = price;
		this.number = number;
	}
	@Override
	public String toString() {
		return "[name:" + name + " ID:" + ID + " price:" + price + " number:" + number + "]";
	}
	
}
