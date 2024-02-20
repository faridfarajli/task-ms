package az.ingress.controller;

import az.ingress.entity.Count;
import az.ingress.service.CountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CountController {
    private final CountService countService;

    @GetMapping("/hello")
    public String addCount(){
       return countService.incrementCount();
    }
}
