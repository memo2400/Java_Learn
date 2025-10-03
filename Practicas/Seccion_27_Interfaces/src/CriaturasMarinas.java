public abstract class CriaturasMarinas {

    // al ser clase abstracta no se puede instanciar,
    // pero con el super si lo haremos

    String nombre;

    // cosntructor, no lleva el VOID ALERTAAAAAAAAAAAAAAAAA
    public CriaturasMarinas(String nombre){
        
        this.nombre = nombre;

    }

    // sobreescribe a las clases que se hereden de CriaturasMarinas
    abstract void nadar();

}
