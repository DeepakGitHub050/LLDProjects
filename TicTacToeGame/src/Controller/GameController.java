package Controller;

import Exceptions.DuplicateSymbolException;
import Exceptions.MoreThanOneBotException;
import Exceptions.PlayersCountMismatchException;
import Models.Game;
import Models.Player;
import WinningStrategies.WinningStrategy;

import java.util.List;

public class GameController {


    public Game startGame(int dimension, List<Player> playerList, List<WinningStrategy> winningStrategies) throws DuplicateSymbolException, PlayersCountMismatchException, MoreThanOneBotException {
        return Game.getBuilder()
                .setDimension(dimension)
                .setPlayers(playerList)
                .setWinningStrategies(winningStrategies)
                .build();
    }

    public void printBoard(Game game){
        game.printBoard();
    }

    public void makeMove(Game game){
        game.makeMove();
    }

    public void undo(Game game){
        game.undo();
    }















}