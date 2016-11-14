package headFirst.decorate.beverage;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}
