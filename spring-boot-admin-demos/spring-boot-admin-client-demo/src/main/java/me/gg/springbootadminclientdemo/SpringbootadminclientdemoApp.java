package me.gg.springbootadminclientdemo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sam on 18-10-21.
 */
@Controller
@SpringBootApplication
public class SpringbootadminclientdemoApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootadminclientdemoApp.class, args);
    }

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        return "Hello, World!";
    }

}
