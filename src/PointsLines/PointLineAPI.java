package PointsLines;

public final class PointLineAPI {
    private PointLineAPI() {
    }

    // method to calculate Distance Between two points
    public static double distanceBetweenPoints(Point point1, Point point2) {
        if (point1 == null || point2 == null) {
            System.out.println(" You gave not valid value");
            return 0.0;
        } else
            return Math.sqrt((point2.getY() - point1.getY()) * (point2.getY() - point1.getY()) + (point2.getX() - point1.getX()) * (point2.getX() - point1.getX()));
    }


    //Method returns Middle point between two points
    //   (x1+x2)/2
    public static Point midPoint(Point point1, Point point2) {
        Point midPoint = new Point(0, 0);
        if (point1 == null || point2 == null || distanceBetweenPoints(point1, point2) == 0) {
            System.out.println(" You gave not valid value");
            return null;
        } else {
            midPoint.setX((point1.getX() + point2.getX()) / 2);
            midPoint.setY((point1.getY() + point2.getY()) / 2);
            return midPoint;
        }
    }

    // check if Point on the Line
    public static boolean checkPointOnTheLine(Line line, Point point) {
        if (line == null || point == null)
            return false;
        return (distanceBetweenPoints(line.getFirstPoint(), point) + distanceBetweenPoints(line.getSecondPoint(), point)) == distanceBetweenPoints(line.getSecondPoint(), line.getFirstPoint());
    }

    // check if lines are equal
    public static boolean linesEqual(Line line1, Line line2) {
        if (line1 == null || line2 == null)
            return false;
        return distanceBetweenPoints(line1.getFirstPoint(), line1.getSecondPoint()) == distanceBetweenPoints(line2.getFirstPoint(), line2.getSecondPoint());
    }

    //check if 4 Points Can be Square
    public static boolean checkForSquare(Point point1, Point point2, Point point3, Point point4) {
        if (point1 == null || point2 == null || point3 == null || point4 == null) {
            System.out.println(" You gave not valid value");
            return false;
        }

        double distancep1p2 = distanceBetweenPoints(point1, point2);
        double distancep1p3 = distanceBetweenPoints(point1, point3);
        double distancep1p4 = distanceBetweenPoints(point1, point4);


        if (distancep1p2 == distancep1p3) {
            // checking if the sides are equal to the diagonal
            return distancep1p4 == (distancep1p2 + distancep1p4);

        } else if (distancep1p2 == distancep1p4) {
            // checking if the sides are equal to the diagonal
            return distancep1p3 == distancep1p2 + distancep1p4;


        }
        return false;
    }

    // If lengths (p1, p2) and (p1, p3) are same, then
    // following conditions must met to form a square.
    // 1) Square of length of (p1, p4) is same as twice
    // the square of (p1, p2)
    // 2) Square of length of (p2, p3) is same
    // as twice the square of (p2, p4)

//        if (distancep1p2 == distancep2p3 && 2 * distancep1p2 == distancep1p4
//                && 2 * distanceBetweenPoints(point2, point4) == distanceBetweenPoints(point2, point3)) {
//            return true;
//        }
//
//        if (distancep2p3 == distancep1p4 && 2 * distancep2p3 == distancep1p2
//                && 2 * distanceBetweenPoints(point3, point2) == distanceBetweenPoints(point3, point4)) {
//            return true;
//        }
//        return distancep1p2 == distancep1p4 && 2 * distancep1p2 == distancep2p3
//                && 2 * distanceBetweenPoints(point2, point3) == distanceBetweenPoints(point2, point4);
//    }


    // Check if Area of Point contains given Point
    public static boolean checkIFPointBelongsToArea(Point[] points, Point pointCheck) {
        if (pointCheck == null) {

            System.out.println(" You gave not valid value");
            return false;
        }
        double minX = 0;
        double minY = 0;
        double maxX = 0;
        double maxY = 0;
        for (int i = 0; i < points.length; i++) {
            if (points[i] == null) {
                System.out.println(" You gave not valid value");
                return false;
            } else {


                minX = Math.min(points[i].getX(), points[i + 1].getX());
                minY = Math.min(points[i].getY(), points[i + 1].getY());
                maxX = Math.max(points[i].getX(), points[i + 1].getX());
                maxY = Math.max(points[i].getY(), points[i + 1].getY());
            }

        }
        if (pointCheck.getX() > maxX || pointCheck.getX() < minX || pointCheck.getY() > maxY || pointCheck.getY() < minY) {
            System.out.println(" Your Point is not in Area");
            return false;
        } else {

            System.out.println(" Your point is in area");
            return true;
        }

    }

}
