public class App {
    public static void main(String[] args) throws Exception {
        
        String texto = "esto es texto";
        System.out.println(texto);

        //conocer tamaño
        int longitud_texto = texto.length();
        System.out.println(longitud_texto);

        char letra_numero = texto.charAt(0);  //0 en adelante
        System.out.println(letra_numero);

        String cortado = texto.substring(4, 9);
        System.out.println(cortado);

        
        casa(1);
        int calculo = casa(1);
        //System.out.println(suma);


    }

    static void casa (int i) {
        
        int suma = 5 + 10 + i;
    }
}
