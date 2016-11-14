package headFirst.strategy.duck;

import headFirst.strategy.fly.FlyNoWay;
import headFirst.strategy.quack.Quack;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        setFlyBehavor(new FlyNoWay());
        setQuackBehavor(new Quack());
    }

    public void display() {
        System.out.println("I'm a model duck.");
    }
}
