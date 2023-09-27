package ie.atu.calculatorspringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello, World!";
    }

    @GetMapping("/greet/{name}")
    public String greetbyName(@PathVariable String name)
    {
        return "Hello," + name;
    }



}
