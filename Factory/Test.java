package BIT.Reflex.reflect.Factory;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-21
 * Time:20:27
 */
public class Test {
    public static void main(String[] args) {
        IFruit fruit = FruitFactory.getInstance("apple");
        fruit.eat();
    }
}
