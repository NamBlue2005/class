package Abstractt;

import java.util.Random;

public class TestResizeable {
    public static void main(String[] args) {
        Resizeable[] shapes = new Resizeable[3];
        shapes[0] = new Circle(5.0);
        shapes[1] = new Rectangle(3.0, 4.0);
        shapes[2] = new Square(2.0);

        Random rand = new Random();

        for (Resizeable shape : shapes) {
            double randomPercent = 1 + rand.nextInt(100);

            double areaBefore = 0;
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                areaBefore = circle.getArea();
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                areaBefore = rectangle.getArea();
            }

            System.out.println(shape.toString());
            System.out.println("Diện tích trước khi thay đổi kích thước: " + areaBefore);

            shape.resize(randomPercent);
            double areaAfter = 0;
            if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                areaAfter = circle.getArea();
            } else if (shape instanceof Rectangle) {
                Rectangle rectangle = (Rectangle) shape;
                areaAfter = rectangle.getArea();
            }

            System.out.println("Tỷ lệ thay đổi: " + randomPercent + "%");
            System.out.println("Diện tích sau khi thay đổi kích thước: " + areaAfter);
            System.out.println("---------------------------");
        }
    }
}