package DecoratorPattern.Java.Concrete;

import DecoratorPattern.Java.Abstract.Component;
import DecoratorPattern.Java.Abstract.Decorator;

public class MilkDecorator extends Decorator {

    // coffee latte
    public MilkDecorator(Component component) {

        super(component);
    }

    @Override
    public Integer addPrice() {

        return super.addPrice() + new EspressoDecorator(new BaseComponent()).addPrice() + 2000;
    }

    @Override
    public String showItem() {
        return super.showItem() + " + Milk : CoffeeLatte";
    }
}
