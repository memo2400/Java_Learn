import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la fiesta de super heroes");

        // List<aqui va el tipo de dato>
        // ESTE ES EFICIENTE PARA EL GET Y SET , pero no para modificar, cando tenemos miles de datos
        List<String> superHeroes = new ArrayList<>();

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

        // Se va uno, empieza acontar del  0 1 2 ,,etc
        superHeroes.remove(3);
        if (!superHeroes.contains("hulk")){
            System.out.println("hulk se ha ido");
        }

        System.out.println("Hay un superheroe muy ebrio este es: " + superHeroes.get(0));

        // Cambiar un elemento de la lista
        superHeroes.set(4, "Tony Start");
        System.out.println("Hay un superheroe que mostró su identidad: " + superHeroes.get(4));


        // X2 SII se agregan los repetidos
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
        // For each AHORA la lista esta ordenada conforme se agregaron
        for (String superheroeIndividual : superHeroes){
            System.out.println(superheroeIndividual);
        }

        System.out.println(superHeroes);


        /// ###############################//#endregion

        // Es bueno para modificar facilemtne muchos datos
        List<String> carros = new LinkedList<>();

        carros.add("coche");
        carros.add("camion");
        carros.add("bocho");

        System.out.println("\n  Los carros son:");
        
        for (String carro : carros){
            System.out.println(carro);
        }

        /// ###############################//#endregion

        // si tenemo multrithread, se agrea sincronizado.
        List<String> carros2 = new Vector<>();


    }
}
