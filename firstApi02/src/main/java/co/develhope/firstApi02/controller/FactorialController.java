package co.develhope.firstApi02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class FactorialController {

    private int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));

    }

    @GetMapping("/factorial")
    public String getFactorial(){
        int fact;
                int number =7;
        fact = factorial(number);
        return "Factorial of "+ number +" is: "+fact;

    }



}
