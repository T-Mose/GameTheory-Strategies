package src.Strategies;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseStrategy implements Strategy {
    protected List<Boolean> history = new ArrayList<>();
    protected List<Boolean> opponentHistory = new ArrayList<>();
    private int points = 0;

    @Override
    public void recordOpponentDecision(boolean decision) {
        opponentHistory.add(decision);
    }

    @Override
    public List<Boolean> getOpponentHistory() {
        return opponentHistory;
    }
    @Override
    public List<Boolean> getHistory() {
        return history;
    }
    public void resetHistory() {
        history.clear();
        opponentHistory.clear();
    }
    @Override
    public void addPoints(int points) {
        this.points += points;
    }

    @Override
    public int getPoints() {
        return points;
    }
}
