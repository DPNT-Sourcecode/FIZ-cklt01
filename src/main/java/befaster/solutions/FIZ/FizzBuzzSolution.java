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
        String answer = number.toString();
        if (multipleThree(number)) {
            answer = "fizz";
        }
        if (multipleThree(number)) {
            answer = "buzz";
        }
    }

}


