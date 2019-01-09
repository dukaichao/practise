package cn;
abstract class Instrument{
	String name;
	public Instrument(String name) {
		this.name = name;
	}
	abstract public void makeSound();
}
//���������
class Erhu extends Instrument{
	
	public Erhu(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println(name+"����������"+name);
		
	}
	
}
//���������
class Violin extends Instrument{
	
	public Violin(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println(name+"����������"+name);
		
	}
	
}
//����С������
class Paino extends Instrument{
	
	public Paino(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void makeSound() {
		// TODO Auto-generated method stub
		System.out.println(name+"����������"+name);
	}
	
}
//����������
class Musician{
	public void play(Instrument i) {
		i.makeSound();
	}
}
public class Deom3_2 {
	public static void main(String[] args) {
		Instrument e = new Erhu("����");
		Instrument p = new Erhu("����");
		Instrument v = new Erhu("С����");
		Musician m = new Musician();
		m.play(e);
		m.play(p);
		m.play(v);
	}
	
}
