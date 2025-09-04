import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaquinaDecisiones {
    private static final Map<String, Runnable> comandos = new HashMap<>();

    static {
        comandos.put("SALUDAR", () -> System.out.println("La máquina dice: ¡Saludos, viajero del tiempo y del código!"));
        comandos.put("DESPEDIR", () -> System.out.println("La máquina dice: Que los bits te acompañen, hasta la próxima misión."));
        comandos.put("CANTAR", () -> System.out.println("La máquina canta: 01010101"));
        comandos.put("DANZAR", () -> System.out.println("La máquina gira y emite chispas: Girando en modo fiesta."));
    }

    public static void ejecutarComando(String comando) {
        switch (comando) {
            case "SALUDAR":
            case "DESPEDIR":
            case "CANTAR":
            case "DANZAR":
            case "BROMEAR":
            case "GRITAR":
            case "SUSURRAR":
            case "ANALIZAR":
                comandos.get(comando).run();
                break;
            default:
                System.out.println(" Comando no reconocido: " + comando);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String comando;

        System.out.println("🔮 Bienvenido a la Máquina de Decisiones 🔮");
        System.out.println("Comandos disponibles: SALUDAR, DESPEDIR, CANTAR, DANZAR, BROMEAR, GRITAR, SUSURRAR, ANALIZAR");
        System.out.println("Escriba 'SALIR' para terminar.");

        do {
            System.out.print("\n Ingrese un comando: ");
            comando = sc.nextLine().trim().toUpperCase(); // convertir a mayúsculas
            if (!comando.equals("SALIR")) {
                ejecutarComando(comando);
            }
        } while (!comando.equals("SALIR"));

        System.out.println("✅ Máquina apagada. Hasta la próxima misión.");
        sc.close();
    }
}
