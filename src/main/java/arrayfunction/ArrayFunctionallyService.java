package arrayfunction;

public class ArrayFunctionallyService {

    public ArrayDetail<Number> getArrayByCriteria(int[] numbers) {
        int firstElement = numbers[0];
        int lastElement = numbers[numbers.length - 1];
        int sumBetweenFirstAndLast = 0;

        for (int i = 1; i < numbers.length - 1; i++) {
            sumBetweenFirstAndLast = sumBetweenFirstAndLast + numbers[i];
        }

        return new ArrayDetail<>(firstElement, lastElement, sumBetweenFirstAndLast);
    }

    public int getSumNumbersBetweenIndex(int[] numbers, int start, int end) {
        int sumBetweenFirstAndLast = 0;

        for (int i = start; i < end + 1; i++) {
            sumBetweenFirstAndLast = sumBetweenFirstAndLast + numbers[i];
        }

        return sumBetweenFirstAndLast;
    }
}