package com.konzel.example7;

import com.konzel.example7.model.FormattedDateTime;
import com.konzel.example7.model.FormattedName;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Map;

@Controller
public class HelloController {
    private final ApplicationArguments applicationArguments;

    public HelloController(ApplicationArguments applicationArguments) {
        this.applicationArguments = applicationArguments;
    }

    @GetMapping("/")
    public String Root(Map<String, Object> model) {
        model.put("dateTime", new FormattedDateTime(LocalDateTime.now()));
        model.put("name", new FormattedName(applicationArguments.getSourceArgs()));
        return "hello";
    }
}
