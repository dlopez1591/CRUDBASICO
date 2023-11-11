package com.daniellopez.CRUD.DTOs;

import com.daniellopez.CRUD.models.Administrador;

public class AdministradorDTO {
    private long id;
    private String name;
    private String email;
    private String password;

    public AdministradorDTO(Administrador administrador){
        this.id = administrador.getId();
        this.name = administrador.getName();
        this.email = administrador.getEmail();
        this.password = administrador.getPassword();
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
