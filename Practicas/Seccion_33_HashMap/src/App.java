import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la verduleria");

        Map <String, Double> inventario = new HashMap<>();

        inventario.put("melon", 30.0);
        inventario.put("piña", 40.5);
        inventario.put("fresa", 50.5);
        inventario.put("jitomate", 30.0);
        inventario.put("naranja", 15.0);

        System.out.println("El inventario es: ");
        for ( String fruta : inventario.keySet()){ // key set agarra nombre
            System.out.println( fruta + ": $" + inventario.get(fruta)); // obtengo el precio
        }

        String frutaBuscada = "pera";

        //5:53:40

    }
}
