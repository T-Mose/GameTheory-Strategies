package src.Strategies;

import java.util.List;
import java.util.Random;

public class TrueRandomStrategy extends BaseStrategy {
    private Random random = new Random();

    @Override
    public boolean makeDecision(List<Boolean> opponentHistory) {
        boolean decision = random.nextInt(2) == 1;
        history.add(decision);
        return decision;
    }

    @Override
    public String getName() {
        return "Random Strategy";
    }
}
