package src;

import java.util.*;

import src.Strategies.BaseStrategy;
import src.Strategies.Strategy;

public abstract class AbstractPrisonersDilemma {
    protected List<Strategy> strategies;

    public AbstractPrisonersDilemma(List<Strategy> strategies) {
        this.strategies = strategies;
    }

    protected abstract void determineOutcome(Strategy s1, Strategy s2);

    public void playRound(Strategy s1, Strategy s2) {
        determineOutcome(s1, s2);
    }

    public void playGame(int rounds) {
        for (int i = 0; i < strategies.size(); i++) {
            for (int j = i + 1; j < strategies.size(); j++) {
                Strategy s1 = strategies.get(i);
                Strategy s2 = strategies.get(j);
                resetHistories(s1, s2);
                for (int round = 0; round < rounds; round++) {
                    playRound(s1, s2);
                }
            }
        }
    }

    private void resetHistories(Strategy s1, Strategy s2) {
        ((BaseStrategy) s1).resetHistory();
        ((BaseStrategy) s2).resetHistory();
    }

    public void displayResults() {
        for (Strategy strategy : strategies) {
            System.out.println(strategy.getName() + " (Instance " + (strategies.indexOf(strategy) + 1) + "): "
                    + strategy.getPoints());
        }
    }
}
