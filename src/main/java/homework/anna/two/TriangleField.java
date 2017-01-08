package homework.anna.two;

public class TriangleField {
    private int a;
    private int h;

    public TriangleField(int a, int h) {
        this.a = a;
        this.h = h;
    }
    public double triangleArea() {
        return (a*h) /2.0;
    }
}
