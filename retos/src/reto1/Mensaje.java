package reto1;

import java.util.*;
import java.util.stream.Collectors;

public class Mensaje {

    public static void main(String[] args) {
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante("Juan Silva", "Juan.silva-c@mail.escuelaing.edu.co", 21, 5),
                new Estudiante("Kevin Cuitiva", "Kevin.Cuitiva-p@mail.escuelaing.edu.co", 22, 7)
        );

        String mensaje = estudiantes.stream()
                .map(e -> e.getNombre() + " estudiante de la escuela de "
                        + e.getSemestre() + " semestre de " + e.getEdad() + " años")
                .collect(Collectors.joining(" y "));

        String correos = estudiantes.stream()
                .map(Estudiante::getCorreo)
                .collect(Collectors.joining(" y "));

        System.out.println("¡Hola Bienvenidos!\n"
                + "Nosotros somos la pareja conformada por:\n"
                + mensaje + "\n"
                + "Nuestros correos institucionales son:\n"
                + correos);

    }
}

