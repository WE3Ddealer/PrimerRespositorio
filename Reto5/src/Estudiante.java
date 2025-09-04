import java.util.*;
import java.util.stream.Collectors;


public class Estudiante {
    public Set<Integer> generarHashSet(List<Integer> datos) {
        Set<Integer> hashSet = new HashSet<>(datos);
        // Elimina múltiplos de 3
        return hashSet.stream()
                .filter(n -> n % 3 != 0)
                .collect(Collectors.toSet());
    }


}
