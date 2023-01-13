package DecoratorPattern.Java.Concrete;

import DecoratorPattern.Java.Abstract.Component;
import DecoratorPattern.Java.Abstract.Decorator;

public class IceDecorator extends Decorator {

    // coffee ice blended
    public IceDecorator(Component component) {

        super(component);
    }

    @Override
    public Integer addPrice() {

        return super.addPrice() + new EspressoDecorator(new BaseComponent()).addPrice() + 1000;
    }

    @Override
    public String showItem() {
        return super.showItem() + " + Ice : CoffeeIceBlended";
    }
}
