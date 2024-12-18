package codingExercises3Three;

public class Ex_3_PerfectNumberChecker {
    public boolean isPerfectNumber(int number) {
        int sumOfDivisors = 0;
        if (number>0) {
            for (int i=1;i<=(number/2);i++) {
                if (number%i==0){
                    sumOfDivisors += i;
                }
            }
        }
        return number == sumOfDivisors;
    }
}
