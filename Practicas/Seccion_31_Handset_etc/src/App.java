import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

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

        System.out.println(superHeroes);


        // X2 no se agregan los repetidos
        superHeroes.add("superman");
        superHeroes.add("superman");
        superHeroes.add("superman");

        if (superHeroes.isEmpty()){
            System.out.println("La fiesta acabo");
        }
        else{
            System.out.println("La fiesta aun no acaba, hay: "+ superHeroes.size() + " superheroes" );
        }

        System.out.println("Aun estan en la fiesta:");
        // For each pero la lista esta desornedana
        for (String superheroeIndividual : superHeroes){
            System.out.println(superheroeIndividual);
        }


        /// ###############################//#endregion

        // TREESET ordena alfabeticamente por default
        Set<String> carros = new TreeSet<>();

        carros.add("coche");
        carros.add("camion");
        carros.add("bocho");

        System.out.println("\n  Los carros son:");
        
        for (String carro : carros){
            System.out.println(carro);
        }

                /// ###############################//#endregion

        // LINKED ordena como los agregamos
        Set<String> vehiculos = new LinkedHashSet<>();

        vehiculos.add("coche");
        vehiculos.add("camion");
        vehiculos.add("bocho");

        System.out.println("\n  Los carros son (Link):");
        
        for (String carro : vehiculos){
            System.out.println(carro);
        }


    }
}
