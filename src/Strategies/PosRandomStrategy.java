package src.Strategies;

import java.util.List;
import java.util.Random;

public class PosRandomStrategy extends BaseStrategy {
    private Random random = new Random();

    @Override
    public boolean makeDecision(List<Boolean> opponentHistory) {
        boolean decision = random.nextInt(3) != 1;
        history.add(decision);
        return decision;
    }

    @Override
    public String getName() {
        return "Positive Random Strategy";
    }
}

