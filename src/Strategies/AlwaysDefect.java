package src.Strategies;

import java.util.List;

public class AlwaysDefect extends BaseStrategy {

    @Override
    public boolean makeDecision(List<Boolean> opponentHistory) {
        history.add(false);
        return false;
    }

    @Override
    public String getName() {
        return "Always Defect";
    }
}
