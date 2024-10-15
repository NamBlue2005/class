class Circle {
    private double radius = 1.0;
    private final String color = "red";

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return Math.PI * radius * radius;
    }
}