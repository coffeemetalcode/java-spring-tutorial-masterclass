package coffeemetalcode.learnprogramming.config;

import coffeemetalcode.learnprogramming.GuessCount;
import coffeemetalcode.learnprogramming.MaxNumber;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfig {
    /* fields */
    private int maxNumber = 100;

    private int guessCount = 10;

    /* bean methods */
    @Bean
    @MaxNumber
    public int maxNumber() {
        return maxNumber;
    }

    @Bean
    @GuessCount
    public int guessCount() {
        return guessCount;
    }
}
