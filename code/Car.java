public class Car{
	String name;
	String color;
	double prices;
	//this   该类实例化对象
	public Car(String name,String color){
		this.name = name;
		this.color = color;
	}
	
	public double getPrices(){
		return this.prices;
	}
	
	public void setPrices(double prices){
		this.prices = prices;
	}
	
	public void run(){
		System.out.println("前方车辆请注意,前方车辆请注意,"+this.name+"来了！"+this.name+"来了！");
	}
	
	public String toString(){
		return "车名："+this.name+" 颜色："+this.color;
	}
	
	public static void main(String[] args){
		Car[] car = new Car[3];
		car[0] = new Car("宝马","黑色");
		car[1] = new Car("大奔","红色");
		car[2] = new Car("五菱宏光","白色");
		car[0].setPrices(100.25);
		car[1].setPrices(150.25);
		car[2].setPrices(4.25);
		System.out.println(car[0]);
		System.out.println(car[1]);
		System.out.println(car[2]);
		car[2].run();
		
		
	}
}