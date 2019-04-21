package BIT.Reflex.reflect.reflectImplFactory;

/**
 * Created With IntelliJ IDEA.
 * Descriptions:
 * User:Mr.Du
 * Date:2019-04-21
 * Time:20:35
 */
public class FruitFactory {
    private FruitFactory(){}
    //参数为类名
    public static IFruit getInstance(String className){
        IFruit fruit = null;
        try {
            fruit = (IFruit) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fruit;
    }
}
