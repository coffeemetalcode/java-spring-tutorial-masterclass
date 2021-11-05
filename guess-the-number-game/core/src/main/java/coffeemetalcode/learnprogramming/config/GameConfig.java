package coffeemetalcode.learnprogramming.config;

import coffeemetalcode.learnprogramming.GuessCount;
import coffeemetalcode.learnprogramming.MaxNumber;
import coffeemetalcode.learnprogramming.MinNumber;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:config/game.properties")
public class GameConfig {
    /* fields */
    @Value("${game.maxNumber:25}")
    private int maxNumber;

    @Value("${game.minNumber:5}")
    private int minNumber;

    @Value("${game.guessCount:8}")
    private int guessCount;

    public GameConfig() {
    }

    /* bean methods */
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @MinNumber
    public int minNumber() {
        return minNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
}
