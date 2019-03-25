package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    private Boolean multipleThree(Integer number){
        return ((number % 3) == 0);
    }

    private Boolean multipleFive(Integer number){
        return ((number % 5) == 0);
    }

    private Boolean containsKey (Integer number, Integer key) {
        // TODO: the checker should watch for timeout, in case of infinite loop
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

    public String fizzBuzz(Integer number) {
        if (isMagic(number, 3) && isMagic(number, 5)) {
           return "fizz buzz";
        }
        if (isMagic(number, 3)) {
           return "fizz";
        }
        if (isMagic(number, 5)) {
            return "buzz";
        }
        return number.toString();
    }

}



