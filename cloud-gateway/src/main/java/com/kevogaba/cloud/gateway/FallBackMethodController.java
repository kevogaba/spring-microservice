package com.kevogaba.cloud.gateway;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallBackMethodController {

    @GetMapping("/userServiceFallBack")
    @HystrixCommand(fallbackMethod = "userServiceFallBackMethod")
    public String userServiceFallBackMethod() {
        return "User service is taking longer than expected." +
                "Please try again later.";
    }

    @GetMapping("/departmentServiceFallBack")
    @HystrixCommand(fallbackMethod = "departmentServiceFallBackMethod")
    public String departmentServiceFallBackMethod() {
        return "Department service is taking longer than expected." +
                "Please try again later.";
    }
}
