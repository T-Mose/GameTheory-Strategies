package src.Strategies;

import java.util.List;

public class TitForTat extends BaseStrategy {

    @Override
    public boolean makeDecision(List<Boolean> opponentHistory) {
        boolean decision;
        if (opponentHistory.isEmpty()) {
            decision = true; // Cooperate on the first move
        } else {
            decision = opponentHistory.get(opponentHistory.size() - 1); // Mimic opponent's last move
        }
        history.add(decision);
        return decision;
    }

    @Override
    public String getName() {
        return "Tit for Tat";
    }
}
