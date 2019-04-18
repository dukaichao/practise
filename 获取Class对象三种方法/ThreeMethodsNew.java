package BIT.Reflex.reflect;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-18
 * Time:23:18
 */
/*
    三种方法获取Class类对象
        1.对象名.getClass()
        2.类名.Class
        3.Class.forName("包名+类名")

    反射获取实例化对象：
        Class对象名.newInstance()
    Class对象名.getName()获取类的名字：包名+类名
    Class对象名.getSimpleName()获取类的名字：类名


 */
public class ThreeMethodsNew {

    public static void main(String[] args) {
        code1();
        code2();
        code3();
    }

    //方法一：
    public static void code1(){
        Man man = new Man();
        Class classz = man.getClass();

        //输出类名
        System.out.println(classz.getSimpleName());
    }
    //方法二
    public static void code2(){
        Class classz = Man.class;
        System.out.println(classz.getName());
        try {
            ((Man)classz.newInstance()).m();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
    //方法三
    public static void code3(){
        Class classz = null;
        try {
            classz = Class.forName("BIT.Reflex.reflect.Man");
            ((Man)classz.newInstance()).m();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        System.out.println(classz.getSimpleName());
    }
}
class Man{
    public void m(){
        System.out.println("abc");
    }

    @Override
    public String toString() {
        return "Man{}";
    }
}

