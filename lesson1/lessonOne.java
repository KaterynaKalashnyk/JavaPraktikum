package lesson1;

import static java.awt.Color.getColor;

public class lessonOne {
    public static void main(String[] args) {
        Square square = new Square(10, 20);
        square.draw();

        Circle circle = new Circle(12, 16);
        System.out.println(circle.getColor());
        circle.draw();


        Figure[] figures = new Figure[4];
        figures[0] = square;
        figures[1] = circle;

        for (int i = 0; i < figures.length; i++){
            Figure figure = figures[i];
            figure.draw();
            System.out.println("color " + getColor());
        }
    }
}
