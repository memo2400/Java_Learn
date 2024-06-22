public class App {
    public static void main(String[] args) throws Exception {
        
        int contador = 9;

/*
 * El do entra a la condicion aunque sea una vez que no se cunopla la condicion, 
 * pero de alli ya no entra nuevamente
 * 
 */

        do {
            System.out.println("antes while");
            System.out.println(contador);

            contador ++;

        } while (contador <=5);

        System.out.println(contador);





        // 02:34:55 fin


    }
}
