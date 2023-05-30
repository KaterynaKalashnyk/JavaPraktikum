package lesson1;

import java.util.Random;

public abstract class BaseFigure implements Figure{
    int height;
    int width;
    private int color;

    public BaseFigure(){
        this.height = height;
        this.width = width;

        this.color = (new Random()).nextInt(7);
    }

    public int getColor() {
        return color;
    }
}
