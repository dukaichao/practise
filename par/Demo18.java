package mypratice;
/*
 * �ӿ�
 * 
 * �ӿڶ����ʽ
 * 			interface �ӿ���{
 * 
 * 			}
 * 	�ӿ�Ҫע������
 * 		1.�ӿ���һ���������
 * 		2.�ӿ��еĳ�Ա����Ĭ�����η�Ϊpublic static final,��ôҲ����˵�ӿ��еĳ�Ա�������ǳ���
 * 		3.�ӿ��еķ������ǳ���ķ�����Ĭ��Ϊ��public abstract
 * 		4.�ӿڲ��ܴ�������.
 * 		5.�ӿ���û�й��췽����.
 * 		6.�ӿ��Ǹ���ȥʵ��ʹ�õģ��ǳ�����ʵ��һ���ӿڵ�ʱ�򣬱���Ҫ�ѽӿ������з���ʵ��
 * 	ʵ�ֽӿڵĸ�ʽ��
 * 		class  ����  implements �ӿ�����
 * 
 * �ӿڵ����ã�
 * 		1.��չ����
 * 		2.���Զ���Լ���淶
 * 		3.����Ľ���
 * 
 * 
 * ����ӿ�Ҫע������
 * 		1.�ǳ�����ʵ��һ���ӿ�ʱ������Ҫ�ѽӿڵ����з�����ʵ��
 * 		2.������ʵ��һ���ӿ�ʱ������ʵ��Ҳ���Բ�ʵ�ֽӿ��еķ���
 * 		3.һ�������ʵ�ֶ���ӿ�
 * 
 */
//��ͨ��Ǧ����
class Pencil{
	String name;
	 public Pencil(String name) {
		 this.name = name;
	 }
	 public void write() {
		 System.out.println(name+"д��д.......");
	 }
}
//��Ƥ�ӿ�
interface Eraser{
	public void remove();
}
//����Ƥ��Ǧ��
class PencilWithEraser extends Pencil implements Eraser{

	public PencilWithEraser(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		System.out.println("Ϳ��");
	}
	
}
public class Demo18 {
	public static void main(String[] args) {
		PencilWithEraser p = new PencilWithEraser("2B");
		p.write();
		p.remove();
	}
}
