public class App {
    public static void main(String[] args) throws Exception {
        // for (inicializacion, condicion, actualizacion)
        for(int i = 1; i <= 10; i++)        
        {
            System.out.println(i); // este imprime uno por linea
            //System.out.print(i); // este imprime todos en una sola linea
        }


        //puedo iniciar el valor j afuera
        int j;
        for(j = 1; j <= 8; j++)    //este bucle es mas lento    
        {
            System.out.println(j);             

            for (int k=1; k <= 4; k++) // esta bucle es mas rapido
            {
                System.out.println("Valor de k es:"); 
                System.out.println(k); 
            }

        }

        // imprimo valor que se quedo al final
        System.out.println("El valor final J es:");
        System.out.println(j); // termino en 9 porqur el ultimo j++ si se ejecuta

        // fin = 02:27:22

    }
}
