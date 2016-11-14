package headFirst.strategy.duck;

import headFirst.strategy.fly.FlyBehavor;
import headFirst.strategy.quack.QuackBehavor;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public abstract class Duck {
    // strategy
    // the reason why i don't let concrete duck implement Flyable interface, is
    // that there are just a few fly behavor, but every concrete duck has to implement
    // the fly method itself.
    private FlyBehavor flyBehavor;
    private QuackBehavor quackBehavor;

    public void performFly() {
        flyBehavor.fly();
    }

    public void performQuack() {
        quackBehavor.quack();
    }

    public void swim() {
        System.out.println("Swim swim swim. Life is like a dream.");
    }

    abstract public void display();

    public void setFlyBehavor(FlyBehavor flyBehavor) {
        this.flyBehavor = flyBehavor;
    }

    public void setQuackBehavor(QuackBehavor quackBehavor) {
        this.quackBehavor = quackBehavor;
    }
}
