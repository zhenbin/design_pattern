package headFirst.strategy.quack;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class MuteQuack implements QuackBehavor {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
