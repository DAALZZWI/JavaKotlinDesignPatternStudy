package BridgePattern.Java.Brush;

import BridgePattern.Java.Color.Color;

public class MonoLine extends Brush{

    public final String type = "[MonoLine 연필]";

    public MonoLine(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return type + " " + color.fill();
    }
}
