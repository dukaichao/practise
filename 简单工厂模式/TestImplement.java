import java.util.*;
public class TestImplement{
	public static void main(String[] args){
		Client client = new Client();
		System.out.println("请输入你要买电脑型号：");
		Scanner s = new Scanner(System.in);
		String str = s.next();
		Computer computer = ComputerFactory.getInstance(str);
		client.buyComputer(computer);
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

class ComputerFactory{
	public static Computer getInstance(String type){
		Computer computer = null;
		if(type.equals("mac")){
			return new Mac();
		}else if(type.equals("sur")){
			return new Surface();
		}
		return null;
	}
}