public class App {
    public static void main(String[] args) throws Exception {
        
        //
        int edad = 80;

        // (edad > 18) // ese caso funcionaba a medias
        if (edad > 18 && edad <= 60){
            System.out.println("Adelante!!");
        
        }
        else if (edad > 60){
            System.err.println("Ya no es prudente que entre!!");

        }

        else if (edad == 18){
            System.err.println("Esta justo hijo!!");

        }


        else // cualquier otra cosa
        {
            System.out.println("No puedes hijo!");
        }


        // min 02:02:36 fin

        /* Seccion_06_Switch =  se usa cuando hay muchos if else
        
        */

    }
}
