public class Animal {

    String nombre;
    int canPatas;
    int edad;

    /*
     * para que se quede quieto usamos static
     * llevara el conteo de animales instanciados con el ++;
     * 
     * Con el static podemos acceder a la funcion o dato desde fuera de 
     * la clase o funcion, esto sin necesidad de usar el get o setters
     */
    static int ContadorAnimales = 0;

    public Animal (String nombre, int edad){

        this.nombre = nombre;
        this.edad = edad;
        ContadorAnimales ++;
    }

    public String HacerSonido (){

        return "hacer sonido generico";

    }

    /*
     * Esto seria algo como un get Statico
     * 
     */
    public static int getCantidadAnimales (){
        
        return ContadorAnimales; 

    }

    //04:32:17
}
