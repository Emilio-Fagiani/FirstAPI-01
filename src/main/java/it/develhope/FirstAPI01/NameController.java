package it.develhope.FirstAPI01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NameController {

    public String getRequest(){
        return "Emilio";
    }


    @GetMapping(value = "/get")
    public String name(){
       return getRequest();
    }

    @PostMapping (value = "/post")
    public StringBuilder postRequest(){
        StringBuilder sb = new StringBuilder(getRequest());
        StringBuilder strReverse = sb.reverse();
        return strReverse;
    }
}




