import java.util.*;
import java.util.stream.Collectors;


public class BatallaConjuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada Estudiante A
        System.out.println("Ingrese números para HashSet (separados por espacio):");
        List<Integer> datosA = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        // Cada estudiante genera su conjunto
        Estudiante estudianteA = new Estudiante();

        Set<Integer> conjuntoA = estudianteA.generarHashSet(datosA);

        // Unión final ordenada
        Set<Integer> union = new TreeSet<>(conjuntoA);

        // Mostrar resultado
        System.out.println("\n--- Números en la arena ---");
        union.forEach(n -> System.out.println("Número en arena: " + n));

        sc.close();
    }
}