package DecoratorPattern.Java;

import DecoratorPattern.Java.Concrete.*;
import DecoratorPattern.Java.Abstract.Component;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Component component = null;
        Scanner scanner = new Scanner(System.in);
        Boolean loop = true;
        while (loop == true) {

            System.out.println("Select your Beverage");
            System.out.println("1, Espresso");
            System.out.println("2, Americano");
            System.out.println("3, CoffeeLatte");
            System.out.println("4, CoffeeIceBlended");
            int selectedNumber = scanner.nextInt();

            switch (selectedNumber) {

                case 1 : {component = new EspressoDecorator(new BaseComponent()); break;}
                case 2 : {component = new WaterDecorator(new BaseComponent()); break;}
                case 3 : {component = new MilkDecorator(new BaseComponent()); break;}
                case 4 : {component = new IceDecorator(new BaseComponent()); break;}
                default: { System.out.println("Program Terminate"); component = new BaseComponent(); loop = false; }
            }

            System.out.println(component.showItem() + " = " + component.addPrice() + " Won");
        }
    }
}
