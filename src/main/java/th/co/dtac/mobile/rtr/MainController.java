package th.co.dtac.mobile.rtr;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MainController {

    @RequestMapping("/")
    public String index() {
        return "Greetings Mobile RTR from Spring Boot!";
    }

}
