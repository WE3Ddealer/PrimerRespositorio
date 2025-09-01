package carrera;

import java.util.Arrays;
import java.util.List;

public class Carril1 {
    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(5, 12, 7, 20, 3, 10);

        ResultadosCarril1 r = calcularMaximo(lista);
        System.out.println(r);
    }

    static ResultadosCarril1 calcularMaximo(List<Integer> lista) {
        ResultadosCarril1 res = new ResultadosCarril1();
        res.max = lista.stream().max(Integer::compare).get();
        res.cantidad = lista.size();

        return res;
    }
}