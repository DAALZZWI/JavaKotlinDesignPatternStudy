package AbstractFactoryPattern.Java.Concrete;

import AbstractFactoryPattern.Java.Abstract.GuiFactory;
import AbstractFactoryPattern.Java.Concrete.Mac.MacGuiFactory;
import AbstractFactoryPattern.Java.Concrete.Windows.WindowsGuiFactory;

public class FactoryInstance {

    public static GuiFactory getGuiFactoryInstance() {

        switch (getOsCode()) {
            case "Windows 10" : return new WindowsGuiFactory();
            case "Mac Os X" : return new MacGuiFactory();
            default: return null;
        }
    }

    private static String getOsCode() {

        return System.getProperty("os.name");
    }
}
