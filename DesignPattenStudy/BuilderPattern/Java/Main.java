package BuilderPattern.Java;

public class Main {

    public static void main(String[] args) {

        Computer computer = ComputerBuilder
                .start()
                .setCpu("Intel i7 8700k")
                .setRam("8GB")
                .setStorage("SSD 500GB")
                .build();

        System.out.println(computer.toString());
    }
}
