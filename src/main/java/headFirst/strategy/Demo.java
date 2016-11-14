package headFirst.strategy;

import headFirst.strategy.duck.Duck;
import headFirst.strategy.duck.ModelDuck;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class Demo {
    public static void main(String[] args) {
        Duck duck = new ModelDuck();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
    }
}
