package org.generation.dependencies_injection.service;

import org.generation.dependencies_injection.model.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private final List<Student> listadeestudiantes = new ArrayList<>();//esto es una lista de tipo de dato Student que va a servir para guardar los elemnetos de un objetp

    //Creamos un constructor para la creacion de objetos
    public StudentServiceImpl(){
        agregaEstudiante();//Lo unico que hace el constructor es uinvocar al metodo agregaEstudiante
    }

    @Override
    public void add(Student student) {//Recibimos un objeto por parammetro llamado student
        listadeestudiantes.add(student);//Agrega el objeto que se recibe por parametro
    }

    @Override
    public void delete(Student student) {
        listadeestudiantes.remove(student);
    }

    @Override
    public List<Student> all() {//metodo que retorna una lista de tipo Student
        return listadeestudiantes;
    }

    @Override
    public Student findById(String id) {//Como recibe un string como parametro
        return listadeestudiantes.get(Integer.parseInt(id));//Nuestro metodo get necesita un entero como parametro por eso al parametro id que es un entero se le tiene qu ehacer unj  parseo
    }

    private void agregaEstudiante(){
        listadeestudiantes.add(new Student("1",1,"Alan Mejia","Martinez", 1));
        listadeestudiantes.add(new Student("2",2,"Cristian Hernandez","Villegas", 2));
        listadeestudiantes.add(new Student("3",3,"Alan Mejia","Martinez", 3));
    }
}
