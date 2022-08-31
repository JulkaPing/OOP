package vectors.point;

public class PointResult {
    private static final double INCORRECT_RESULT = -1;
    private double fromPointsFirstToSecond = INCORRECT_RESULT;
    private double fromPointsSecondToThird = INCORRECT_RESULT;
    private double fromPointsThirdToFirst = INCORRECT_RESULT;

    public double getFromPointsFirstToSecond() {
        return fromPointsFirstToSecond;
    }

    public void setFromPointsFirstToSecond(double fromPointsFirstToSecond) {
        this.fromPointsFirstToSecond = fromPointsFirstToSecond;
    }

    public double getFromPointsSecondToThird() {
        return fromPointsSecondToThird;
    }

    public void setFromPointsSecondToThird(double fromPointsSecondToThird) {
        this.fromPointsSecondToThird = fromPointsSecondToThird;
    }

    public double getFromPointsThirdToFirst() {
        return fromPointsThirdToFirst;
    }

    public void setFromPointsThirdToFirst(double fromPointsThirdToFirst) {
        this.fromPointsThirdToFirst = fromPointsThirdToFirst;
    }

    @Override
    public String toString() {
        return "PointResult{" +
                "fromPointsFirstToSecond=" + fromPointsFirstToSecond +
                ", fromPointsSecondToThird=" + fromPointsSecondToThird +
                ", fromPointsThirdToFirst=" + fromPointsThirdToFirst +
                '}';
    }
}
