package org.generation.dependencies_injection.controller;

import org.generation.dependencies_injection.model.Student;
import org.generation.dependencies_injection.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController
{

    private final StudentService studentService;

    public StudentController( @Autowired StudentService studentService )
    {
        this.studentService = studentService;
    }

    @GetMapping( "/student/{id}" )//Las llaves de id indican que va a recibir un parametro
    Student findById( @PathVariable( "id" ) String id )
    {
        int idDeEstudiantes = Integer.parseInt(id)-1;
        return studentService.findById(String.valueOf(idDeEstudiantes));
    }

}
