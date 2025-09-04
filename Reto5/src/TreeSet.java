import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TreeSet {
    public Set<Integer> generarTreeSet(List<Integer> datos) {

        return datos.stream()
                .filter(n -> n % 5 != 0)
                .collect(Collectors.toCollection(java.util.TreeSet::new));
    }
}


