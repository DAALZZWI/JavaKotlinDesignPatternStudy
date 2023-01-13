package DecoratorPattern.Java.Abstract;

abstract public class Decorator implements Component{

    public Component component;

    public Decorator(Component component) {

        this.component = component;
    }

    @Override
    public Integer addPrice() {
        return component.addPrice();
    }

    @Override
    public String showItem() {
        return component.showItem();
    }
}
