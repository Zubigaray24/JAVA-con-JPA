package com.mycompany.jpaprueba.logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Materia implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String nombre;
    private String tipo ;
    
    @ManyToOne
    private Carrera carreraEnlace;

    public Materia() {
    }

    public Materia(String nombre, String tipo, Carrera carrera) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.carreraEnlace = carrera;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
}
