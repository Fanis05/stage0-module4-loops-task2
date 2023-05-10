package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        int result;
        while (counter * counter <= multiplyByAndToInclusive * multiplyByAndToInclusive) {
            result = counter * multiplyByAndToInclusive;
            if (multiplyByAndToInclusive != 0) {
                System.out.println(result);
            }
            counter++;
        }
    }
}
