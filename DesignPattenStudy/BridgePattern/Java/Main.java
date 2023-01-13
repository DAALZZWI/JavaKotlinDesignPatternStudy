package BridgePattern.Java;

import BridgePattern.Java.Brush.Brush;
import BridgePattern.Java.Brush.HB;
import BridgePattern.Java.Brush.MonoLine;
import BridgePattern.Java.Color.Blue;
import BridgePattern.Java.Color.Red;

public class Main {

    public static void main(String[] args) {

        Brush hbr = new HB(new Red());
        Brush hbb = new HB(new Blue());

        System.out.println(hbr.draw());
        System.out.println(hbb.draw());

        Brush mor = new MonoLine(new Red());
        Brush mob = new MonoLine(new Blue());

        System.out.println(mor.draw());
        System.out.println(mob.draw());
    }
}
