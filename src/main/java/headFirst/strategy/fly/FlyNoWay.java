package headFirst.strategy.fly;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class FlyNoWay implements FlyBehavor {
    public void fly() {
        System.out.println("I can't fly.");
    }
}
