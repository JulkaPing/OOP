package task.point;

import org.junit.Assert;
import org.junit.Test;
import vectors.point.Point;
import vectors.point.PointResult;

public class PointServiceTest {
    private static final double DELTA = 0.001;
    @Test
    public void distanceBetweenTwoPoints() {
        Point p1 = new Point(6, 10);
        Point p2 = new Point(4,12);

        Double expected = 2.828;
        Double result = p1.distanceBetweenPoints(p2);

        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void distanceBetweenThreePoints() {
        Point firstPoint = new Point(1, 2);
        Point secondPoint = new Point(10,12);
        Point thirdPoint = new Point(-2,0);

        PointResult pointResult = firstPoint.distanceBetweenPoints(secondPoint,thirdPoint);

        Double expectedBetweenP1P2 = 13.453;
        Double expectedBetweenP2P3 = 16.970;
        Double expectedBetweenP3P1 = 3.605;

        Assert.assertEquals(
                expectedBetweenP1P2,
                pointResult.getFromPointsFirstToSecond(), DELTA);

        Assert.assertEquals(
                expectedBetweenP2P3,
                pointResult.getFromPointsSecondToThird(), DELTA);

        Assert.assertEquals(
                expectedBetweenP3P1,
                pointResult.getFromPointsThirdToFirst(), DELTA);
    }
}