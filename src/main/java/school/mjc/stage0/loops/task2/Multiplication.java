package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        if (multiplyByAndToInclusive == 0){
            System.out.println("");
        }
        while (counter * counter <= multiplyByAndToInclusive * multiplyByAndToInclusive) {
            System.out.println(multiplyByAndToInclusive * counter);
            counter++;
        }
    }
}
