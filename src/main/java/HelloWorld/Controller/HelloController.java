package HelloWorld.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/Hello")
    public String index() {
        System.out.println("Succesfully launched Springboot controller");
        return "Greetings from Spring Boot!";
    }

}