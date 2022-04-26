package hillclimbing;

import java.util.Random;
public class Main {

   public static void main(String[] args) {
        State solution = Main.greedy_hill_climbing(10);
        System.out.println(solution);
    }

    public static State greedy_hill_climbing(int n) {

        State.initializeProblem(n);

        State currentState = State.get_random_state();
        int currentObjVal = currentState.objective_function();

        while (true) {
            System.out.println("current state : " + currentState);
            System.out.println("current obj value : " + currentObjVal);

            if (currentObjVal == 0) {
                break;
            }

            State bestSuccessor = currentState.get_best_successor();
            int successorVal = bestSuccessor.objective_function();

            if (currentObjVal <= successorVal) {
                break;
            }

            currentState = bestSuccessor;
            currentObjVal = successorVal;
        }

        return currentState;
    }

    public static State simmulatedAnnealing(int n) {

        State.initializeProblem(n);

        State currentState = State.get_random_state();
        int currentObjVal = currentState.objective_function();
        double tempMin = 0.0000001;
        double currentTemp = 5000000; 
        double coolingRate = 0.9999;

        while (currentTemp > tempMin) {
            System.out.println("current state : " + currentState);
            System.out.println("current obj value : " + currentObjVal);

            if (currentObjVal == 0) {
                break;
            }

            State randomSuccessor = currentState.get_random_successor();
            int successorVal = randomSuccessor.objective_function();
            int improvement = currentObjVal - successorVal;

            if (improvement > 0) {
                currentState = randomSuccessor;
                currentObjVal = successorVal;
            } 
            else {
                Random random = new Random();
                double probability = 1 / (1 + Math.exp(-improvement / currentTemp));
                if (random.nextDouble() < probability) {
                    currentState = randomSuccessor;
                    currentObjVal = successorVal;
                }
            }

            currentTemp *= coolingRate;

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
                break;
            }
        }

        return endState;
    }

}
