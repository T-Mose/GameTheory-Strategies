package src.Strategies;

import java.util.List;

public interface Strategy {
    boolean makeDecision(List<Boolean> opponentHistory);
    String getName();
    void recordOpponentDecision(boolean decision);
    List<Boolean> getOpponentHistory();
    List<Boolean> getHistory();
    void addPoints(int points);
    int getPoints();
}