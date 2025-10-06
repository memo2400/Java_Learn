package interfaces;

// UNA INTERFAZ NO puede tener constructores
// le da felxibilidad al codigo, al poder usar muchas interfazes
// de dentro de las clases como delfin

public interface Comunicable {

    // NO PODEMOS TENER VARIABLES private no podemos hacer getters y setters
    // si podemos tener static, public y final.

    String grito = "ahh";

    // la clase que herede de sta interfaz, Se obliga a usar este metodo:
    void comunicarse();
}
