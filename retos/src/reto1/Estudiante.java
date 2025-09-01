package reto1;

public class Estudiante {
    private String nombre;
    private String correo;
    private int edad;
    private int semestre;

    public Estudiante(String nombre, String correo, int edad, int semestre){
        this.nombre = nombre;
        this.correo = correo;
        this.edad = edad;
        this.semestre = semestre;
    }

    public int getEdad() {
        return edad;
    }

    public int getSemestre() {
        return semestre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getNombre() {
        return nombre;
    }

}
