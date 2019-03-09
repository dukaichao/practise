import java.util.Scanner;
public class TestGoods{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		Goods goods = new Goods("衬衫",125.5);
		System.out.println("请输入数量：");
		goods.setCount(s.nextInt());
		if(goods.getCount() > 5){
			goods.setDiscount(0.75);
		}else if(goods.getCount() > 2){
			goods.setDiscount(0.85);
		}else{
			goods.setDiscount(0.95);
		}
		String msg = goods.display1();
		System.out.println(msg);
		
		System.out.println("是否使用积分，100积分兑换1元.");
		while(true){
			int t = s.nextInt();
			if(t>goods.getIntegral()){
				System.out.println("看好，这是你的积分，看清再说消多少："+goods.getIntegral());
			}else{
				String msg2 = goods.display2(t);
				System.out.println(msg2);
				break;
			}
			
		}
	}
}

class Goods{
	private String name;
	private double prices;
	private double discount;
	private int count;
	private int integral;
	
	public Goods(String name,double prices){
		this.name = name;
		this.prices = prices;
		/*
		this.discount = discount;
		this.count = count;
		this.integral = integral;
		this.use = use;
		*/
	}
	
	public void setName(String name){
		this.name = name;
	}
	public void setPrices(double prices){
		this.prices = prices;
	}
	public void setDiscount(double discount){
		this.discount = discount;
	}
	public void setCount(int count){
		this.count = count;
	}
	public void setIntegral(int integral){
		this.integral = integral;
	}
	
	
	
	
	public String getName(){
		return this.name;
	}
	public double getPrices(){
		return this.prices;
	}
	public double getDiscount(){
		return this.discount;
	}
	public int getCount(){
		return this.count;
	}
	public int getIntegral(){
		return this.integral;
	}
	
	public int getIntegral(double prices,int count){
		this.integral += (int)prices * count;
		return this.integral;
	}
	public int cutIntegral(int integral){
		this.integral -= integral;
		return this.integral;
	}
	
	public double getSum(double prices,int count,double discount,int integral){
		double result = count*prices*discount - (double)integral/100;
		this.cutIntegral(integral);
		return result;
		
	}
	
	public String display1(){
		return "商品名称："+this.name + "\n"
			+"单价: "+this.prices + "\n"
			+"数量："+this.count+"\n"
			+"打折: "+this.discount+"\n"
			+"此次消费获取积分: "+this.getIntegral(this.prices,this.count)+"\n";
	}
	
	public String display2(int integral){
		return "总共消费："+this.getSum(this.prices,this.count,this.discount,integral)+"\n"
				+"剩余积分: "+this.integral;
	}
	
}