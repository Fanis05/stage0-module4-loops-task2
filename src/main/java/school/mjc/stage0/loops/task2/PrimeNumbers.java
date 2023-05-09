package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int number = 0;
        int count = 0;
        int devider = 1;
        while (number <= printToInclusive){
            count = 0;
            devider = 1;
            while(devider <=number){
                if (number % devider == 0){
                    count++;
                    devider++;
                }
                if (count == 2){
                    System.out.println(number);
                }
            }
            number ++;
        }
    }
}
