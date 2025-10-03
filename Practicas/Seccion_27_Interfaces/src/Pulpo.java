public class Pulpo extends CriaturasMarinas {

    int cantTentaculos;

    public Pulpo(String nombre, int cantTentaculos) {
        // SUPER debe ir arriba
        super(nombre);

        this.cantTentaculos = cantTentaculos;
        
    }

    @Override
    void nadar() {
        System.out.println(nombre + "esta nadando con sus tencalulos y hechando tinta");
    }





}
