package BotPlayingStrategies;

import Models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        // have if else and implement on your own
        return new EasyBotPlayingStrategy();
    }
}

//break till 10:29:00, resume by 10:30:00