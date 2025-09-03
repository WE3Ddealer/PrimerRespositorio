import java.util.*;
import java.util.stream.Collectors;

public class TesoroHashMap {


    public static Map<String, Integer> crearMapa(List<AbstractMap.SimpleEntry<String, Integer>> lista) {
        Map<String, Integer> mapa = new HashMap<>();
        for (AbstractMap.SimpleEntry<String, Integer> entry : lista) {
            mapa.putIfAbsent(entry.getKey(), entry.getValue());
        }
        return mapa;
    }

    public static Map<String, Integer> combinar(Map<String, Integer> mapa1, Map<String, Integer> mapa2) {
        Map<String, Integer> combinado = new HashMap<>(mapa1);
        combinado.putAll(mapa2); // Si hay conflicto, sobrescribe con Hashtable
        return combinado;
    }


    public static void imprimirMayusculas(Map<String, Integer> mapa) {
        mapa.entrySet().stream()
                .map(e -> new AbstractMap.SimpleEntry<>(e.getKey().toUpperCase(), e.getValue()))
                .forEach(e -> System.out.println("Clave: " + e.getKey() + " | Valor: " + e.getValue()));
    }

    public static void main(String[] args) {
        List<AbstractMap.SimpleEntry<String, Integer>> lista = Arrays.asList(
                new AbstractMap.SimpleEntry<>("oro", 5),
                new AbstractMap.SimpleEntry<>("plata", 3),
                new AbstractMap.SimpleEntry<>("oro", 7),
                new AbstractMap.SimpleEntry<>("diamante", 10)
        );

        Map<String, Integer> hashMap = crearMapa(lista);

        Hashtable<String, Integer> hashTable = new Hashtable<>();
        hashTable.put("plata", 8);
        hashTable.put("rubí", 4);
        hashTable.put("oro", 12);
        hashTable.put("esmeralda", 6);

        Map<String, Integer> combinado = combinar(hashMap, hashTable);
        imprimirMayusculas(combinado);
    }
}
