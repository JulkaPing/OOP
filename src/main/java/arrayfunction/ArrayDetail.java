package arrayfunction;

public class ArrayDetail<I extends Number> {

    private int firstElement;
    private int lastElement;
    private int sumBetweenFirstAndLast;

    public ArrayDetail(int firstElement, int lastElement, int sumBetweenFirstAndLast) {
        this.firstElement = firstElement;
        this.lastElement = lastElement;
        this.sumBetweenFirstAndLast = sumBetweenFirstAndLast;
    }

    public int getFirstElement() {
        return firstElement;
    }

    public void setFirstElement(int firstElement) {
        this.firstElement = firstElement;
    }

    public int getLastElement() {
        return lastElement;
    }

    public void setLastElement(int lastElement) {
        this.lastElement = lastElement;
    }

    public int getSumBetweenFirstAndLast() {
        return sumBetweenFirstAndLast;
    }

    public void setSumBetweenFirstAndLast(int sumBetweenFirstAndLast) {
        this.sumBetweenFirstAndLast = sumBetweenFirstAndLast;
    }
}