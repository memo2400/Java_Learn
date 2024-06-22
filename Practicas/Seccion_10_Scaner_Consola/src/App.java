import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        //Usamos la clase Scaanner
        Scanner scanner = new Scanner (System.in);

        System.out.println("Welcome to my house enter");
        System.out.println("Chose one of the next drinks!!");
        System.out.println("1 - cafe");
        System.out.println("2 - agua");
        System.out.println("3 - limonada");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1: // Ahora la comparacion es con numeros                
                System.out.println("wow cafe");
                break; // este indica que salimos Si no lo pongo se ejecuta la sigueinte case
            
            case 2:
                System.out.println("H2o");
                break;
        
            case 3:
                System.out.println("lo mero bueno");
                break;

            default:
                System.out.println("opcion no válida! Hasta la vista Baby!!");
                break;
        }

        if (opcion <= 3)
        {
        System.out.println("Disfrute su bebida!!");
        }

        scanner.close(); // con ello se termina ara dejar de escuchar.


        //02:16:18 Fin

        
    }
}
