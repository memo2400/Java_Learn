public class App {
    public static void main(String[] args) throws Exception {
        
        // estructuras que pueden tener valores del mismo tiempo en un solo nombre
        // se distribuyen en la memoria, se accede con indicie, matirces otro nombre

        // el numero entre corchetes es el numero de valores que tendra
        int [] numeros = new int[5]; 

        
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
    }
}

