public class Animal {

    String nombre;
    int canPatas;
    int edad;

    /*
     * para que se quede quieto usamos static
     * llevara el conteo de animales instanciados con el ++;
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

    public static int getCantidadAnimales (){
        
        return ContadorAnimales; 

    }

    04:32:17
}
