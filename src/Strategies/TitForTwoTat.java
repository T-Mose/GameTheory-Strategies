package src.Strategies;

import java.util.List;

public class TitForTwoTat extends BaseStrategy {

    @Override
    public boolean makeDecision(List<Boolean> opponentHistory) {
        boolean decision;
        if (opponentHistory.size() < 2) {
            decision = true; // Cooperate on the first two moves
        } else {
            decision = !(opponentHistory.get(opponentHistory.size() - 1)  == false && opponentHistory.get(opponentHistory.size() - 2) == false); // Mimic opponent's last move
        }
        history.add(decision);
        return decision;
    }

    @Override
    public String getName() {
        return "Tit for Two Tat";
    }
}
