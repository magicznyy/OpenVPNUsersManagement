package com.magiczny.DodanieUzytkownikaOpenVPN;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.File;
import java.io.IOException;

public class UserService {


    public UserService() {
    }

        public void createOVPNUser(String userName){
            String[] cmd = new String[]{"/home/servervpn/Pulpit/OpenVPNUsersManagement-master/src/main/resources/skrypt.sh", userName};
            String[] arg = new String[]{userName};
            ProcessBuilder pb = new ProcessBuilder(cmd);
            try {
                Process p = pb.start();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    public void deleteOVPNUser(String userName){
        String[] cmd = new String[]{"/home/servervpn/Pulpit/OpenVPNUsersManagement-master/src/main/resources/skrypt3.sh",userName};
        String[] arg = new String[]{userName};
        ProcessBuilder pb = new ProcessBuilder(cmd);
        try {
            Process p = pb.start();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
