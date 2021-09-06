package com.magiczny.DodanieUzytkownikaOpenVPN;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class User {

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        this.date = LocalDate.now();
   }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long  id;

    private String name;
    private String password;
    private LocalDate date;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", date=" + date +
                '}';
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
