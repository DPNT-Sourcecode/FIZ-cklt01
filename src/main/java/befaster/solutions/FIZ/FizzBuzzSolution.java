package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    private Boolean multipleThree(Integer number){
        return ((number % 3) == 0);
    }

    private Boolean multipleFive(Integer number){
        return ((number % 5) == 0);
    }

    public String fizzBuzz(Integer number) {
        if (multipleThree(number) && multipleFive(number)) {
           return "fizz buzz";
        }
        if (multipleThree(number)) {
           return "fizz";
        }
        if (multipleFive(number)) {
            return "buzz";
        }
        return number.toString();
    }

}



