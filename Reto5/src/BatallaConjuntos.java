import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class BatallaConjuntos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Ingrese números para TreeSet (separados por espacio):");
        List<Integer> datosB = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());


        TreeSet estudianteB = new TreeSet();

        Set<Integer> conjuntoB = estudianteB.generarTreeSet(datosB);


        System.out.println("\n--- Números en la arena ---");
        conjuntoB.forEach(n -> System.out.println("Número en arena: " + n));

        sc.close();
    }

}
