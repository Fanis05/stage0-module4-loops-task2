package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 0;
        int fact=1;

        while (counter <= printToInclusive) {
            if(counter ==0 ){
                System.out.println("1");
            }else{
                System.out.println(fact = (fact) * counter);}
                counter++;

        }
    }
}
