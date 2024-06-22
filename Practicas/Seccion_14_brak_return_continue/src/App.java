public class App {
    public static void main(String[] args) throws Exception {
        
        int i; 

        for (i=1; i<=10; i++)
        {
            System.out.println(i);

            if (i == 4)
            {
                break; // esto nos corta el for, es otra condicion de forma directa
            }

            System.out.println(i);
        }

        System.out.println("Jjj");

        int j; 

        for (j=1; j<=10; j++)
        {
            System.out.println(j);

            if (j == 4)
            {
                // hace que ignore todo lo que esta abajo del for, pero el cilco continua en 5
                //continue;
                
                // hace un corte como brak peroo nos devuleve algo, es para las funciones
                return;
            }

            System.out.println(j);
        }
        // 02:41:00 fin

    }
}
