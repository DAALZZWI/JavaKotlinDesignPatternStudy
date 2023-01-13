package DecoratorPattern.Java.Concrete;

import DecoratorPattern.Java.Abstract.Component;
import DecoratorPattern.Java.Abstract.Decorator;

public class WaterDecorator extends Decorator {

    // americano
    public WaterDecorator(Component component) {

        super(component);
    }

    @Override
    public Integer addPrice() {

        return super.addPrice() + new EspressoDecorator(new BaseComponent()).addPrice() + 500;
    }

    @Override
    public String showItem() {
        return super.showItem() + " + Water : Americano";
    }
}
