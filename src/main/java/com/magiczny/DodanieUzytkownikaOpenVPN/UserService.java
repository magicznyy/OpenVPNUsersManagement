package com.magiczny.DodanieUzytkownikaOpenVPN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;

public class UserService {


    public UserService() {
    }

    //tworzenie txt, do ktorego wklejone zostana certy i klucze
    public void createTxt(){
        File file = new File("UserConfigFile.txt");
        boolean x = true;
        try {
            x = file.createNewFile();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public String getCACert(){

        return "CACert";
    }

    public String getPrivateKey(){

        return "key";
    }

    public String getTlsKey(){

        return "Tlskey";
    }

    public String getCert(){

        return "Cert";
    }


}
