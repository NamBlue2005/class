package Abstractt;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public double getSide() {
        return getWidth();
    }

    @Override
    public void resize(double percent) {
        super.resize(percent);
    }

    @Override
    public String toString() {
        return "Square with side = " + getSide();
    }
}