public class MathsFunGame {
    /**
     * This class contains two fun games that Maths teacher explains in class
     * @author ting
     */

    // Those three contants define the words in place of numbers, you just modify once if the word changes
    private static final String FIZZ = "Fizz";
    private static final String BUSS = "Buzz";
    private static final String FIZZBUZZ = "FizzBuzz";

    /**
     * The first method to play game
     */
    public void play(){
        for(int i = 1; i <= 100; i++){
            System.out.println(outputMess(i));
        }
    }


    /**
     * It is another method to play game,
     * but there are some problems in new requirements.
     * 1.The last one conflicts with the two above.
     *   I think it is "A number is FizzBuzz if it is divisible by 3 and 5 or if it has 3 and 5 in it"
     * 2.If a number has a 3 in it but it is divisible by 5, such as 30, what should be printed?
     */
    public void newPlay(){
        for(int i = 1; i <= 100; i++){
            String message = outputMess(i);
            if(FIZZBUZZ.equals(message) ||
                    (isContain(i, 3) && isContain(i, 5))){
                System.out.println(FIZZBUZZ);
            } else if(FIZZ.equals(message) || isContain(i, 3)){
                System.out.println(FIZZ);
            }else if(BUSS.equals(message) || isContain(i, 5)){
                System.out.println(BUSS);
            }else{
                System.out.println(i);
            }
        }
    }

    /**
     * It is a main business method to determine whether a number is divisible
     * 
     */
    private String outputMess(int number){
        if(number % 3 == 0 && number % 5 == 0){
            return FIZZBUZZ;
        } else if(number % 3 == 0){
            return FIZZ;
        } else if(number % 5 == 0){
            return BUSS;
        }else{
            return String.valueOf(number);
        }
    }

    /**
     * if "num" has "containNum" in it ,return true
     * @param num
     * @param containNum
     * @return
     */
    private boolean isContain(int num, int containNum){
        String numStr = String.valueOf(num);
        if(numStr.contains(String.valueOf(containNum))) return true;
        return false;
    }
}
