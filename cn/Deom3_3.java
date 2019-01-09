package cn;
//定义电影接口
interface Film{
	public void PerformanceFilm();
}
//定义电视剧接口
interface Teleplay{
	public void PerformanceTeleplay();
}
//定义唱歌接口
interface Sing{
	public void PerformanceSing();
}
class Artist implements Film,Teleplay,Sing{
	
	String name;
	public Artist(String name) {
		this.name = name;
		System.out.println("大家好，我是"+name);
	}
	@Override
	public void PerformanceSing() {
		// TODO Auto-generated method stub
		System.out.println("我能唱歌");
	}

	@Override
	public void PerformanceTeleplay() {
		// TODO Auto-generated method stub
		System.out.println("我能演电视剧");
	}

	@Override
	public void PerformanceFilm() {
		// TODO Auto-generated method stub
		System.out.println("我能演电影");
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
