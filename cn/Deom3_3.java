package cn;
//�����Ӱ�ӿ�
interface Film{
	public void PerformanceFilm();
}
//������Ӿ�ӿ�
interface Teleplay{
	public void PerformanceTeleplay();
}
//���峪��ӿ�
interface Sing{
	public void PerformanceSing();
}
class Artist implements Film,Teleplay,Sing{
	
	String name;
	public Artist(String name) {
		this.name = name;
		System.out.println("��Һã�����"+name);
	}
	@Override
	public void PerformanceSing() {
		// TODO Auto-generated method stub
		System.out.println("���ܳ���");
	}

	@Override
	public void PerformanceTeleplay() {
		// TODO Auto-generated method stub
		System.out.println("�����ݵ��Ӿ�");
	}

	@Override
	public void PerformanceFilm() {
		// TODO Auto-generated method stub
		System.out.println("�����ݵ�Ӱ");
	}
	
}
public class Deom3_3{
	public static void main(String[] args) {
		Artist a = new Artist("Mr.Du");
		a.PerformanceFilm();
		a.PerformanceTeleplay();
		a.PerformanceSing();
	}
}
