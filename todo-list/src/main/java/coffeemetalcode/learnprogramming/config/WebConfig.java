package coffeemetalcode.learnprogramming.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "coffeemetalcode.learnprogramming")
public class WebConfig {
}
