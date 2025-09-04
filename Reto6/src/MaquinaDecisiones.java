import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaquinaDecisiones {
    private static final Map<String, Runnable> comandos = new HashMap<>();

    static {

        comandos.put("BROMEAR", () -> System.out.println("La máquina ríe: ¿Por qué la RAM rompió con la CPU? Porque necesitaba espacio..."));
        comandos.put("GRITAR", () -> System.out.println("La máquina grita: ¡¡¡ALERTA DE STACK OVERFLOW!!!"));
        comandos.put("SUSURRAR", () -> System.out.println("La máquina susurra: Shhh... los bugs están dormidos."));
        comandos.put("ANALIZAR", () -> System.out.println("La máquina procesa: Analizando datos... resultado: ¡Eres increíble programando!"));
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

        System.out.println(" Bienvenido a la Máquina de Decisiones ");
        System.out.println("Comandos disponibles: BROMEAR, GRITAR, SUSURRAR, ANALIZAR");
        System.out.println("Escriba 'SALIR' para terminar.");

        do {
            System.out.print("\n Ingrese un comando: ");
            comando = sc.nextLine().trim().toUpperCase();
            if (!comando.equals("SALIR")) {
                ejecutarComando(comando);
            }
        } while (!comando.equals("SALIR"));

        System.out.println(" Máquina apagada. Hasta la próxima misión.");
        sc.close();
    }
}