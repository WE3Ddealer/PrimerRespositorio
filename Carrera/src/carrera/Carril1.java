package carrera;

import java.util.Arrays;
import java.util.List;

public class Carril1 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5, 12, 7, 20, 3, 10);

        Resultados r = calcularMaximo(lista);
        System.out.println(r);
    }

    static Resultados calcularMaximo(List<Integer> lista) {
        Resultados res = new Resultados();
        res.max = lista.stream().max(Integer::compare).get();
        res.cantidad = lista.size();

        return res;
    }
}