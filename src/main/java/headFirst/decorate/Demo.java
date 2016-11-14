package headFirst.decorate;

import headFirst.decorate.beverage.Espresso;
import headFirst.decorate.condiment.Mocha;

/**
 * Created by zhenbin.lzb on 2016/11/14.
 */
public class Demo {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        Mocha mocha = new Mocha(espresso);
        System.out.println(mocha.getDescription());
        System.out.println(mocha.cost());

        Mocha twoMocha = new Mocha(new Mocha(new Espresso()));
        System.out.println(twoMocha.getDescription());
        System.out.println(twoMocha.cost());
    }
}
