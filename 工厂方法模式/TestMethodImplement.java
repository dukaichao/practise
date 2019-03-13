import java.util.*;
/**
	工厂方法模式
	优点：1.降低代码耦合度，对象的生成交个子类去实现
		  2.实现了开放封闭原则，每次添加产品不需要修改原有代码
	缺点：1.增加代码量，每个具体商品需要一个具体工厂
		  2.当增加抽象产品也就是添加一个其他产品族需要修改工厂违背(OCP)
*/
public class TestMethodImplement{
	public static void main(String[] args){
		Client client = new Client();
		ComputerFactory factory = new SufaceFactory();
		client.buyComputer(factory.createComputer());
	}
}
 
class Client{
	public void buyComputer(Computer computer){
		computer.printComputer();
	}
}

interface Computer{
	void printComputer();
}

class Mac implements Computer{
	public void printComputer(){
		System.out.println("苹果是个好东西，可是我买不起啊!");
	}
}

class Surface implements Computer{
	public void printComputer(){
		System.out.println("微软除了便宜，其他都不抵苹果啊!");
	}
}

interface ComputerFactory{
	Computer createComputer();
}

class SufaceFactory implements ComputerFactory{
	public Computer createComputer(){
		return new Surface();
	}
}

class MacFactory implements ComputerFactory{
	public Computer createComputer(){
		return new Mac();
	}
}