public class App {
    public static void main(String[] args) throws Exception {

        Animal anim = new Animal("elefante", 20);
        Gato gatito = new Gato("negor", 5);



        System.out.println("animal es: " + anim.nombre);
        System.out.println("animal es: " + gatito.nombre);

        System.out.println("emite el sonido " + gatito.HacerSonido());

        // 04:27:54

    }
}
