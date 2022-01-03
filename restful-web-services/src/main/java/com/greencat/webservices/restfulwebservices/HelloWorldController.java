package com.greencat.webservices.restfulwebservices;

import com.greencat.webservices.restfulwebservices.hello.HelloWorldBean;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello-word")
    public String helloWorld() {
        return "Hola mundo";
    }

    @GetMapping(path = "/hello-word-bean")
    public HelloWorldBean helloWorldBean() {
        return new HelloWorldBean("hola bean");
    }

    @GetMapping(path = "/hello-word-bean/path-in-variable/{name}")
    public HelloWorldBean helloWorldBeanPathVariable(@PathVariable String name) {
        return new HelloWorldBean(String.format("hola bean %s ",name));
    }
}
