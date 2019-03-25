package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;
import java.util.ArrayList;;

public class FizzBuzzSolution {

    private Boolean multipleThree(Integer number){
        return ((number % 3) == 0);
    }

    private Boolean multipleFive(Integer number){
        return ((number % 5) == 0);
    }

    private Boolean containsKey (Integer number, Integer key) {
        // FEEDBACK: the checker should watch for timeout, in case of infinite loop
        while (number > 0) {
            if ((number % 10) == key) {
                return true;
            }
            number = number / 10;
        }
        return false;
    }

    private Boolean isMagic (Integer number, Integer key) {
        if (number % key == 0) {
            return true;
        }
        return containsKey(number, key);
    }

    private Boolean isDeluxe (Integer number) {
        if (number < 10){
            return false;
        }
        Integer lastDigit = number % 10;
        while (number >= 10) {
            number = number / 10;
            if ((number % 10) != lastDigit) {
                return false;
            }
        }
        return true;
    }

    public String fizzBuzz(Integer number) {
        ArrayList<String> attributes = new ArrayList<String>();
        if (isMagic(number, 3)) {
            attributes.add("fizz");
        }
        if (isMagic(number, 5)) {
            attributes.add("buzz");
        }
        if (isDeluxe(number)) {
            attributes.add("deluxe");
        }
        if (attributes.isEmpty()) {
            return number.toString();
        }
        return String.join(" ", attributes);
    }

}






