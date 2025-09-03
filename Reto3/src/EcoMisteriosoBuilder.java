public class EcoMisteriosoBuilder {

    public static String ecoMisterioso(String mensaje) {
        StringBuilder sb = new StringBuilder();

        String result = java.util.stream.IntStream.range(0, 3)
                .mapToObj(i -> mensaje)
                .reduce((a, b) -> a + " " + b)
                .orElse("");

        sb.append(result);
        return sb.toString();
    }

    public static void main(String[] args) {
        java.util.function.Function<String, String> eco = EcoMisteriosoBuilder::ecoMisterioso;
        System.out.println(eco.apply("Hola"));
    }
}
