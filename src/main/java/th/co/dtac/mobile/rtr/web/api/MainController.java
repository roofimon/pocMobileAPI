package th.co.dtac.mobile.rtr.web.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {


    private static Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @RequestMapping("/home")
    public String index() {

        LOGGER.debug("> Greetings Mobile RTR from Spring Boot on path '/' ");

        return "Greetings Mobile RTR from Spring Boot!";
    }

}
