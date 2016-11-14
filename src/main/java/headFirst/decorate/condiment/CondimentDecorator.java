package headFirst.decorate.condiment;

import headFirst.decorate.beverage.Beverage;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
