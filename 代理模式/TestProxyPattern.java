/*
	代理模式：两个子类共同实现一个接口，其中一个子类负责真实业务实现，另外一个子类完成辅助真实业务主题的操作。
*/
public class TestProxyPattern{
	public static void main(String[] args){
		IBuy buy = new ProxyConsumer(new RealConsumer());
		buy.buyBuyBuy();
	}
}

interface IBuy{
	void buyBuyBuy();
}

class RealConsumer implements IBuy{
	public void buyBuyBuy(){
		System.out.println("买一个鸡儿");
	}
}

class ProxyConsumer implements IBuy{
	private IBuy buy;
	public ProxyConsumer(IBuy buy){
		this.buy = buy;
	}
	//买前操作
	public void buyBefore(){
		System.out.println("买个鸡儿得排十个小时队，那就排呗...");
	}
	//买操作
	public void buyBuyBuy(){
		this.buyBefore();
		this.buy.buyBuyBuy();
		this.buyAfter();
	}
	//买后操作
	public void buyAfter(){
		System.out.println("在要点辛苦费吧，排了十个小时...");
	}
	
}