package az.ingress.controller;

import az.ingress.service.CountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class CountController {

    private final CountService service;

    @GetMapping("/hello")
    public String addCount() {
       return service.incrementCount();
    }
}
