package headFirst.decorate.condiment;

import headFirst.decorate.beverage.Beverage;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class Mocha extends CondimentDecorator {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + .2;
    }
}
