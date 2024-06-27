public class Rectangulo extends Figura {

    double lado_1;
    double lado_2;

    // constructor
    Rectangulo (double lado1, double lado2){

        this.lado_1 = lado1;
        this.lado_2 = lado2;
    }

    @Override
    double calcular_area() {
        // TODO Auto-generated method stub
        return lado_1 * lado_2;
    }

}

