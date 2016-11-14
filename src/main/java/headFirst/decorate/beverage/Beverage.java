package headFirst.decorate.beverage;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */

// the Beverage class is provided by StarBuck, and we
// can't change it.
public abstract class Beverage {
    String description = "Unkown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
