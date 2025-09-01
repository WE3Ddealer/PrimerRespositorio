package carrera;

import java.util.Arrays;
import java.util.List;

public class Carril2 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5, 12, 7, 20, 3, 10);

        ResultadosCarril2 r = calcularMinimo(lista);
        System.out.println(r);
    }

    static ResultadosCarril2 calcularMinimo(List<Integer> lista) {
        ResultadosCarril2 res = new ResultadosCarril2();


        res.min = lista.stream().min(Integer::compare).get();


        res.cantidad = lista.size();

        return res;
    }
}
