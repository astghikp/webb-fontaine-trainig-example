package PointsLines;

import org.junit.Test;
import org.testng.Assert;

import java.text.DecimalFormat;

public class TestsApi {


    @Test
    public void testCheckDistanceBetweenPointsPositive() {
        Point myPoint2 = new Point(15, 8);
        Point myPoint1 = new Point(1, 2);
        double distance = PointLineAPI.distanceBetweenPoints(myPoint1, myPoint2);
        //Senc areci heto mer dasi videon veranayeci
        // Assert.assertEquals(distance,15.23, 0.011);
        DecimalFormat coordinates = new DecimalFormat("0.00");
        Assert.assertEquals(coordinates.format(distance), coordinates.format(15.231546));

    }

    @Test
    public void testCheckDistanceBetweenPointsEquals() {
        Point myPoint2 = new Point(15, 8);
        Point myPoint1 = new Point(15, 8);
        double distance = PointLineAPI.distanceBetweenPoints(myPoint1, myPoint2);
        Assert.assertEquals(distance, 0);

    }

    @Test
    public void testCheckDistanceBetweenPointsNullCheck() {
        Point myPoint2 = new Point(15, 8);
        Point myPoint1 = new Point(15, 8);
        double distance = PointLineAPI.distanceBetweenPoints(null, myPoint2);
        Assert.assertEquals(distance, 0);
        distance = PointLineAPI.distanceBetweenPoints(myPoint1, null);
        Assert.assertEquals(distance, 0);

    }

    @Test
    public void testFindMiddlePointPositive() {
        Point myPoint2 = new Point(-2, 12);
        Point myPoint1 = new Point(15, 8);
        Point middlePoint = PointLineAPI.midPoint(myPoint1, myPoint2);
        DecimalFormat coordinates = new DecimalFormat("0.00");
        Assert.assertEquals(coordinates.format(middlePoint.getX()), "6.50");
        Assert.assertEquals(coordinates.format(middlePoint.getY()), "10.00");


    }

    @Test
    public void testFindMiddlePointEqualPoints() {
        Point myPoint2 = new Point(15, 8);
        Point myPoint1 = new Point(15, 8);
        Point middlePoint = PointLineAPI.midPoint(myPoint1, myPoint2);
        Assert.assertEquals(middlePoint.getX(), 0);
        Assert.assertEquals(middlePoint.getY(), 0);


    }

    @Test
    public void testFindMiddlePointNullCheck() {
        Point myPoint2 = new Point(15, 8);
        Point myPoint1 = new Point(15, 8);
        Point middlePoint = PointLineAPI.midPoint(null, myPoint2);
        Assert.assertEquals(middlePoint.getX(), 0);
        Assert.assertEquals(middlePoint.getY(), 0);
        middlePoint = PointLineAPI.midPoint(myPoint1, null);
        Assert.assertEquals(middlePoint.getX(), 0);
        Assert.assertEquals(middlePoint.getY(), 0);

    }

    @Test
    public void testCheckPointOnTheLinePositive() {
        Point myPoint2 = new Point(-2, 12);
        Point myPoint1 = new Point(15, 8);
        Line myLine = new Line(myPoint1, myPoint2);
        Point checkPoint = new Point(-2, 12);
        boolean check = PointLineAPI.checkPointOnTheLine(myLine, checkPoint);
        Assert.assertTrue(check);
    }

    @Test
    public void testCheckPointOnTheLineNegative() {
        Point myPoint2 = new Point(-2, 12);
        Point myPoint1 = new Point(15, 8);
        Line myLine = new Line(myPoint1, myPoint2);
        Point checkPoint = new Point(-1, 12);
        boolean check = PointLineAPI.checkPointOnTheLine(myLine, checkPoint);
        Assert.assertFalse(check);
    }

    @Test
    public void testCheckPointOnTheLineNullCheck() {
        Point myPoint2 = new Point(-2, 12);
        Point myPoint1 = new Point(15, 8);
        Line myLine = new Line(myPoint1, myPoint2);
        Point checkPoint = new Point(-1, 12);
        boolean check = PointLineAPI.checkPointOnTheLine(null, checkPoint);
        Assert.assertFalse(check);
        check = PointLineAPI.checkPointOnTheLine(myLine, null);
        Assert.assertFalse(check);
    }

    @Test
    public void testCheckSquare() {
        Point myPoint2 = new Point(4, 6);
        Point myPoint1 = new Point(5, 5);
        Point myPoint3 = new Point(5, 6);
        Point myPoint4 = new Point(4, 5);
        boolean check = PointLineAPI.checkForSquare(myPoint1, myPoint2, myPoint3, myPoint4);
        Assert.assertFalse(check);

    }

}
