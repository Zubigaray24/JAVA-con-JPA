package com.mycompany.jpaprueba;

import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.Controladora;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.ArrayList;
import java.util.Date;


public class JpaPrueba {

    public static void main(String[] args) {
        Controladora control = new Controladora();  
        
        //Creo la lista de materias vacia
        ArrayList<Materia> listaMaterias = new ArrayList<>();
                
        //Creo la carrera y asociamos la lista a la carrera
        Carrera car = new Carrera("Profesor de matematicas", listaMaterias);
        
        //Guardamos la carrera en la base de datos
        control.crearCarrera(car);
        
        //Creamos las materias(todavia no estan asociadas a una carrera)
        Materia materia1 = new Materia("Matematicas", "Cuatrimestral", car);
        Materia materia2 = new Materia("Algebra", "Cuatrimestral", car);
        Materia materia3 = new Materia("Matematicas discretas", "Cuatrimestral", car);
        
        //Guardamos la carrera en la base de datos 
        control.crearMateria(materia1);
        control.crearMateria(materia2);
        control.crearMateria(materia3);
        
        //Agregamos las materias a la lista
        listaMaterias.add(materia1);
        listaMaterias.add(materia2);
        listaMaterias.add(materia3);
        
        //A la carrera le ponemos la lista CON las materias
        car.setListaMaterias(listaMaterias);
        
        //Aca editamos la carrera en la BD con las materias
        control.editarCarrera(car);
        
        Alumno alu = new Alumno("Carlos", "Villagran", new Date(  ), car);
        control.crearAlumno(alu);
        //control.eliminarAlumno(2);

        
        /*ArrayList<Alumno> alumnos = control.traerListaAlumnos();
        for(Alumno a : alumnos){
            System.out.println("El alumno es: "+ a.toString());
        }*/
    }
}
