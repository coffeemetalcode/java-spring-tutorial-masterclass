package coffeemetalcode.learnprogramming.console;

import coffeemetalcode.learnprogramming.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    public static void main(String[] args) {
        log.info("Guess The Number Game");
        // log.debug("Debug The Number Game"); // <- log a message at the debug level

        /* create context (container) */
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        /* close context */
        context.close();
    }
}
