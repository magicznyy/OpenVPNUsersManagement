package com.magiczny.DodanieUzytkownikaOpenVPN;

import javax.persistence.*;


@Entity
public class User {

    public User() {
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
   }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long  id;

    private String name;
    private String password;

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
