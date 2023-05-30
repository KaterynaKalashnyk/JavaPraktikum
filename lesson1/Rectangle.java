package lesson1;

public class Rectangle extends BaseFigure{
    public Rectangle(int height, int width){
        super();
    }

    public void draw(){
        System.out.println("Прямоугольник " + height + "x" + width);
    }
}
