package hillclimbing;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Random;

public class State implements Serializable {

    static int n;
    private static final long serialVersionUID = 1L;
    int[] r;

    public static void initializeProblem(int dimension) {
        n = dimension;
    }

    public State() {
        r = new int[n];
    }

    public int objective_function() {

        int conflicts = 0;

        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (r[i] == r[j] || Math.abs(r[i] - r[j]) == Math.abs(i - j)) {
                    conflicts++;
                }
            }
        }

        return conflicts;
    }

    public State get_best_successor() {
        State bestSuccessor = null;
        int bestVal = Integer.MAX_VALUE;

        for (int queenNumber = 0; queenNumber < n; ++queenNumber) {
            for (int newRow = 0; newRow < n; ++newRow) {

                State successor = (State) DeepCopy.deepCopy(this);
                successor.r[queenNumber] = newRow;

                if (bestVal > successor.objective_function()) {
                    bestSuccessor = successor;
                    bestVal = successor.objective_function();
                }
            }
        }

        return bestSuccessor;
    }

    public State get_random_successor() {

        Random random = new Random();

        int queenNumber = random.nextInt(n);
        int position = random.nextInt(n);

        State randomSuccessor = (State) DeepCopy.deepCopy(this);
        randomSuccessor.r[queenNumber] = position;

        return randomSuccessor;

    }

    public static State get_random_state() {
        State state = new State();

        Random random = new Random();

        for (int i = 0; i < n; ++i) {
            state.r[i] = random.nextInt(n);
        }

        return state;
    }

    public String toString() {
        return Arrays.toString(r);
    }
}
