public class App {
    public static void main(String[] args) throws Exception {

        /*
         * palabra Sttic hace que sea metodo de clase o atributo de clase
         * esta no se necvesitara instanciar, ya que estara en todas las
         * partes del proyecto
         * 
         * 
         */
        Animal anim = new Animal("elefante", 20);
        Gato gatito = new Gato("negor", 5);



        System.out.println("animal es: " + anim.nombre);
        System.out.println("animal es: " + gatito.nombre);

        System.out.println("emite el sonido " + gatito.HacerSonido());

        /*
         * Para acceder a estas cosas de la clase se hace directo de la clase 
         * Animal y NO de la instancia "anim"
         */

        System.out.println("La cantidad de animales que tenemos es= " + Animal.ContadorAnimales);
        System.out.println("La cantidad de animales que tenemos es= " + Animal.getCantidadAnimales());

        System.out.println("Voy a la veterinaria " + Veterinaria.nombreVet);
    
        // 04:35:50 fin
    }
}
