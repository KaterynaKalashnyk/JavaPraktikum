package lesson1;

import java.util.Random;

public class Square extends BaseFigure {

    public Square(int height, int width){
        super();
        if (height != width){
            System.out.println("Не квдрат");
        }
    }

    public void draw(){
        System.out.println("Квадрат " + height + "x" + width);
    }
}
