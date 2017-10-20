package net.sgoliver.android.recyclerview;

public class Alumno
{
    private String nombre;
    private String apellido;
    private String clase;
    private String curso;


    public Alumno(String nombre, String apellido, String clase, String curso){
        this.nombre = nombre;
        this.apellido = apellido;
        this.clase = clase;
        this.curso = curso;
    }

    public String getNombre(){
        return nombre;
    }
    public String getApellido() {return apellido;}
    public String getClase(){
        return clase;
    }
    public String getCurso() {return curso;}
}
