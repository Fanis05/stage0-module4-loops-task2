package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int num = 1;

        while (num <= printToInclusive){
            int count = 0;
            int j = 1;
            while(j<=num){
                if(num%j == 0){
                    count++;
                }
                j++;
            }
            if (count == 2){
                System.out.println(num);
            }
            num++;
        }
    }
}
