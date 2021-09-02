package com.magiczny.DodanieUzytkownikaOpenVPN;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
public class User {

    public User() {
    }

    public User(String name) {

        this.name = name;
        /*this.certificateCA = certificateCA;
        this.certificateCert = certificateCert;
        this.privateKey = privateKey;
        this.tlsAuth = tlsAuth;
        this.registerDate = registerDate;

         */
   }

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long  id;

    private String name;
    /*private String certificateCA;
    private String certificateCert;
    private String privateKey;
    private String tlsAuth;
    private LocalDate registerDate;*/


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
/*
    public String getCertificateCA() {
        return certificateCA;
    }

    public void setCertificateCA(String certificateCA) {
        this.certificateCA = certificateCA;
    }

    public String getCertificateCert() {
        return certificateCert;
    }

    public void setCertificateCert(String certificateCert) {
        this.certificateCert = certificateCert;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    public String getTlsAuth() {
        return tlsAuth;
    }

    public void setTlsAuth(String tlsAuth) {
        this.tlsAuth = tlsAuth;
    }

    public LocalDate getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(LocalDate registerDate) {
        this.registerDate = registerDate;
    }

 */
}
