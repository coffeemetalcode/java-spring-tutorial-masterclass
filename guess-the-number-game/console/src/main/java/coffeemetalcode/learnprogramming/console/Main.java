package coffeemetalcode.learnprogramming.console;

import coffeemetalcode.learnprogramming.config.AppConfig;
import coffeemetalcode.learnprogramming.MessageGenerator;
import coffeemetalcode.learnprogramming.NumberGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess The Number Game");
        // log.debug("Debug The Number Game"); // <- log a message at the debug level

        /* create context (container) */
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        /* get number generator from context (container) */
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        /* call next() method to get a random number */
        int number = numberGenerator.next();

        /* log number */
        log.info("number: {}", number);

        /* get message generator bean from context (container) */
        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);

        log.info("getMainMessage = {}", messageGenerator.getMainMessage());
        log.info("getResultMessage = {}", messageGenerator.getResultMessage());
        /* close context */
        context.close();
    }
}
