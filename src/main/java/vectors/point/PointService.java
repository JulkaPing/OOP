package vectors.point;

public class PointService {
    private static final double DELTA = 0.001;

    public static void main(String[] args) {
        Point p1 = new Point(6, 10);
        Point p2 = new Point(4,12);

        Point firstPoint = new Point(1, 2);
        Point secondPoint = new Point(10,12);
        Point thirdPoint = new Point(-2,0);

        System.out.println(p1.distanceBetweenPoints(p2));
        System.out.println(firstPoint.distanceBetweenPoints(secondPoint, thirdPoint));

    }
}
