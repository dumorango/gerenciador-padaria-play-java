package controllers;

import models.Funcionario;

public class Login {

    public String username;
    public String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Funcionario validate() {
        return Funcionario.authenticate(username, password);
    }
}
