public class Circulo extends Figura {

    double radio;


    public Circulo (double radio){

        this.radio = radio;
    }

    /*
     * usamos el quick solucion, para arreglar el erro que salia
     * al generar la herencia
     * 
     */
    @Override
    double calcular_area() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'calcular_area'");
        return Math.PI * radio * radio;

    }
    

}
