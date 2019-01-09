package cn;
abstract class Instrument{
	String name;
	public Instrument(String name) {
		this.name = name;
	}
	abstract public void makeSound();
}
//定义二胡类
class Erhu extends Instrument{
	
	public Erhu(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println(name+"家正在演奏"+name);
		
	}
	
}
//定义钢琴类
class Violin extends Instrument{
	
	public Violin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println(name+"家正在演奏"+name);
		
	}
	
}
//定义小提琴类
class Paino extends Instrument{
	
	public Paino(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println(name+"家正在演奏"+name);
	}
	
}
//定义乐手类
class Musician{
	public void play(Instrument i) {
		i.makeSound();
	}
}
public class Deom3_2 {
	public static void main(String[] args) {
		Instrument e = new Erhu("二胡");
		Instrument p = new Erhu("钢琴");
		Instrument v = new Erhu("小提琴");
		Musician m = new Musician();
		m.play(e);
		m.play(p);
		m.play(v);
	}
	
}
