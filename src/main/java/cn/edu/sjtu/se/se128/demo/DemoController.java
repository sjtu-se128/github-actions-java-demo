package cn.edu.sjtu.se.se128.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/health")
    public Health getHealth() {
        return new Health("OK");
    }
}
