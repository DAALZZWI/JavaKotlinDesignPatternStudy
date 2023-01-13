package DecoratorPattern.Java.Concrete;

import DecoratorPattern.Java.Abstract.Component;
import DecoratorPattern.Java.Abstract.Decorator;

public class EspressoDecorator extends Decorator {

    public EspressoDecorator(Component component) {
        super(component);
    }

    @Override
    public Integer addPrice() {
        return super.addPrice() + 500;
    }

    @Override
    public String showItem() {
        return super.showItem() + " + SteamWater : Espresso";
    }
}
