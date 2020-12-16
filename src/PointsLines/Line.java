package PointsLines;

public class Line {

    private Point firstPoint, secondPoint;

    public Line(Point firstPoint, Point secondPoint) {
        if (checkIfLine(firstPoint, secondPoint)) {
            setFirstPoint(firstPoint);
            setSecondPoint(secondPoint);
        } else
            System.out.println(" Cannot drive line with your Points");

    }

    public boolean checkIfLine(Point firstPoint, Point secondPoint) {
        return PointLineAPI.distanceBetweenPoints(firstPoint, secondPoint) != 0 && firstPoint != null && secondPoint != null;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }

//   public double lineLength (Line line)
//   {
//            PointLineAPI.DistanceBetweenPoints(line.getSecondPoint(), line.getFirstPoint());
//   }

}
