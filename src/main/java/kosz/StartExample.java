package kosz;


import com.magiczny.DodanieUzytkownikaOpenVPN.User;
import com.magiczny.DodanieUzytkownikaOpenVPN.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


//klasa testowa do sprawdzenia działania bazy danych
@Component
public class StartExample {

    private UserRepo userRepo;


    @EventListener(ApplicationReadyEvent.class)
    public void runExample() {
        User user = new User( "Jasiek","haslo");
        userRepo.save(user);
        String text;
        Iterable<User> all = userRepo.findAll();
        all.forEach(System.out::println);

    }

    @Autowired
    public StartExample(UserRepo userRepo) {
        this.userRepo = userRepo;
    }



}
