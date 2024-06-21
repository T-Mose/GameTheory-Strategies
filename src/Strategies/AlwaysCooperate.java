package src.Strategies;

import java.util.List;

public class AlwaysCooperate extends BaseStrategy {

    @Override
    public boolean makeDecision(List<Boolean> opponentHistory) {
        history.add(true);
        return true;
    }

    @Override
    public String getName() {
        return "Always Cooperate";
    }
}