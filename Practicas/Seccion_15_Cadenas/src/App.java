public class App {
    public static void main(String[] args) throws Exception {
        
        // estructuras que pueden tener valores del mismo tiempo en un solo nombre
        // se distribuyen en la memoria, se accede con indicie, matirces otro nombre

        // el numero entre corchetes es el numero de valores que tendra
        int [] numeros = new int[4]; 

        
        // si no asigno valor a un elemento vale = 0
        numeros [0] = 1;
        numeros [1] = 5;
        numeros [2] = 4;
        numeros [3] = 5;

        // nos imprime puros caracteres locos
        //System.out.println(numeros);

        System.out.println(numeros[0]);

        // largi de la cadena
        System.out.println(numeros.length);

        // 02:46:25

        System.out.println("empieza for__");
        // con un for recooremoc cada uno
        // VS Code nos autorrellena el for , full hd
        // si uso "<=" va a dar error en el ultimo ciclo
        // este length a secas es de un array y el length.() es de strings
        for (int i = 0; i < numeros.length; i++) {
            
            // imprimo uno por uno
            System.out.println(numeros[i]);
        }

// ##########################################################//
        /*
         * otra forma de hacer los arrays
         */

         //  Aqui ya no usamos la instanciacion {0,1,2,3,4}
         int [] numeros_2 = {10,20,30,40,50};

        numeros_2 [2] = 31;


        int indice = 0;
        // for each, recorre cada unos de los elementos del array al stilo python
        // es mas resumido, pero no te da indice
        for (int k : numeros_2) {
            //aqui en el prin se pone directo el nombre de la variable
            System.out.println(k); 
            
            // para poner un indice
            System.out.println(indice); 
            indice ++;
        }

        // 02:55:15 fin

    }
}

