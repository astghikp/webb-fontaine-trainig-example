package PointsLines;

public class Point {

    // point will have 2 coordinates double type
    private double x, y;


    //constructor for coordinates
    public Point(double x, double y) {

        setX(x);
        setY(y);

    }

    public double getX() {
        return x;
    }

    public void setX(double x) {

        this.x = x;


    }

    public double getY() {
        return y;
    }

    public void setY(double y) {


        this.y = y;

    }

    @Override
    public String toString() {

        return String.format("%f,%f", x, y);
    }


}
