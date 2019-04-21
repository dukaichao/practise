package BIT.Reflex.reflect.reflectImplFactory;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-21
 * Time:20:40
 */
public class Test {
    public static void main(String[] args) {
        IFruit fruit = FruitFactory.getInstance("BIT.Reflex.reflect.reflectImplFactory.Apple");
        fruit.eat();
        IFruit fruit1 = FruitFactory.getInstance("BIT.Reflex.reflect.reflectImplFactory.Orange");
        fruit1.eat();
    }
}
