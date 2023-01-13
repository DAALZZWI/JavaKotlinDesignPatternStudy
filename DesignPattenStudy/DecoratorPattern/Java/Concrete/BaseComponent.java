package DecoratorPattern.Java.Concrete;

import DecoratorPattern.Java.Abstract.Component;

public class BaseComponent implements Component {

    // espresso
    @Override
    public Integer addPrice() {
        return 0;
    }

    @Override
    public String showItem() {
        return "CoffeeBean";
    }
}
