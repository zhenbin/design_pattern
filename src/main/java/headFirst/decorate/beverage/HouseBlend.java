package headFirst.decorate.beverage;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}
