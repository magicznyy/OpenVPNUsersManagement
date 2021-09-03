package com.magiczny.DodanieUzytkownikaOpenVPN;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller

public class Controller {
    private UserRepo userRepo;

    //bez tego nie działa zapis do bazy
    @Autowired
    public Controller(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    //zapis do bazy
    @PostMapping("/save")
    public String saveDetails(@RequestParam("userName") String userName, @RequestParam("password") String password) {
        UserService userService = new UserService();
        userService.createTxt();
        User user = new User(userName,password);
        userRepo.save(user);

        return "viewDetails";
    }


    @GetMapping("/addUser")
    public String addUserForm() {
        return "addUserForm" ;
    }



}
