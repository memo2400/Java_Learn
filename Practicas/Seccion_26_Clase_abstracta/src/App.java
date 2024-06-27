public class App {
    public static void main(String[] args) throws Exception {
        
        Circulo redondo = new Circulo(40);
        Rectangulo Recti = new Rectangulo(22, 16);


        /*
         * las herededas pueden hacer el metodo 
         * de clase principal
         */
        redondo.imprimir_informacion();
        Recti.imprimir_informacion();



        System.out.println(redondo.calcular_area());
        System.out.println(Recti.calcular_area());


        //04:43:40 fin


    }
}
