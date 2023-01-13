package BridgePattern.Java.Brush;

import BridgePattern.Java.Color.Color;

public class HB extends Brush{

    public final String type = "[HB 연필]";

    public HB(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return type + " " + color.fill();
    }
}
