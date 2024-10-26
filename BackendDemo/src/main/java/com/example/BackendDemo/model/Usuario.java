package com.example.BackendDemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;


    @Column(name = "document")
    private String document;
    
    
    @Column(name ="name")
    private String name;
    
    @Column(name = "email")
    private String email;

    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }
    
    
}
