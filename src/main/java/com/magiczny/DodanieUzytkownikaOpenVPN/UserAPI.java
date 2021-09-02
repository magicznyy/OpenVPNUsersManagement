package com.magiczny.DodanieUzytkownikaOpenVPN;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserAPI {

    private List<User> users;

    public UserAPI() {
        users = new ArrayList<>();
    }
    





    @GetMapping("/all")
    public List<User> getAll(){
        return users;
    }


   /* @GetMapping
    public User getUserById(@RequestParam int index){
    return users.stream().filter(element -> element.getId() == index).findFirst();

    }*/


}
