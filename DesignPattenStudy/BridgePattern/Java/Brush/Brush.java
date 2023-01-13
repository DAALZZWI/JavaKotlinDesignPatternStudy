package BridgePattern.Java.Brush;

import BridgePattern.Java.Color.Color;

public abstract class Brush {

    protected Color color;

    protected Brush(Color color) {

        this.color = color;
    }

    public abstract String draw();
}
