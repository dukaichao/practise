public class TestAbstractFactory{
	public static void main(String[] args){
		Client client = new Client();
		ProductFactory factory = new MacFactory();
		Computer computer = factory.creatComputer();
		OperateSystem osys = factory.systemCreat();
		client.buyComputer(computer);
		client.useSystem(osys);
	}
}

class Client{
	public void buyComputer(Computer computer){
		computer.printComputer();
	}
	
	public void useSystem(OperateSystem sys){
		sys.prinSystem();
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

interface OperateSystem{
	void prinSystem();
}

class MacSystem implements OperateSystem{
	public void prinSystem(){
		System.out.println("苹果系统，运行贼快");
	}
}

class SurSystem implements OperateSystem{
	public void prinSystem(){
		System.out.println("window系统，运行不行，太lowb");
	}
}

interface ProductFactory{
	Computer creatComputer();
	OperateSystem systemCreat();
}

class MacFactory implements ProductFactory{
	public Computer creatComputer(){
		return new Mac();
	}
	public OperateSystem systemCreat(){
		return new MacSystem();
	}
}

class SurFactory implements ProductFactory{
	public Computer creatComputer(){
		return new Surface();
	}
	public OperateSystem systemCreat(){
		return new SurSystem();
	}
}