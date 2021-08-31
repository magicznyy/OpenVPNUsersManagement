package com.magiczny.DodanieUzytkownikaOpenVPN;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller


public class Controller {


    @GetMapping("/addUserForm")
    public String addUserForm() {
        return "addUserForm" ;
    }



}
