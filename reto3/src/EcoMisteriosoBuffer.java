public class EcoMisteriosoBuffer {

    public static String ecoMisterioso(String mensaje) {
        StringBuffer sb = new StringBuffer(mensaje);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {

        java.util.function.Function<String, String> eco = EcoMisteriosoBuffer::ecoMisterioso;
        System.out.println(eco.apply("Hola"));
    }
}