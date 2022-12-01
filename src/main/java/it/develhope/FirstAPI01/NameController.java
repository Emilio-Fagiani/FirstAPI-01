package it.develhope.FirstAPI01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NameController {


    @GetMapping(value = "/get")
    public String getRequest(){
       return "Emilio";
    }

    @PostMapping (value = "/post")
    public StringBuilder postRequest(){
        StringBuilder sb = new StringBuilder(getRequest());
        StringBuilder strReverse = sb.reverse();
        return strReverse;
    }
}




