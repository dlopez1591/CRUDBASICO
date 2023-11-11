package com.daniellopez.CRUD.controllers;

import com.daniellopez.CRUD.models.Administrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AdministradorController {
    @Autowired
    private Administrador administrador;


}
