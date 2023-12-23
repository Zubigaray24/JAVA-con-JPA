package com.mycompany.jpaprueba.persistencia;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Materia;
import com.mycompany.jpaprueba.persistencia.exceptions.NonexistentEntityException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Se encarga de controlar cada una de las instancias de las JPA controller que tengamos*/

public class ControladoraPersistencia {
    /*Segundo paso: Creamos nuestra controladora de persistencia*/
    AlumnoJpaController AluJPA = new AlumnoJpaController();
    CarreraJpaController CarrJPA = new CarreraJpaController();
    MateriaJpaController MatJPA = new MateriaJpaController();

    public void crearAlumno(Alumno alumno) {
        AluJPA.create(alumno);
    }

    public void eliminarAlumno(int id) {
        try {
            AluJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarAlumno(Alumno alumno) {
        try {
            AluJPA.edit(alumno);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Alumno traerAlumno(int id) {
        return AluJPA.findAlumno(id);
    }

    public ArrayList<Alumno> traerListaAlumnos() {
        
        List<Alumno> lista = AluJPA.findAlumnoEntities();
        ArrayList<Alumno> resultado = new ArrayList<Alumno> (lista);
        
        return resultado;
    }

    //CARRERA
    
    public void crearCarrera(Carrera carrera) {
        
        CarrJPA.create(carrera);
    }

    public void eliminarCarrera(int id) {
        
        try {
            CarrJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarCarrera(Carrera carrera) {
        
        try {
            CarrJPA.edit(carrera);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Carrera traerCarrera(int id) {
        return CarrJPA.findCarrera(id);
    }

    public ArrayList<Carrera> traerListaCarreras() {
        List<Carrera> lista = CarrJPA.findCarreraEntities();
        ArrayList<Carrera> resultado = new ArrayList<>(lista);
        return resultado;
    }

    //MATERIA
    
    public void crearMateria(Materia materia) {
        MatJPA.create(materia);
    }

    public void eliminarMateria(int id) {
        try {
            MatJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void editarMateria(Materia materia) {
        try {
            MatJPA.edit(materia);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Materia traerMateria(int id) {
        return MatJPA.findMateria(id);
    }

    public ArrayList<Materia> traerListaMaterias() {
        List<Materia> lista = MatJPA.findMateriaEntities();
        ArrayList<Materia> resultado = new ArrayList<>(lista);
        return resultado;
    }

}
