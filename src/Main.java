package src;

import src.Strategies.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final int NUMBER_OF_ROUNDS = 10;
    public static void main(String[] args) {
        List<Strategy> strategies = new ArrayList<>();
        strategies.add(new AlwaysCooperate());
        strategies.add(new AlwaysDefect());
        strategies.add(new TitForTat());

        SimplePrisonersDilemma game = new SimplePrisonersDilemma(strategies);
        game.playGame(NUMBER_OF_ROUNDS); // Play 10 rounds
        game.displayResults();
    }
}
