package com.magiczny.DodanieUzytkownikaOpenVPN;

import java.time.LocalDate;


public class User {

    public User() {
    }

    public User(int id, String name, String certificateCA, String certificateCert, String privateKey, String tlsAuth, LocalDate registerDate) {
        this.id = id;
        this.name = name;
        this.certificateCA = certificateCA;
        this.certificateCert = certificateCert;
        this.privateKey = privateKey;
        this.tlsAuth = tlsAuth;
        this.registerDate = registerDate;
    }

    private int id;
    private String name;
    private String certificateCA;
    private String certificateCert;
    private String privateKey;
    private String tlsAuth;
    private LocalDate registerDate;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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
}
