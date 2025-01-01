package com.example.its;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
    @ResponseBody
    public String index() {
        return "<h1>Hello World</h1>";
    }

}
