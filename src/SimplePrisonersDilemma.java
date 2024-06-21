package src;

import java.util.List;

import src.Strategies.Strategy;

public class SimplePrisonersDilemma extends AbstractPrisonersDilemma {

    public SimplePrisonersDilemma(List<Strategy> strategies) {
        super(strategies);
    }

    @Override
    protected void determineOutcome(Strategy s1, Strategy s2) {
        boolean decision1 = s1.makeDecision(s1.getOpponentHistory());
        boolean decision2 = s2.makeDecision(s2.getOpponentHistory());

        // Record each other's decisions
        s1.recordOpponentDecision(decision2);
        s2.recordOpponentDecision(decision1);

        String result = "";
        if (decision1 && decision2) {
            s1.addPoints(3);
            s2.addPoints(3);
            result += "3 points each";
        } else if (decision1 && !decision2) {
            s2.addPoints(5);
            result += s2.getName() + " won 5 points";
        } else if (!decision1 && decision2) {
            s1.addPoints(5);
            result += s1.getName() + " won 5 points";
        } else {
            s1.addPoints(1);
            s2.addPoints(1);
            result += " loss both got 1 point";
        }

        // System.out.println(s1.getName() + " is playing against: " + s2.getName() + " the result was: " + result);
    }

    @Override
    public void playGame(int rounds) {
        super.playGame(rounds);
        // Additional customization for this specific game can go here
    }
}