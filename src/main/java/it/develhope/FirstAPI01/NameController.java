package it.develhope.FirstAPI01;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ( value = "/name")
public class NameController {

    @GetMapping
    public String getName(){
        return "Emilio";
      
    @PostMapping
    public StringBuilder postRequest(){
        StringBuilder sb = new StringBuilder(getName());
        StringBuilder strReverse = sb.reverse();
        return strReverse;
    }
}
