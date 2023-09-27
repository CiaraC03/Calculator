package ie.atu.calculatorspringboot;

import org.springframework.web.bind.annotation.GetMapping;

public class RequestController {

    @GetMapping("/hello")
    public String hello()
    {
        return "Hello, World!";
    }



}
