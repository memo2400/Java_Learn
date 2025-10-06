import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la fiesta de super heroes");

        // Set<aqui va el tipo de dato>
        // Los set no se puede repetir
        Set<String> superHeroes = new HashSet<>();

        superHeroes.add("chapulin");
        superHeroes.add("batman");
        superHeroes.add("gatubela");
        superHeroes.add("hulk");
        superHeroes.add("Iron Man");

        // llego tarde
        superHeroes.add("superman");

        if (superHeroes.contains("chapulin")){
            System.out.println("chapulin si esta en la fiesta");
        }

        superHeroes.remove("batman");
        if (!superHeroes.contains("batman")){
            System.out.println("batman se ha ido");
        }

    }
}
