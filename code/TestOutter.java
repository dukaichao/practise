class Outter{
	private static String msg = "DEW";
	
	class Inner{
		private String msg1 = "DEW";
		public void print(){
			//System.out.println(msg);
		}
	}
	public void test(){
		Inner in = new Inner();
		System.out.println(in.msg1);
	}
}

public class TestOutter{
	public static void main(String[] args){
		Outter out = new Outter();
		
		out.test();
	}
}
