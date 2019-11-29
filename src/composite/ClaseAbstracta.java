package composite;

public abstract class ClaseAbstracta {
    String nombre;

    public ClaseAbstracta(String nombre) {
        this.nombre = nombre;
    }
    abstract public void nombre();
    abstract public void agregar(ClaseAbstracta a);
    abstract public void eliminar(ClaseAbstracta a);
    abstract public void masLargo();
    abstract public void elMasLargo(String nombre_Largo);
}
