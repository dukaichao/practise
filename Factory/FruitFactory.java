package BIT.Reflex.reflect.Factory;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-21
 * Time:20:27
 */
public class FruitFactory {
    private FruitFactory(){}
    public static IFruit getInstance(String className){
        if("apple".equals(className)){
            return new Apple();
        }
        return null;
    }
}
