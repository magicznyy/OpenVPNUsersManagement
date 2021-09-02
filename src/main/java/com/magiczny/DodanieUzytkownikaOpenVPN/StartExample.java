package com.magiczny.DodanieUzytkownikaOpenVPN;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartExample {

    private UserRepo userRepo;


    @EventListener(ApplicationReadyEvent.class)
    public void runExample() {
        User user = new User( "Jasiek");
        userRepo.save(user);

    }

    @Autowired
    public StartExample(UserRepo userRepo) {
        this.userRepo = userRepo;
    }



}
