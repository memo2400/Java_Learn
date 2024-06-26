
/*
 * Aqui indicamos con extens, se hereda de Animal
 * necesitamos un constructor
 * 
 * La palabra super nos indica que estamos heredando esos parametros
 * 
 * aqui podemo ahorrarnos mucho codigo
 */

public class Gato extends Animal {


    public Gato(String nombre, int edad){

        super (nombre,edad);

    }

    //04:24:xx

    /*
     * El override me permite sobreescribir el metodo que se heredo
     * 
     */

    @Override
    public String HacerSonido (){

        return "Miau";

    }
}
