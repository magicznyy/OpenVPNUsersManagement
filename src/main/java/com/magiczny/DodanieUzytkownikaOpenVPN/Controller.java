package com.magiczny.DodanieUzytkownikaOpenVPN;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.MalformedURLException;

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
        userService.createOVPNUser(userName);
        User user = new User(userName,password);
        userRepo.save(user);

        return "index";
    }

    //usuniecie uzytkowika po nazwie
    @GetMapping("/delete")
    public String deleteUser(@RequestParam("userName") String userName) {

        Iterable<User> all = userRepo.findAll();

        for(User user: all)
        {

           if(user.getName().equals(userName))
           {
               UserService userService = new UserService();
               userService.deleteOVPNUser(userName);
               userRepo.deleteById(user.getId());
           }
        }
        return "index";
    }


    //pobieranie wszystkich uzytkowwnikow z bazy
    @ResponseBody
    @GetMapping("/getAll")
    public String getAll() {

        Iterable<User> all = userRepo.findAll();
        String view = new String();
        StringBuilder builder = new StringBuilder("<!DOCTYPE html >\n" +
                "\n" +
                "<html lang=\"en\">\n" +
                "\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "</head>\n" +
                "<body> <table>");
        for(User user: all)
        {
           builder.append("<tr><td>"+user.getName()+"</td><td>"+user.getDate().toString()+"</td></tr>");
        }
        builder.append("</table></body>");
        view = builder.toString();
        return view;

    }


    @RequestMapping("/addUser")
    public String addUserForm() {
        return "addUserForm" ;
    }

    @RequestMapping("/deleteUser")
    public String deleteUserForm() {
        return "deleteUserForm" ;
    }



}
