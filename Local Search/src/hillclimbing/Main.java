package hillclimbing;

import java.util.Random;
public class Main {

   public static void main(String[] args) {
        State solution = Main.greedy_hill_climbing(10);
        System.out.println(solution);
    }

    public static State greedy_hill_climbing(int n) {

        State.initializeProblem(n);

        State currentState = State.get_random_state();// From state class get a random state
        int currentObjVal = currentState.objective_function();// From current state get the objective value using the objective function

        while (true) {
            System.out.println("current state : " + currentState);
            System.out.println("current obj value : " + currentObjVal);

            if (currentObjVal == 0) {
                // Write the appropriate codition here
                break;
            }

            State bestSuccessor = currentState.get_best_successor();// From current state get the best successor
            int successorVal = bestSuccessor.objective_function();// From best successor get the objective function

            if (currentObjVal <= successorVal) {
                // Write the appropriate codition here
            	random_restart_hill_climbing(n);
            }

            currentState = bestSuccessor;// Make best successor the current state
            currentObjVal = successorVal;// Make the successorval the current obj val
        }

        return currentState;
    }


    public static State random_restart_hill_climbing(int n) {

        System.out.println("Running random restart hill climbing");

        State endState = null;

        while (true) {
            System.out.println("Starting new random restart");
            endState = greedy_hill_climbing(n);

            if (endState.objective_function() == 0) {
                // Write the appropriate codition here
            	break;
            }
        }

        return endState;
    }

}
