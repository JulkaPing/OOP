package vectors.point;

public class Point {
    private int pointX;
    private int pointY;

    public Point(int pointX, int pointY) {
        this.pointX = pointX;
        this.pointY = pointY;
    }
    public int getPointX() {
        return pointX;
    }

    public void setPointX(int pointX) {
        this.pointX = pointX;
    }
    public int getPointY() {
        return pointY;
    }

    public void setPointY(int pointY) {
        this.pointY = pointY;
    }

    public double distanceBetweenPoints(Point p2) {
        return Math.sqrt(Math.pow(p2.getPointX() - this.getPointX(), 2) +
                Math.pow(p2.getPointY() - this.getPointY(), 2));
    }
    public PointResult distanceBetweenPoints(Point secondPoint, Point thirdPoint) {
       PointResult pointResult = new PointResult();
       pointResult.setFromPointsFirstToSecond(distanceBetweenPoints(secondPoint));
       pointResult.setFromPointsThirdToFirst(distanceBetweenPoints(thirdPoint));
       this.pointX = secondPoint.getPointX();
       this.pointY = secondPoint.getPointY();
       pointResult.setFromPointsSecondToThird(distanceBetweenPoints(thirdPoint));
       return pointResult;
    }

    @Override
    public String toString() {
        return "Point{" +
                "pointX=" + pointX +
                ", pointY=" + pointY +
                '}';
    }
}