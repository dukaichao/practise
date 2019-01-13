package cn.itcast.day18;

public class Person {
	
		private String name;
		int age;
		public Person(String name,int age) {
			this.name = name;
			this.age = age;
		}
		public String toString() {
			return "["+name + "," + age+"]";
		}
		@Override
		public boolean equals(Object obj) {
		Person p = (Person)obj;
		return this.age == p.age;
		}
		//java规范：一般重写equals方法必须重写hashCode方法
		public int hashCode() {
		// TODO Auto-generated method stub
		return this.age;
		}
}
