public class App {
    public static void main(String[] args) throws Exception {
        
        int contador = 1;

        while (contador <=5) {
            System.out.println(contador);

            //Actualizaicon de variable , si no pongo eso se queda el buble infinito
            // si se queda infinito se muere la PC
            contador ++;
            
        }

        // llego hasta el 6 porque el ultimo ++; si se ejecuto
        System.out.println(contador);


        // 02:32:37 fin

    }
}
