package coffeemetalcode.learnprogramming.controller;

import coffeemetalcode.learnprogramming.service.DemoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.ResponseBody;

@Slf4j
@Controller
public class DemoController {

    /* fields */
    private final DemoService demoService;

    /* constructor */
    @Autowired
    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    /* request handlers */
    @ResponseBody
    @GetMapping("/hello")
    public String hello() {
        return "hello";
    }

    /* Passing Model in method and adding an attribute */
    @GetMapping("welcome")
    public String welcome(Model model) {
        model.addAttribute("helloMessage", demoService.getHelloMessage("David"));
        log.info("model = {}", model);

        return "welcome";
    }

    /* Using the ModelAttribute decorator to confer an attribute */
    /* model attribute */
    @ModelAttribute("welcomeMessage")
    public String welcomeMessage() {
        log.info("welcomeMessage() called");

        return demoService.getWelcomeMessage();

    }
}
