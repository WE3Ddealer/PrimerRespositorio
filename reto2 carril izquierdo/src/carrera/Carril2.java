package carrera;

import java.util.Arrays;
import java.util.List;

public class Carril2 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5, 12, 7, 20, 3, 10);

        Resultados r = calcularMinimo(lista);
        System.out.println(r);
    }

    static Resultados calcularMinimo(List<Integer> lista) {
        Resultados res = new Resultados();


        res.min = lista.stream().min(Integer::compare).get();


        res.cantidad = lista.size();

        return res;
    }
}
