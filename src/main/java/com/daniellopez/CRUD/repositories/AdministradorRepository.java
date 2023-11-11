package com.daniellopez.CRUD.repositories;

import com.daniellopez.CRUD.models.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AdministradorRepository extends JpaRepository<Administrador, Long> {

}
