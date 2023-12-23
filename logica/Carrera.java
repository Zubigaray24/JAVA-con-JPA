package com.mycompany.jpaprueba.logica;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Carrera implements Serializable {
    
    @Id
    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private int id;
    
    @Basic
    private String nombre;
    
    @OneToMany(mappedBy="carreraEnlace")
    private ArrayList<Materia> listaMaterias;

    public Carrera() {
    }

    public Carrera(String nombre, ArrayList<Materia> listaMaterias) {

        this.nombre = nombre;
        this.listaMaterias = listaMaterias;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }   

    public Carrera(String nombre) {
        this.nombre = nombre;
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
    
    
}
