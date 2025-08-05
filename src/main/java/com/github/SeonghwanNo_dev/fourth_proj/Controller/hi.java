package com.github.SeonghwanNo_dev.fourth_proj.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class hi {

    @GetMapping("/")
    public String he()
    {
        return "hi";
    }
}
